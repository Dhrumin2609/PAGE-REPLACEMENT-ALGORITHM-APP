package com.example.osalgorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class optalgo extends AppCompatActivity {
    EditText fr3, rf3, reflen3;
    TextView hitratio3, faultno3, hitno3;
    Button compute3;
    int framesin3, ref_lenin3;
    int ref_strin3[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optalgo);
        compute3 = findViewById(R.id.compute3);

        compute3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeit();
                OPTIMAL opt1 = new OPTIMAL();
                OPTIMAL opt2 = opt1.optoperation(framesin3, ref_strin3, ref_lenin3);
                hitratio3.setText(Float.toString(opt2.hit_ratio2));
                faultno3.setText(Integer.toString(opt2.fault2));
                hitno3.setText(Integer.toString(opt2.hit2));

            }
        });

    }

    private void makeit() {
        fr3 = findViewById(R.id.fr3);
        reflen3 = findViewById(R.id.reflen3);
        rf3 = findViewById(R.id.rf3);
        faultno3 = findViewById(R.id.faultno3);
        hitno3 = findViewById(R.id.hitno3);
        hitratio3 = findViewById(R.id.hitratio3);
        framesin3 = Integer.parseInt(fr3.getText().toString());
        ref_lenin3 = Integer.parseInt(reflen3.getText().toString());
        ref_strin3 = new int[ref_lenin3];
        String message = rf3.getText().toString();
        String[] strArray = message.split(",");
        for (int i = 0; i < strArray.length; i++) {
            ref_strin3[i] = Integer.parseInt(strArray[i]);
        }
    }
}