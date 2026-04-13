package com.example.contextmenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        // Register for context menu
        registerForContextMenu(textView);
    }

    // Create menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    // Handle click
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.edit) {
            Toast.makeText(this, "Edit Clicked", Toast.LENGTH_SHORT).show();
            return true;

        } else if (item.getItemId() == R.id.delete) {
            Toast.makeText(this, "Delete Clicked", Toast.LENGTH_SHORT).show();
            return true;

        } else if (item.getItemId() == R.id.share) {
            Toast.makeText(this, "Share Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onContextItemSelected(item);
    }
}