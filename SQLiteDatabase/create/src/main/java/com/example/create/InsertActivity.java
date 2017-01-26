package com.example.create;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {
    SQLiteOpenHelperClass sqLiteOpenHelperClass;
    EditText pName, pQuantity, pPrice, bName, advance, due;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        pName = (EditText) findViewById(R.id.productName);
        pQuantity = (EditText) findViewById(R.id.quantity);
        pPrice = (EditText) findViewById(R.id.price);
        bName = (EditText) findViewById(R.id.buyerName);
        advance = (EditText) findViewById(R.id.advencePayment);
        due = (EditText) findViewById(R.id.due);
        sqLiteOpenHelperClass = new SQLiteOpenHelperClass(this);
    }

    public void insertData(View view) {
        String productName = pName.getText().toString();
        String quantity = pQuantity.getText().toString();
        String price = pPrice.getText().toString();
        String byerName = bName.getText().toString();
        String payment = advance.getText().toString();
        String totalDue = due.getText().toString();
        ProductInformation productInformation = new ProductInformation(productName, quantity, price, byerName, payment, totalDue);
        //productInformation.setProductName(productName);
        //productInformation.setProductQuantity(quantity);
        //productInformation.setProductPrice(price);
        //productInformation.setBuyerName(byerName);
        //productInformation.setAdvancePayment(payment);
        //productInformation.setDue(totalDue);
        Toast.makeText(InsertActivity.this, productInformation.toString(), Toast.LENGTH_SHORT).show();
        long inserted = sqLiteOpenHelperClass.insertProduct(productInformation);
        if (inserted >= 0)
        {
            Toast.makeText(InsertActivity.this, "Data insertion successful!!!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(InsertActivity.this, "Data insertion failed...", Toast.LENGTH_SHORT).show();
        }
    }
}
