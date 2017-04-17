package com.example.avina.appointment_detection_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by avina on 4/15/2017.
 */

public class LoginActivity extends AppCompatActivity {

    EditText uname;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        uname = (EditText)findViewById(R.id.uname);
        pass = (EditText)findViewById(R.id.pass);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void Login(View view) {
        //if (view.getId() == R.id.loginbtn) {

            //Intent i = new Intent(LoginActivity.this, User1Activity.class);
            //startActivity(i);
        String unamestr =uname.getText().toString();
        String passstr =pass.getText().toString();
            if (!unamestr.endsWith(passstr)) {
                Intent i = new Intent(LoginActivity.this, User1Activity.class);
                startActivity(i);

            } else if(unamestr.endsWith(passstr)){

                Intent i = new Intent(LoginActivity.this, User2Activity.class);
                startActivity(i);
                //Toast pass = Toast.makeText(LoginActivity.this, "Enter a valid username", Toast.LENGTH_SHORT);
                //pass.show();
            }
       // }
    }
    public void back(View view)
    {
        Intent i=new Intent(LoginActivity.this,MainActivity.class);
        startActivity(i);
    }

}