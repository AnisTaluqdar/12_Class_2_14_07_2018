package com.abhi.www.a12class1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MySecondActivity extends AppCompatActivity {
    TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_second);
        tv1 = findViewById(R.id.TV1);
        tv2 = findViewById(R.id.TV2);

        Intent myintent2 = getIntent();
        String getValue1 = myintent2.getExtras().getString("tagValue1");
        String getValue2 = myintent2.getExtras().getString("tagValue2");
        tv1.setText(getValue1);
        tv2.setText(getValue2);

        Log.d("logValue",getValue1);
        Log.d("logValue2",getValue2);
    }
}
