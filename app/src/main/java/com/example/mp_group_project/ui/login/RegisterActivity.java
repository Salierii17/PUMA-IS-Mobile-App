package com.example.mp_group_project.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_group_project.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;


public class RegisterActivity extends AppCompatActivity {
    private Button GetStarted;

    private FirebaseAuth firebaseAuth;

    EditText FullName, StudentID, Batch, Division, Birthday, Gender, Email, Password, ConfirmPassword;
    FirebaseFirestore firebaseFirestore;
    String userid;
    FirebaseDatabase firebaseDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        GetStarted = findViewById(R.id.getstarted);
        firebaseAuth = FirebaseAuth.getInstance();
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finpro-85f25-default-rtdb.asia-southeast1.firebasedatabase.app/");
        FullName = findViewById(R.id.et_name);
        StudentID = findViewById(R.id.et_sid);
        Batch = findViewById(R.id.et_batch);
        Division = findViewById(R.id.et_division);
        Birthday = findViewById(R.id.birthday1);
        Gender = findViewById(R.id.gender1);
        Email = findViewById(R.id.email1);
        Password = findViewById(R.id.password1);
        ConfirmPassword = findViewById(R.id.confirmpass1);


        GetStarted.setOnClickListener(v -> {

            String fullName = FullName.getText().toString();
            String studentId = StudentID.getText().toString();
            String batch = Batch.getText().toString();
            String division = Division.getText().toString();
            String birthday = Birthday.getText().toString();
            String gender = Gender.getText().toString();
            String email = Email.getText().toString();
            String password = Password.getText().toString();
            String confirmPass = ConfirmPassword.getText().toString();


            if (fullName.isEmpty()) {
                FullName.setError("Input your Full Name correct");
                return;
            }
            if (studentId.isEmpty()) {
                StudentID.setError("Input your Student ID correct");
                return;
            }
            if (batch.isEmpty()) {
                Batch.setError("Input your Batch correct");
                return;
            }
            if (division.isEmpty()) {
                Division.setError("Input your Division correct");
                return;
            }
            if (birthday.isEmpty()) {
                Birthday.setError("Input your Birthday correct");
                return;
            }
            if (gender.isEmpty()) {
                Gender.setError("Gender must be selected");
                return;
            }

            if (email.isEmpty()) {
                Email.setError("Input your Email Address correct");
                return;
            }
            if (password.isEmpty()) {
                Password.setError("Input your Password correct");
                return;
            }
            if (confirmPass.isEmpty()) {
                ConfirmPassword.setError("Input your Confirm Password correct");
                return;
            }
            if (!password.equals(confirmPass)) {
                ConfirmPassword.setError("Password and confirm password are not the same");

            }

            registerUser(email, password);
        });
    }
    private void registerUser(String email, String password) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
//                        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finpro-85f25-default-rtdb.asia-southeast1.firebasedatabase.app/");
                        String Uid = firebaseAuth.getUid();
                        String fullName = FullName.getText().toString();
                        String studentId = StudentID.getText().toString();
                        String batch = Batch.getText().toString();
                        String division = Division.getText().toString();
                        String birthday = Birthday.getText().toString();
                        String gender = Gender.getText().toString();
//                        String email = Email.getText().toString();
//                        String password = Password.getText().toString();
//                        String confirmPass = ConfirmPassword.getText().toString();
                        DatabaseReference usersReference = databaseReference.child("users").child(Uid);
                        usersReference.setValue(new User(fullName, studentId, batch, division, birthday, gender));
                        startActivity(intent);
                    } else {
                        Toast.makeText(this, "Registration failed", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}

