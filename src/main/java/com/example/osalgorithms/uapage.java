package com.example.osalgorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uapage extends AppCompatActivity {
private Button lrupra,fifopra,optpra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uapage);
        fifopra=findViewById(R.id.fifopra);
        fifopra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfifoalgo();
            }
        });
        lrupra=findViewById(R.id.lrupra);
        lrupra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlrualgo();
            }
        });
        optpra=findViewById(R.id.optpra);
        optpra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openoptalgo();
            }
        });
    }
    public void openfifoalgo(){
        Intent int1= new Intent(this, fifoalgo.class);
        startActivity(int1);
    }
    public void openlrualgo(){
        Intent int2= new Intent(this, lrualgo.class);
        startActivity(int2);
    }
    public void openoptalgo(){
        Intent int3= new Intent(this, optalgo.class);
        startActivity(int3);
    }
}