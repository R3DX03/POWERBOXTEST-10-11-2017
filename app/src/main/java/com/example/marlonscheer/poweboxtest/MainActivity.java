package com.example.marlonscheer.poweboxtest;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.etUsername);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Username.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String username, String userpassword ){
         if((username.equals("PowerBox")) && (userpassword.equals("PowerBox"))){
             Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
         }
         }
    }

