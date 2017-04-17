package com.example.avina.appointment_detection_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by avina on 4/15/2017.
 */

public class User1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    public void Send(View view)
    {

        EditText e = (EditText) findViewById(R.id.message1);
        if(e.getText().toString()!=null) {

            Intent i = new Intent(User1Activity.this, User1SuccessActivity.class);
            startActivity(i);

        }
        else
        {
            Toast pass = Toast.makeText(User1Activity.this, "Enter a valid username", Toast.LENGTH_SHORT);
            pass.show();
        }
    }
    public void Logout(View view)
    {
        Intent i=new Intent(User1Activity.this,MainActivity.class);
        startActivity(i);
    }
}
