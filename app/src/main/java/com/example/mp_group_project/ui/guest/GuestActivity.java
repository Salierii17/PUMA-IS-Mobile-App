package com.example.mp_group_project.ui.guest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.example.mp_group_project.R;
import com.example.mp_group_project.databinding.ActivityGuestBinding;
import com.example.mp_group_project.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class GuestActivity extends AppCompatActivity {
    private ActivityGuestBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        binding = ActivityGuestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        View root = binding.getRoot();
        BottomNavigationView navView = findViewById(R.id.guest_nav_view);
        View nav_home = findViewById(R.id.guest_nav_view);
        NavController navController = Navigation.findNavController(this, R.id.central_fragment);

        nav_home.setOnClickListener(v -> {
            navController.navigate(R.id.action_structureFragment_to_homeFragment);
        });
        NavigationUI.setupWithNavController(binding.guestNavView, navController);

//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_profile, R.id.navigation_schedule, R.id.navigation_options,
//                R.id.navigation_structure).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

    }
    }