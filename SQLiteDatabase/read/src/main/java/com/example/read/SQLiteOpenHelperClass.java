package com.example.read;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ENGINEER AKASH on 1/25/2017.
 */
public class SQLiteOpenHelperClass extends SQLiteOpenHelper{
    public static String DATABASE_NAME = "Product_Information";
    public static  int DATABASE_VERSION = 1;

    public SQLiteOpenHelperClass(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public static String TABLE_NAME = "ProductBuyInformation";
    public static String FIELD_ID = "_id";
    public static String FIELD_PRODUCT_NAME = "productName";
    public static String FIELD_QUANTITY= "quantity";
    public static String FIELD_PRICE = "price";
    public static String FIELD_BUYER_NAME = "buyerName";
    public static String FIELD_ADVANCE_PAYMENT = "advancePayment";
    public static String FIELD_DUE = "due";
    /*
    public static String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+" ( "+FIELD_ID+" INTERGER PRIMARY KEY, "
            +FIELD_PRODUCT_NAME+" TEXT, "
            +FIELD_QUANTITY+" TEXT, "+FIELD_PRICE+" TEXT, "+FIELD_BUYER_NAME+" TEXT, "
            +FIELD_ADVANCE_PAYMENT+" TEXT, "+FIELD_DUE+" TEXT )";
    */

    @Override
    public void onCreate(SQLiteDatabase db) {
        /*
        db.execSQL(CREATE_TABLE);
        Log.e("create msg", CREATE_TABLE);
        */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public ArrayList<ProductInformation> readData()
    {
        ArrayList<ProductInformation> readDatabase = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, null, null, null, null, null, null);
        if (cursor != null && cursor.getCount() > 0)
        {
            cursor.moveToFirst();
            for(int i = 0; i < cursor.getCount(); i++)
            {
                String productName = cursor.getString(cursor.getColumnIndex(FIELD_PRODUCT_NAME));
                String quantity = cursor.getString(cursor.getColumnIndex(FIELD_QUANTITY));
                String price = cursor.getString(cursor.getColumnIndex(FIELD_PRICE));
                String buyer = cursor.getString(cursor.getColumnIndex(FIELD_BUYER_NAME));
                String advanced = cursor.getString(cursor.getColumnIndex(FIELD_ADVANCE_PAYMENT));
                String due = cursor.getString(cursor.getColumnIndex(FIELD_DUE));
                ProductInformation productInformation = new ProductInformation(productName,quantity,price,buyer,advanced,due);
                readDatabase.add(productInformation);
                cursor.moveToNext();
            }
        }
        cursor.close();
        return readDatabase;
    }
}
