package com.example.input_control;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioButton radioJava, radioAndroid;
    CheckBox checkCoding, checkDesign;
    Spinner spinnerCountry;
    ToggleButton toggleUpdates;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioJava = findViewById(R.id.radioJava);
        radioAndroid = findViewById(R.id.radioAndroid);
        checkCoding = findViewById(R.id.checkCoding);
        checkDesign = findViewById(R.id.checkDesign);
        spinnerCountry = findViewById(R.id.spinnerCountry);
        toggleUpdates = findViewById(R.id.toggleUpdates);
        btnRegister = findViewById(R.id.btnRegister);

        String[] countries = {"India", "USA", "Canada", "UK"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                countries
        );

        spinnerCountry.setAdapter(adapter);

        btnRegister.setOnClickListener(v -> {

            String course = radioJava.isChecked() ? "Java" : "Android";

            String skills = "";

            if (checkCoding.isChecked()) skills += "Coding ";
            if (checkDesign.isChecked()) skills += "Design ";

            String country = spinnerCountry.getSelectedItem().toString();

            String updates = toggleUpdates.isChecked()
                    ? "Updates ON"
                    : "Updates OFF";

            Toast.makeText(this,
                    "Course: " + course +
                            "\nSkills: " + skills +
                            "\nCountry: " + country +
                            "\n" + updates,
                    Toast.LENGTH_LONG).show();
        });
    }
}