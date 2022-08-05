package com.example.amaliacocina_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cupones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupones);
    }

    public void irMainActivity(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void irPantPerfil(View view){
        Intent i = new Intent(this, PantPerfil.class);
        startActivity(i);
    }

    public void irNotificacione(View view){
        Intent i = new Intent(this, Notificaciones.class);
        startActivity(i);
    }


}