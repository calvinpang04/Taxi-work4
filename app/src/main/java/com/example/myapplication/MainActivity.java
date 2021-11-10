package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private EditText t1;
    private TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1=(EditText) findViewById(R.id.editTextNumber);
                Double tt= Double.parseDouble(t1.getText().toString());
                Double tt1=tt*75;
                t2=(TextView) findViewById(R.id.textView2);
                t2.setText("費用："+String.valueOf(tt1));
            }
        });
    }
}