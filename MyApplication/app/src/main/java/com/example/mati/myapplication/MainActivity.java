package com.example.mati.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    EditText txtn1,txtn2;
    Button btns, btnr, btnm, btnd;
    TextView txtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtn1=(EditText)findViewById(R.id.txtn1);
        txtn2=(EditText)findViewById(R.id.txtn2);

        btns=(Button)findViewById(R.id.btnsuma);
        btnr=(Button)findViewById(R.id.btnresta);
        btnm=(Button)findViewById(R.id.btnmulti);
        btnd=(Button)findViewById(R.id.btndiv);

        txtR=(TextView)findViewById(R.id.txtre);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(txtn1.getText().toString());
                int num2=Integer.parseInt(txtn2.getText().toString());
                int s=num1+num2;
                txtR.setText("Resultado: " +s);
            }
        });
        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(txtn1.getText().toString());
                int num2=Integer.parseInt(txtn2.getText().toString());
                int s=num1-num2;
                txtR.setText("Resultado : " +s);
            }
        });
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(txtn1.getText().toString());
                int num2=Integer.parseInt(txtn2.getText().toString());
                int s=num1*num2;
                txtR.setText("Resultado: " +s);
            }
        });
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(txtn1.getText().toString());
                int num2=Integer.parseInt(txtn2.getText().toString());
                int s=num1/num2;
                txtR.setText("Resultado: " +s);
            }
        });
    }
}
