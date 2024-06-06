package com.example.mp_group_project.ui.laucher;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_group_project.R;


public class LaucherActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laucher);
        frameLayout = findViewById(R.id.imageView);

        frameLayout.setOnClickListener(v ->  {
                Intent Welcome = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivities(new Intent[]{Welcome});
        });
    }
}