package com.example.amaliacocina_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class pedidos extends AppCompatActivity {

    private TextView precio;
    private TextView cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        precio = (TextView) findViewById(R.id.txtprecio);
        cantidad = (TextView) findViewById(R.id.txtcantidad);

    }
    //ESTE METODO REALIZA UNA SUMA
    public void Suma(View view){
        String valor1 = precio.getText().toString();

        int prec = Integer.parseInt(valor1);

        int suma = prec;

        String resul = String.valueOf(suma);
        cantidad.setText(resul);

    }






}
