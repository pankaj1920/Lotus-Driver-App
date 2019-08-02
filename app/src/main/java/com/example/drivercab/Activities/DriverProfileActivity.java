package com.example.drivercab.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.drivercab.R;

public class DriverProfileActivity extends AppCompatActivity {
 ConstraintLayout constraintdriverdoc;
 Toolbar toolprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_profile);
        constraintdriverdoc=findViewById(R.id.constraintdriverdoc);
        toolprofile=findViewById(R.id.toolprofile);
        setSupportActionBar(toolprofile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        constraintdriverdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DriverProfileActivity.this,DriverDocumentsActivity.class);
                startActivity(intent);
            }
        });
    }
}
