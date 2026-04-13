package com.example.ise1_123;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labs);
    }

    public void openLab(View v)
    {
        String lab = v.getTag().toString();

        Intent intent = new Intent(LabsActivity.this, LabDetailActivity.class);
        intent.putExtra("labNumber", lab);

        startActivity(intent);
    }
}