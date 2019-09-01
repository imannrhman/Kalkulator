package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText vTxtA,vTxtB,vTxtC;
protected double yTxtA, yTxtB,yTxtC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vTxtA = (EditText)findViewById(R.id.txtA);
        vTxtB = (EditText)findViewById(R.id.txtB);
        vTxtC = (EditText)findViewById(R.id.txtC);

        Button  vBtnTambah= (Button) findViewById(R.id.btnTambah);
        Button  vBtnKurang= (Button) findViewById(R.id.btnKurang);
        Button  vBtnKali= (Button) findViewById(R.id.btnKali);
        Button  vBtnBtnBagi= (Button) findViewById(R.id.btnBagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBtnBagi.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        yTxtA = Double.parseDouble(vTxtA.getText().toString());
        yTxtB = Double.parseDouble(vTxtB.getText().toString());
        switch (view.getId()){

            case R.id.btnTambah:
                yTxtC = yTxtA + yTxtB;
            vTxtC.setText(String.valueOf(yTxtC));
            break;
            case R.id.btnKurang:
                yTxtC = yTxtA - yTxtB;
                vTxtC.setText(String.valueOf(yTxtC));
                yTxtC = 0.0;
                break;
            case R.id.btnKali:
                yTxtC = yTxtA * yTxtB;
                vTxtC.setText(String.valueOf(yTxtC));
                yTxtC = 0.0;
                break;
            case R.id.btnBagi:
                yTxtC = yTxtA / yTxtB;
                vTxtC.setText(String.valueOf(yTxtC));
                yTxtC = 0.0;
                break;
        }


    }
}
