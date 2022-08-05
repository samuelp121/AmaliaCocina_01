package com.example.amaliacocina_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PolloPromocionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo_promociones);

    }

    public void irpedidos(View view){
        Intent i = new Intent(this,pedidos.class);
        startActivity(i);
    }


}




