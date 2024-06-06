package com.example.mp_group_project.ui.profile;

import static android.app.Activity.RESULT_OK;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.example.mp_group_project.data.SharedViewModel;
import com.example.mp_group_project.databinding.FragmentProfileBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.Arrays;
import java.util.UUID;


public class ProfileFragment extends Fragment {

    private static final int REQUEST_CODE = 1;
    private StorageReference mStorage;
    public Uri imagesUrl;
    private FragmentProfileBinding binding;
    private DatabaseReference reference;
    private FirebaseAuth firebaseAuth;
    private boolean isEditing = false;

    private final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
                if (isGranted) {
                    launchImageSelection();
                } else {
                    // Permission is denied, handle accordingly
                    Toast.makeText(getContext(), "Permission denied", Toast.LENGTH_SHORT).show();
                }
            });

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProfileViewModel profileViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);

        // Initialize Firebase components
        reference = FirebaseDatabase.getInstance().getReference();
        mStorage = FirebaseStorage.getInstance().getReference();
        firebaseAuth = FirebaseAuth.getInstance();
        binding = FragmentProfileBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();

        binding.btnAddPp.setOnClickListener(v -> {
            requestStoragePermission();
        });

        if (firebaseAuth.getCurrentUser() != null) {
            String userId = firebaseAuth.getCurrentUser().getUid();
            readData(userId);
        } else {
            Toast.makeText(getContext(), "User not authenticated", Toast.LENGTH_SHORT).show();
        }
        return root;
    }

    private void requestStoragePermission() {
        requestPermissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE);
    }

    private void launchImageSelection() {
        Intent i = new Intent(Intent.ACTION_PICK);
        i.setType("image/*");
        startActivityForResult(i, REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imagesUrl = data.getData();
            Glide.with(requireContext())
                    .load(imagesUrl)
                    .circleCrop() // Apply circular transformation
                    .into(binding.profilePicture);
            uploadPicture();
            loadCircularImage(imagesUrl.toString(), binding.profilePicture);
        }
    }

    private void uploadPicture() {
        final ProgressDialog pd = new ProgressDialog(getContext());
        pd.setTitle("Uploading Image...");
        pd.show();
        final String randomKey = UUID.randomUUID().toString();
        StorageReference riversRef = mStorage.child("images/" + randomKey);

        riversRef.putFile(imagesUrl)
                .addOnSuccessListener(taskSnapshot -> {
                    pd.dismiss();
                    // Get the download URL asynchronously
                    taskSnapshot.getMetadata().getReference().getDownloadUrl()
                            .addOnSuccessListener(uri -> {
                                String imageUrl = uri.toString();
                                // Save the image URL to the database
                                saveImageUrlToDatabase(imageUrl);

                                // Update the UI and show a success message
                                SharedViewModel sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
                                sharedViewModel.setImageUrl(imageUrl);
                                Snackbar.make(requireView(), "Image uploaded successfully", Snackbar.LENGTH_LONG).show();
                            })
                            .addOnFailureListener(e -> {
                                // Handle failure to get download URL
                                Toast.makeText(getContext(), "Failed to get download URL", Toast.LENGTH_LONG).show();
                            });
                })
                .addOnFailureListener(e -> {
                    // Handle unsuccessful uploads
                    pd.dismiss();
                    Toast.makeText(getContext(), "Failed to upload", Toast.LENGTH_LONG).show();
                })
                .addOnProgressListener(snapshot -> {
                    // Handle progress updates here
                    double progress = (100.0 * snapshot.getBytesTransferred()) / snapshot.getTotalByteCount();
                    pd.setMessage("Percentage " + (int) progress + "%");
                });
    }

    private void saveImageUrlToDatabase(String imageUrl) {
        // Get the UID of the currently authenticated user
        if (firebaseAuth.getCurrentUser() != null) {
            String userId = firebaseAuth.getCurrentUser().getUid();

            // Reference to the user's data in the database
            DatabaseReference userReference = FirebaseDatabase.getInstance().getReference("users").child(userId);

            // Save the image URL to the 'image' node in the user's data
            userReference.child("image").setValue(imageUrl)
                    .addOnSuccessListener(aVoid -> {
//                        Toast.makeText(getContext(), "Image URL saved to database", Toast.LENGTH_SHORT).show();
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(getContext(), "Failed to save image URL to database", Toast.LENGTH_LONG).show();
                    });
        } else {
            // Handle the case where the user is not authenticated
            Toast.makeText(getContext(), "User not authenticated", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void readData(String userID) {
        reference = FirebaseDatabase.getInstance().getReference("users").child(userID);
//        userReference = reference; // Save the reference for later use
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    // Get the data from the snapshot
                    String imageUrl = String.valueOf(snapshot.child("image").getValue());
                    loadCircularImage(imageUrl, binding.profilePicture);
                    String fullName = String.valueOf(snapshot.child("fullName").getValue());
                    String studentId = String.valueOf(snapshot.child("studentId").getValue());
                    String batch = String.valueOf(snapshot.child("batch").getValue());
                    String division = String.valueOf(snapshot.child("division").getValue());
                    String dob = String.valueOf(snapshot.child("birthday").getValue());
                    String gender = String.valueOf(snapshot.child("gender").getValue());

                    if (!isEditing) {
                        Glide.with(requireContext()).load(imageUrl).into(binding.profilePicture);
                        binding.etName.setText(fullName);
                        binding.etSid.setText(studentId);
                        binding.etBatch.setText(batch);
                        binding.etDivision.setText(division);
                        binding.etDob.setText(dob);
                        binding.etGender.setText(gender);
                    }
                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), "Read data failed: " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // Add a focus change listener to EditText fields to track edits
        for (EditText editText : Arrays.asList(binding.etName, binding.etSid, binding.etBatch, binding.etDivision, binding.etDob, binding.etGender)) {
            editText.setOnFocusChangeListener((v, hasFocus) -> {
                if (!hasFocus) {
                    isEditing = false;
                }
            });
        }

        // Add a click listener to the update button
        binding.btnConfirm.setOnClickListener(v -> {
            // Update the data in the database when the button is clicked
            updateData("fullName", binding.etName.getText().toString());
            updateData("StudentId", binding.etSid.getText().toString());
            updateData("batch", binding.etBatch.getText().toString());
            updateData("division", binding.etDivision.getText().toString());
            updateData("birthday", binding.etDob.getText().toString());
            updateData("gender", binding.etGender.getText().toString());
        });
    }

    private void loadCircularImage(String imageUrl, ImageView imageView) {
        Glide.with(requireContext())
                .load(imageUrl)
                .circleCrop()
                .into(imageView);
    }


    private void updateData(String field, String value) {
        // Update the specified field in the database
        reference.child(field).setValue(value)
                .addOnSuccessListener(aVoid -> Toast.makeText(getContext(), "Update successful", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(getContext(), "Update failed: " + e.getMessage(), Toast.LENGTH_SHORT).show());
    }


}
