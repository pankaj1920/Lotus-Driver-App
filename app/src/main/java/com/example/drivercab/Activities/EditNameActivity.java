package com.example.drivercab.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.drivercab.R;

public class EditNameActivity extends AppCompatActivity {
Toolbar tooll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_name);
        tooll=findViewById(R.id.tooll);
        setSupportActionBar(tooll);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

