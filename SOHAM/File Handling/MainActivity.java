package com.example.filehandling;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button saveBtn, loadBtn;

    String fileName = "notes.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        saveBtn = findViewById(R.id.saveBtn);
        loadBtn = findViewById(R.id.loadBtn);

        // Save Button Click
        saveBtn.setOnClickListener(v -> {

            String data = editText.getText().toString();

            if (data.isEmpty()) {
                Toast.makeText(
                        this,
                        "Please Enter Some Notes First",
                        Toast.LENGTH_SHORT
                ).show();
                return;
            }

            try {
                FileOutputStream fos =
                        openFileOutput(fileName, MODE_PRIVATE);

                fos.write(data.getBytes());
                fos.close();

                Toast.makeText(
                        this,
                        "Notes Saved Successfully ",
                        Toast.LENGTH_SHORT
                ).show();

            } catch (Exception e) {

                Toast.makeText(
                        this,
                        "Error Saving File ",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });


        // Load Button Click
        loadBtn.setOnClickListener(v -> {

            try {
                FileInputStream fis =
                        openFileInput(fileName);

                int c;
                StringBuilder temp =
                        new StringBuilder();

                while ((c = fis.read()) != -1) {
                    temp.append((char) c);
                }

                fis.close();

                editText.setText(temp.toString());

                Toast.makeText(
                        this,
                        "Notes Loaded Successfully ",
                        Toast.LENGTH_SHORT
                ).show();

            } catch (Exception e) {

                Toast.makeText(
                        this,
                        "No Saved File Found ",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}