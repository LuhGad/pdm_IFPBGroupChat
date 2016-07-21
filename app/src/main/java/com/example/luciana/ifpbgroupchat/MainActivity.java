package com.example.luciana.ifpbgroupchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText senha = (EditText) findViewById(R.id.senha);
        Button entrar = (Button) findViewById(R.id.button);

        assert entrar != null;
        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String senhaCorreta = "1234";
                String strSenha = senha.getText().toString();
                if (strSenha.equals(senhaCorreta)) {

                    Intent intent = new Intent(MainActivity.this, ListMainActivity.class);
                    startActivity(intent);
                }


                else {
                    Toast.makeText(MainActivity.this, "Senha incorreta ", Toast.LENGTH_SHORT).show();


                }


            }

        });
    }

}

