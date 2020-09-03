package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_sign_in(View view) {
        startActivity(new Intent(getApplicationContext(),Sign_in.class));
    }

    public void btn_sign_up(View view) {
        startActivity(new Intent(getApplicationContext(),sign_up.class));
    }
}