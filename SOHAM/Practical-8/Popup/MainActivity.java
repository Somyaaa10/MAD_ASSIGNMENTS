package com.example.popupmenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu = findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(view -> {

            PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnMenu);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                if (item.getItemId() == R.id.edit) {
                    Toast.makeText(MainActivity.this, "Edit Clicked", Toast.LENGTH_SHORT).show();
                    return true;

                } else if (item.getItemId() == R.id.delete) {
                    Toast.makeText(MainActivity.this, "Delete Clicked", Toast.LENGTH_SHORT).show();
                    return true;

                } else if (item.getItemId() == R.id.share) {
                    Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            });

            popupMenu.show();
        });
    }
}