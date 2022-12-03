package com.example.adapter_understand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.adapter_understand.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {

    private ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //This is simple way to show list view
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, User.userList);

        //THis is the way to make a custom adapter
        ArrayAdapter adapter = new UserAdapter(this, R.layout.row_user_layout);
        binding.list.setAdapter(adapter);
    }
}