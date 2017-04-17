package com.example.avina.appointment_detection_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onLogin(View view)
    {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);

    }
    public void onRegister(View view)
    {
        Intent i = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(i);

    }
}
