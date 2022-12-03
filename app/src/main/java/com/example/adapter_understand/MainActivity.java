package com.example.adapter_understand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.adapter_understand.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegis.setOnClickListener( v -> {
            registerUser();
        });

    }

    private void registerUser() {
        String name = binding.name.getText().toString().trim();
        String email = binding.email.getText().toString().trim();
        String program = binding.spinner.getSelectedItem().toString();

        if (name.isEmpty()) {
            binding.name.setError("Name field must be filled");
            return;
        }

        if (email.isEmpty()) {
            binding.email.setError("Email field must be filled");
            return;
        }

        User user = new User(name, email, program);
        User.userList.add(user);

        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() { //or onResume
        super.onRestart();
        clearFields();
    }

    private void clearFields() {
        binding.name.setText("");
        binding.email.setText("");
    }
}