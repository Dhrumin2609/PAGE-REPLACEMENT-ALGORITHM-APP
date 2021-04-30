package com.example.osalgorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class fifoalgo extends AppCompatActivity {
  EditText fr,rf,reflen;
  TextView hitratio,faultno,hitno;
  Button compute;
  int framesin,ref_lenin;
  int ref_strin[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifoalgo);
        compute= findViewById(R.id.compute);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeit();
                FIFO fifo1 = new FIFO();
                FIFO fifo2 = fifo1.fifooperation(framesin,ref_strin,ref_lenin);
                hitratio.setText(Float.toString(fifo2.hit_ratio));
                faultno.setText(Integer.toString(fifo2.fault));
                hitno.setText(Integer.toString(fifo2.hit));

            }
        });

    }

    private void makeit() {
        fr=findViewById(R.id.fr);
        reflen=findViewById(R.id.reflen);
        rf=findViewById(R.id.rf);
        faultno=findViewById(R.id.faultno);
        hitno=findViewById(R.id.hitno);
        hitratio=findViewById(R.id.hitratio);
        framesin= Integer.parseInt(fr.getText().toString());
        ref_lenin=Integer.parseInt(reflen.getText().toString());
        ref_strin=new int[ref_lenin];
        String message=rf.getText().toString();
        String[] strArray = message.split(",");
        for(int i=0;i<strArray.length;i++){
            ref_strin[i]=Integer.parseInt(strArray[i]);
        }


    }
}