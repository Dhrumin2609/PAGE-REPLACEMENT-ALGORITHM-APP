package com.example.osalgorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class lrualgo extends AppCompatActivity {
    EditText fr1,rf1,reflen1;
    TextView hitratio1,faultno1,hitno1;
    Button compute1;
    int framesin1,ref_lenin1;
    int ref_strin1[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lrualgo);

        compute1= findViewById(R.id.compute1);

        compute1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeit1();
                LRU lru1 = new LRU();
                LRU lru2 = lru1.lruoperation(framesin1,ref_strin1,ref_lenin1);

                hitratio1.setText(Float.toString(lru2.hit_ratio1));
                faultno1.setText(Integer.toString(lru2.fault1));
                hitno1.setText(Integer.toString(lru2.hit1));

            }
        });

    }

    private void makeit1() {
        fr1=findViewById(R.id.fr1);
        reflen1=findViewById(R.id.reflen1);
        rf1=findViewById(R.id.rf1);
        faultno1=findViewById(R.id.faultno1);
        hitno1=findViewById(R.id.hitno1);
        hitratio1=findViewById(R.id.hitratio1);


        framesin1= Integer.parseInt(fr1.getText().toString());
        ref_lenin1=Integer.parseInt(reflen1.getText().toString());
        ref_strin1=new int[ref_lenin1];
        String message=rf1.getText().toString();
        String[] strArray = message.split(",");
        for(int i=0;i<strArray.length;i++){
            ref_strin1[i]=Integer.parseInt(strArray[i]);
        }


    }
}