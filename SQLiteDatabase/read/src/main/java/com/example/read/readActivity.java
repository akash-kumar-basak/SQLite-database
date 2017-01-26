package com.example.read;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class readActivity extends AppCompatActivity {
    TextView newData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        newData = (TextView) findViewById(R.id.newData);
    }

    public void readButton(View view) {
        SQLiteOpenHelperClass sqLiteOpenHelperClass = new SQLiteOpenHelperClass(this);
        sqLiteOpenHelperClass.readData();
        Toast.makeText(readActivity.this, sqLiteOpenHelperClass.readData().toString(), Toast.LENGTH_SHORT).show();
        newData.setText(sqLiteOpenHelperClass.readData().toString());
    }
}
