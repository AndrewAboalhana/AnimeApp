package com.example.testformainproject.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.testformainproject.MainActivity;
import com.example.testformainproject.R;
import com.google.firebase.auth.FirebaseAuth;

import java.lang.reflect.Field;

public class SplashActivity extends AppCompatActivity {
FirebaseAuth firebaseAuth= FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().setTitle("KonohaApp");

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000);
                    if(firebaseAuth.getCurrentUser()==null) {
                        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    }
                    else{
                            startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    }
                    finish();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}