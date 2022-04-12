package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import 	android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        Button btn = (Button) findViewById(R.id.btn);

        //admin y admin (usuario y contraseña)

        btn.setOnClickListener(view -> {
            if (username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                Toast.makeText(MainActivity.this, "Logeo exitoso!", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(MainActivity.this, "Algo salio mal :(!", Toast.LENGTH_LONG).show();
            }
        });{

        }
    }
}