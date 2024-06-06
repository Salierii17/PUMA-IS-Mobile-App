package com.example.mp_group_project.ui.Information;

import static android.app.Activity.RESULT_OK;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mp_group_project.data.SharedViewModel;
import com.example.mp_group_project.databinding.FragmentAddInformationBinding;
import com.example.mp_group_project.ui.profile.ProfileViewModel;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.Arrays;
import java.util.UUID;


public class AddInformationFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private static final int REQUEST_CODE = 1;
    private StorageReference mStorage;
    public Uri imagesUrl;
    private FragmentAddInformationBinding binding;
    private DatabaseReference reference;
    private FirebaseAuth firebaseAuth;
    private boolean isEditing = false;
    private long nextId = 1; 

    private final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
                if (isGranted) {
                    launchImageSelection();
                } else {
                    Toast.makeText(getContext(), "Permission denied", Toast.LENGTH_SHORT).show();
                }
            });

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProfileViewModel profileViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);

        reference = FirebaseDatabase.getInstance().getReference().child("information");
        mStorage = FirebaseStorage.getInstance().getReference();
        firebaseAuth = FirebaseAuth.getInstance();
        DatabaseReference getImage = reference.child("image");
        binding = FragmentAddInformationBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        String postId = reference.push().getKey();

        binding.btnAddPicture.setOnClickListener(v -> {
            requestStoragePermission();
        });

        if (firebaseAuth.getCurrentUser() != null) {

            readData();
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
            binding.imageInformation.setImageURI(imagesUrl);
            uploadPicture();
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
                    taskSnapshot.getMetadata().getReference().getDownloadUrl()
                            .addOnSuccessListener(uri -> {
                                String imageUrl = uri.toString();
                                saveImageUrlToDatabase(imageUrl);

                                SharedViewModel sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
                                sharedViewModel.setImageUrl(imageUrl);
                                Snackbar.make(requireView(), "Image uploaded successfully", Snackbar.LENGTH_LONG).show();
                            })
                            .addOnFailureListener(e -> {
                                Toast.makeText(getContext(), "Failed to get download URL", Toast.LENGTH_LONG).show();
                            });
                })
                .addOnFailureListener(e -> {
                    pd.dismiss();
                    Toast.makeText(getContext(), "Failed to upload", Toast.LENGTH_LONG).show();
                })
                .addOnProgressListener(snapshot -> {
                    double progress = (100.0 * snapshot.getBytesTransferred()) / snapshot.getTotalByteCount();
                    pd.setMessage("Percentage " + (int) progress + "%");
                });

    }

    private void saveImageUrlToDatabase(String imageUrl) {
        if (firebaseAuth.getCurrentUser() != null) {
            DatabaseReference userReference = reference;

            userReference.child("image").setValue(imageUrl)
                    .addOnSuccessListener(aVoid -> {
                        nextId++;
                        userReference.child("id").setValue(nextId)
                                .addOnSuccessListener(aVoid1 -> {
                                    updateData("topic", binding.etTopic.getText().toString());
                                    updateData("description", binding.etDescription.getText().toString());

                                    Toast.makeText(getContext(), "Image and information uploaded successfully", Toast.LENGTH_LONG).show();
                                });
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(getContext(), "Failed to save image URL to database", Toast.LENGTH_LONG).show();
                    });
        } else {
            Toast.makeText(getContext(), "User not authenticated", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void readData() {
        String random = UUID.randomUUID().toString();

        reference = FirebaseDatabase.getInstance().getReference("information").child(random);
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                nextId = snapshot.getChildrenCount() + 1;
                updateData("id", String.valueOf(nextId));
                String imagesurl = String.valueOf(snapshot.child("image").getValue());
                String fullName = String.valueOf(snapshot.child("fullName").getValue());
                String studentId = String.valueOf(snapshot.child("studentId").getValue());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), "Read data failed: " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        for (EditText editText : Arrays.asList(binding.etTopic, binding.etDescription)) {
            editText.setOnFocusChangeListener((v, hasFocus) -> {
                if (!hasFocus) {
                    isEditing = false;
                }
            });
        }

        binding.btnUpload.setOnClickListener(v -> {
            updateData("topic", binding.etTopic.getText().toString());
            updateData("description", binding.etDescription.getText().toString());
        });
    }

    private void updateData(String field, String value) {
        reference.child(field).setValue(value)
                .addOnSuccessListener(aVoid -> Toast.makeText(getContext(), "Update successful", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(getContext(), "Update failed: " + e.getMessage(), Toast.LENGTH_SHORT).show());
    }

    // TODO: Rename and change types and number of parameters
    public static AddInformationFragment newInstance(String param1, String param2) {
        AddInformationFragment fragment = new AddInformationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

}