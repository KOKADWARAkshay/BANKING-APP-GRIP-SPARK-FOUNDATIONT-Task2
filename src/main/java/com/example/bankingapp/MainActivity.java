/*
  AKSHAY KOKADWAR
  VELLORE INSTITUTE OF TECHNOLOGY
  INTERNSHIP TASK #2 Basic Banking App
  GRIP SPARK FOUNDATION
 */


package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton transfer,history;
    TextView transferLabel,historyLabel;
    public void onHome(View view){
    }
    public void onBack(View view){
    }
    public void startAnimate(){
        transfer.animate().translationXBy(800).setDuration(0).withEndAction(new Runnable() {
            @Override
            public void run() {
                transfer.animate().translationXBy(-800).setDuration(500);
            }
        });
        transferLabel.animate().translationXBy(800).setDuration(0).withEndAction(new Runnable() {
            @Override
            public void run() {
                transferLabel.animate().translationXBy(-800).setDuration(500);
            }
        });
        history.animate().translationXBy(-800).setDuration(0).withEndAction(new Runnable() {
            @Override
            public void run() {
                history.animate().translationXBy(800).setDuration(500);
            }
        });
        historyLabel.animate().translationXBy(-800).setDuration(0).withEndAction(new Runnable() {
            @Override
            public void run() {
                historyLabel.animate().translationXBy(800).setDuration(500);
            }
        });
    }
    public void viewCustomerList(View view){
        Intent customerList = new Intent(getApplicationContext(), CustomerDeatils.class);
        customerList.putExtra("SenderID","");
        startActivity(customerList);
    }
    public void viewTranctionHistory(View view){
        Intent trasachist = new Intent(getApplicationContext(), TransactionHistory.class);
        startActivity(trasachist);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transfer = findViewById(R.id.transferImgButton);
        history = findViewById(R.id.historyImgButton);
        transferLabel = findViewById(R.id.transferButtonText);
        historyLabel = findViewById(R.id.historyButtonText);
        startAnimate();
        SQLiteDatabase myDataBase = this.openOrCreateDatabase("customers", Context.MODE_PRIVATE,null);
        //myDataBase.execSQL("DROP TABLE customers");
        myDataBase.execSQL("CREATE TABLE IF NOT EXISTS customers(custid VARCHAR PRIMARY KEY, name VARCHAR, email VARCHAR, phn INT(10), bank VARCHAR, balance DOUBLE)");
        //myDataBase.execSQL("DROP TABLE transitions");
        myDataBase.execSQL("CREATE TABLE IF NOT EXISTS transitions(transitionid VARCHAR PRIMARY KEY, sender VARCHAR, receiver VARCHAR, amount VARCHAR, status VARCHAR)");

       myDataBase.execSQL("INSERT INTO customers VALUES('C101','AKSHAY', 'akshaykokadwar@gmail.com',7447330494,'KOTAK Bank',65000000.4)");
       // myDataBase.execSQL("INSERT INTO customers VALUES('C102','AKKIII', 'akiii123@gmail.com'',7447330494,'INDANE Bank',156000.75)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C103','AMAAN', 'amaan@gmail.com',7447330496,'BOI Bank',34400.00)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C104','ARYAN', 'aryan@gmail.com',7447340496,'PUNJAB Bank',4500.55)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C105','NIKITA', 'nikita@gmail.com',744733043,'PUSAD Bank',5000.55)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C106','SOMIL', 'somil@gmail.com',7447334494,'CANRA Bank',56007.00)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C107','KASHISH', 'kashish@gmail.com',7427330494,'BOI Bank',80000.00)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C108','ASHI', 'ashi@gmail.com',7447330494,'AARYA VAISHYA Bank',7009.75)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C109','PALLAVI', 'pallavi@gmail.com',7446330494,'IDBI Bank',46000.00)");
       // myDataBase.execSQL("INSERT INTO customers VALUES('C110','YASH, 'pallavi@gmail.com' ,7447350494,'SYNDICATE Bank',760.60)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C111','ABHI', 'abhi@gmail.com',7447630494,'BARODA Bank',6899.90)");
        myDataBase.execSQL("INSERT INTO customers VALUES('C112','SHITAL', 'shital@gmail.com',7847330494,'SBI Bank',5775292.22)");

    }
}