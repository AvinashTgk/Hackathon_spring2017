package com.example.avina.appointment_detection_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by avina on 4/15/2017.
 */

public class RegisterActivity extends AppCompatActivity{

    EditText pass1;
    EditText pass2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        pass1 = (EditText)findViewById(R.id.pass1);
        pass2 = (EditText)findViewById(R.id.pass2);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    public void Register(View view)
    {
        String pass1str =pass1.getText().toString();
        String pass2str =pass2.getText().toString();

        if(!pass1str.endsWith(pass2str))
        {
            //pop msg
            Toast pass = Toast.makeText(RegisterActivity.this, "Password doen't match!", Toast.LENGTH_SHORT);
            pass.show();
        }
        else
        {
            Intent i= new Intent(RegisterActivity.this,LoginActivity.class);
            startActivity(i);
        }
    }

    public void back(View view)
    {
        Intent i=new Intent(RegisterActivity.this,MainActivity.class);
        startActivity(i);
    }
}
