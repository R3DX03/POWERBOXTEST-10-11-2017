package com.example.marlonscheer.poweboxtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {


   public EditText Name;
   public EditText Username;
   public EditText Pass ;
    Button Regis;
    String name,user_name, user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Name = (EditText) findViewById(R.id.editTextName);
        Username = (EditText) findViewById(R.id.editTextusername);
        Pass = (EditText) findViewById(R.id.editTextpasswd);
        Regis = (Button) findViewById(R.id.buttonreg);




    }
public void userReg1 (View view){

   //Registration
    name = Name.getText().toString();
    user_name = Username.getText().toString();
    user_pass = Pass.getText().toString();

    String method = "register";
    BackgroundTask backgroundTask = new BackgroundTask(this);
    backgroundTask.execute(method,name,user_name,user_pass);

    finish();



}

}
