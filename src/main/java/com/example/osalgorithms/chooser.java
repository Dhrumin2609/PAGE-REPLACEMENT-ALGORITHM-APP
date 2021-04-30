package com.example.osalgorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooser extends AppCompatActivity {
private Button thry,ua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);
        thry=(Button) findViewById(R.id.thry);
        ua=(Button) findViewById(R.id.ua);
        thry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthrypage();
            }
        });
        ua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openuapage();
            }
        });
    }
    public void openthrypage(){
        Intent thrypage = new Intent(this, thrypage.class);
        startActivity(thrypage);
    }
    public void openuapage(){
        Intent uapage = new Intent(this, uapage.class);
        startActivity(uapage);
    }
}