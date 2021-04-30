package com.example.osalgorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(2500);
                    Intent slpash = new Intent(MainActivity.this, Algotype.class);
                    startActivity(slpash);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}