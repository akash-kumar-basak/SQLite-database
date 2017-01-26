package com.example.engineerakash.sqlitedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.create.InsertActivity;
import com.example.read.readActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createModuleButton(View view) {
        Intent createDatabase = new Intent(getBaseContext(), InsertActivity.class);
        startActivity(createDatabase);
    }

    public void readModuleButton(View view) {
        Intent readDatabase = new Intent(getBaseContext(), readActivity.class);
        startActivity(readDatabase);
    }
}
