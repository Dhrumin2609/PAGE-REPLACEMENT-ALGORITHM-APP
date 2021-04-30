package com.example.osalgorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thrypage extends AppCompatActivity {
private Button fifodef,lrudef,optdef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrypage);
        fifodef=findViewById(R.id.fifodef);
        lrudef=findViewById(R.id.lrudef);
        optdef=findViewById(R.id.optdef);
        fifodef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfifodef();
            }
        });
        lrudef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlrudef();
            }
        });
        optdef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openoptdef();
            }
        });
    }
    public void openfifodef(){
        Intent int1 = new Intent(this, fifodefact.class);
        startActivity(int1);
    }
    public void openlrudef(){
        Intent int2 = new Intent(this, lrudefact.class);
        startActivity(int2);
    }
    public void openoptdef(){
        Intent int3 = new Intent(this, optdefact.class);
        startActivity(int3);
    }
}