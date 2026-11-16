package com.example.modul2;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gridview);

        GridView gridView = findViewById(R.id.grid_view);

        ImageAdapter adapter = new ImageAdapter(this);
        gridView.setAdapter(adapter);
    }
}