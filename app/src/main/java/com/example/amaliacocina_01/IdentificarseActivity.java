package com.example.amaliacocina_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IdentificarseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identificarse);
    }
    public void irIniciar(View view){
        Intent i = new Intent(this,IniciarSesionActivity.class);
        startActivity(i);

    }

    public void irRegistrarse(View view){
        Intent i = new Intent(this, RegistroActivity.class);
        startActivity(i);
    }
}