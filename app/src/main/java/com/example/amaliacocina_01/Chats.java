package com.example.amaliacocina_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
    }

    public void irChats(View view){
        Intent i = new Intent(this, Chats.class);
        startActivity(i);

    }

    public void irMainActvity(View view){
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);

    }
}

//   public void irCupones(View view){
//        Intent i = new Intent(this, Cupones.class);
//        startActivity(i);
//    }