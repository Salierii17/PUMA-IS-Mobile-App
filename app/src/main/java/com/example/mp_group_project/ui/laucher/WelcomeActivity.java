package com.example.mp_group_project.ui.laucher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.mp_group_project.R;
import com.example.mp_group_project.ui.login.LoginActivity;

public class WelcomeActivity extends AppCompatActivity {
    FrameLayout Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Next = findViewById(R.id.next);

        Next.setOnClickListener(v -> {
            Intent NextButton = new Intent(getApplicationContext(), LoginActivity.class);
            startActivities(new Intent[]{NextButton});
        });
    }
}