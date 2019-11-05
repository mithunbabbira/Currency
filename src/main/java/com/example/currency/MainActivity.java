package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro, pound, dollar, yen ,dinar, bitcoin ,rubel ,ausdollar ,candollar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound= findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar= findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        rubel  = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        editText = findViewById(R.id.editText);
        textView = findViewById( R.id.textView);


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 0.012;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 0.014;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 0.010;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 1.540;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 0.0042;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 0.0000015;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });
        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 0.894;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 0.018;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });
        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();// convert to string ".toString" is not complusary

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty Input");// error if empty

                }else{
                    double f,t;

                    t = Double.parseDouble(z);// converting back to double
                    textView.setText(null);// clear for the next input
                    Formatter formatter = new Formatter();// suggested but not mandatory

                    f = t * 0.020;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");// how many decimal numbers
                    textView.setText(""+numberFormat.format(f));//
//                    textView.setText(""+f);// better to use above one for 2 decimal points







                }

            }
        });


    }


}
