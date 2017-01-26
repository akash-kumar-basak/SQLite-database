package com.example.create;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

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
    public static String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+" ( "+FIELD_ID+" INTERGER PRIMARY KEY, "
            +FIELD_PRODUCT_NAME+" TEXT, "
            +FIELD_QUANTITY+" TEXT, "+FIELD_PRICE+" TEXT, "+FIELD_BUYER_NAME+" TEXT, "
            +FIELD_ADVANCE_PAYMENT+" TEXT, "+FIELD_DUE+" TEXT )";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        Log.e("create msg", CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public long insertProduct(ProductInformation pi)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FIELD_PRODUCT_NAME, pi.getProductName());
        contentValues.put(FIELD_QUANTITY, pi.getProductQuantity());
        contentValues.put(FIELD_PRICE, pi.getProductPrice());
        contentValues.put(FIELD_BUYER_NAME, pi.getBuyerName());
        contentValues.put(FIELD_ADVANCE_PAYMENT, pi.getAdvancePayment());
        contentValues.put(FIELD_DUE, pi.getDue());
        long insert = db.insert(TABLE_NAME,null,contentValues);
        db.close();
        return insert;
    }
}
