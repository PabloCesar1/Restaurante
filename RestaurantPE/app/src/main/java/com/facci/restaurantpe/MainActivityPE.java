package com.facci.restaurantpe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityPE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_pe);
    }

    public void click1(View v){
        Toast.makeText(MainActivityPE.this, "BANDEJA DE MARISCOS", Toast.LENGTH_SHORT).show();
    }

    public void click2(View v){
        Toast.makeText(MainActivityPE.this, "CALDO DE GALLINA", Toast.LENGTH_SHORT).show();
    }

    public void click3(View v){
        Toast.makeText(MainActivityPE.this, "CEVICHE DE CAMARÓN", Toast.LENGTH_SHORT).show();
    }

    public void click4(View v){
        Toast.makeText(MainActivityPE.this, "CORVICHE", Toast.LENGTH_SHORT).show();
    }

    public void click5(View v){
        Toast.makeText(MainActivityPE.this, "PESCADO FRITO", Toast.LENGTH_SHORT).show();
    }

    public void click6(View v){
        Toast.makeText(MainActivityPE.this, "SALPRIETA", Toast.LENGTH_SHORT).show();
    }

    public void click7(View v){
        Toast.makeText(MainActivityPE.this, "ARROZ CON MARISCOS", Toast.LENGTH_SHORT).show();
    }

}
