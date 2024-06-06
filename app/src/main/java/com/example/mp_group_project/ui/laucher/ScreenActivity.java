package com.example.mp_group_project.ui.laucher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.mp_group_project.MainActivity;
import com.example.mp_group_project.R;
import com.example.mp_group_project.ui.guest.GuestActivity;
import com.example.mp_group_project.ui.login.LoginActivity;

public class ScreenActivity extends AppCompatActivity {
    Button btnPuma,btnSystemites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        btnPuma = findViewById(R.id.buttonpuma);
        btnPuma.setOnClickListener(v ->  {
                Intent Login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivities(new Intent[]{Login});
        });
        btnSystemites = findViewById(R.id.btn_systemites);
        btnSystemites.setOnClickListener(v -> {
            Intent Main = new Intent(getApplicationContext(), GuestActivity.class);
            startActivities(new Intent[]{Main});
        });

    }
}