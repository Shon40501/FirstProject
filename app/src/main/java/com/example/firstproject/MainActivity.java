package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.Textview2);
        bt = (Button) findViewById(R.id.button);
        tv.setTextSize(15);
        tv.setText("Press the butoon if u like ice cream");
        bt.setText("Press");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                bt.setText("good job");
            }
        });


    }
}