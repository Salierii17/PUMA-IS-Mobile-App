package com.example.mp_group_project.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.example.mp_group_project.R;
import com.example.mp_group_project.data.SharedViewModel;
import com.example.mp_group_project.databinding.FragmentHomeBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    DatabaseReference reference;
    FirebaseAuth firebaseAuth;
    SharedViewModel sharedViewModel;
    private boolean isExpanded = false;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        reference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finpro-85f25-default-rtdb.asia-southeast1.firebasedatabase.app/users");
        firebaseAuth = FirebaseAuth.getInstance();
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        if (firebaseAuth.getCurrentUser() != null) {
            String userId = firebaseAuth.getCurrentUser().getUid();
            readData(userId);
        } else {
            Toast.makeText(getContext(), "User not authenticated", Toast.LENGTH_SHORT).show();
        }

        sharedViewModel = new ViewModelProvider(this).get(SharedViewModel.class);


        sharedViewModel.getImageUrl().observe(getViewLifecycleOwner(), imageUrl -> {
            Log.d("HomeFragment", "Image URL changed: " + imageUrl);

            Glide.with(this).load(imageUrl).into(binding.homeProfilePicture);
        });

        binding.seeAll.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_homeFragment_to_informationFragment);
        });
        binding.btnMain.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_homeFragment_to_addInformationFragment);
        });
        binding.btnMotivational.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_homeFragment_to_motivationalFragment);

        });
        binding.btnAspiration.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_homeFragment_to_aspirationFragment);

        });
        binding.btnAspiration.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_homeFragment_to_aspirationFragment);
        });
        binding.btnAppreciation.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_homeFragment_to_appreciationFragment);

        });
        binding.structurePumais.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_homeFragment_to_structureFragment);
        });


        return root;

    }

    private void shrinkFab() {
        isExpanded = !isExpanded;
    }

    private void expandFab() {
    }


    private void readData(String userID) {
        reference = FirebaseDatabase.getInstance().getReference("users").child(userID);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    String imagesurl = String.valueOf(snapshot.child("image").getValue());
                    String fullName = String.valueOf(snapshot.child("fullName").getValue());
                    if (binding != null) {
                        Glide.with(requireContext())
                                .load(imagesurl)
                                .circleCrop()
                                .into(binding.homeProfilePicture);
                        binding.tvUsername.setText(fullName);
                    } else {
                        Log.e("HomeFragment", "Binding or TextView is null");
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), "Read data failed: " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}


//        binding.btnMain.setOnClickListener(v -> {
//            if (isExpanded){
//                shrinkFab();
//            }else{
//                expandFab();
//            }
//        });