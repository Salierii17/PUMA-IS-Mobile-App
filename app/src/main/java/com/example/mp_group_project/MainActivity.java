package com.example.mp_group_project;

import static android.app.PendingIntent.getActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mp_group_project.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        View root = binding.getRoot();
        BottomNavigationView navView = findViewById(R.id.nav_view);
        View nav_home = findViewById(R.id.navigation_home);
        NavController navController = Navigation.findNavController(this, R.id.central_fragment);

        nav_home.setOnClickListener(v -> {
            navController.navigate(R.id.action_structureFragment_to_homeFragment);
        });
        NavigationUI.setupWithNavController(binding.navView, navController);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_profile, R.id.navigation_schedule, R.id.navigation_options,
                R.id.navigation_structure).build();


    }


}
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

//        FloatingActionButton fab = findViewById(R.id.add_something);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });