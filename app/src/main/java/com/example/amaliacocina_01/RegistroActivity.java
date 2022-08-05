package com.example.amaliacocina_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistroActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    private EditText correo;
    private EditText password;
    private EditText passwordconfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        mAuth = FirebaseAuth.getInstance();

        correo = findViewById(R.id.correo2);
        password= findViewById(R.id.txtpassword1);
        passwordconfirmar= findViewById(R.id.txtpassword2);

    }

    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser)


    }
    public void RegistrarUsuario(View view){
        if (password.getText().toString().equals(passwordconfirmar.getText().toString())){

            mAuth.createUserWithEmailAndPassword(correo.getText().toString(), password.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                // Sign in success, update UI with the signed-in user's information
                                Toast.makeText(getApplicationContext(),"USUARIO CREADO",Toast.LENGTH_SHORT).show();
                                FirebaseUser user= mAuth.getCurrentUser();
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(i);

                                //updateUI(user);

                            }else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(getApplicationContext(),"Authentication Failed",Toast.LENGTH_SHORT).show();
                                //update(null);
                            }
                        }
                    });

        }else{
            Toast.makeText(this, "el password no coninciden",Toast.LENGTH_SHORT).show();
        }

        

    }


}












