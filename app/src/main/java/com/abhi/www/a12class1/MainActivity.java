package com.abhi.www.a12class1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et1,et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.ET1);
        et2 = findViewById(R.id.ET2);
        btn = findViewById(R.id.myBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=et1.getText().toString();

                String value2=et2.getText().toString();
                Intent myIntent = new Intent(getApplicationContext(),MySecondActivity.class);
                myIntent.putExtra("tagValue1",value1);
                myIntent.putExtra("tagValue2",value2);
                startActivity(myIntent);


            }
        });
    }
}
