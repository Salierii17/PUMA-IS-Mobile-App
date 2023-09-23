package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        e1 = findViewById(R.id.input_text);
        t1 = findViewById(R.id.result);

    b1.setOnClickListener(v -> {
        String inputName = e1.getText().toString();
        Toast.makeText(this, "Hello "+ inputName, Toast.LENGTH_SHORT).show();
    });
    }
}