package com.example.amaliacocina_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;

    private Button registrarse;
    private Button cerrarSesion;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarse = findViewById(R.id.btnregistrarse);
        cerrarSesion = findViewById(R.id.btncerrarsesion);

        auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser()!=null){
            registrarse.setVisibility(View.GONE);
            cerrarSesion.setVisibility(View.VISIBLE);

        }
    }

    public void CerrarSesion(View view){
        auth.signOut();
        if (auth.getCurrentUser()==null){
            registrarse.setVisibility(View.VISIBLE);
            cerrarSesion.setVisibility(View.GONE);

        }

    }

    public void irIniciar(View view){
        Intent i = new Intent(this,IniciarSesionActivity.class);
        startActivity(i);
    }

    public void irRegistrarse(View view){
        Intent i = new Intent(this, RegistroActivity.class);
        startActivity(i);
    }

    public void irIdenticarse(View view){
        Intent i = new Intent(this, IdentificarseActivity.class);
        startActivity(i);
    }

    public void irPollo(View view){
        Intent i = new Intent(this, PolloActivity.class);
        startActivity(i);
    }

    public void irParrillas(View view){
        Intent i = new Intent(this, ParrillasActivity.class);
        startActivity(i);
    }

    public void irParrillasFuego(View view){
        Intent i = new Intent(this, ParrillasFuegoActivity.class);
        startActivity(i);
    }

    public void irLomoSaltado(View view){
        Intent i = new Intent(this, LomoSaltadoActivity.class);
        startActivity(i);
    }

    public void irBebidas(View view){
        Intent i = new Intent(this, BebidasActivity.class);
        startActivity(i);
    }

    public void irCocteles(View view){
        Intent i = new Intent(this, CoctelesActivity.class);
        startActivity(i);
    }

    public void irPerfil(View view){
        Intent i = new Intent(this, PantPerfil.class);
        startActivity(i);
    }

    public void irCupones(View view){
        Intent i = new Intent(this, Cupones.class);
        startActivity(i);
    }

    public void irNotificacione(View view){
        Intent i = new Intent(this, Notificaciones.class);
        startActivity(i);
    }

    public void irgps(View view){
        Intent i = new Intent(this, Gps.class);
        startActivity(i);
    }

    public void irChats(View view){
        Intent i = new Intent(this,Chats.class);
        startActivity(i);

    }

    public void irCarritoCompras(View view){
        Intent i = new Intent(this, CarritoCompras.class);
        startActivity(i);
    }

}



