package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.Textview2);
        tv.setTextSize(75);
        tv.setText("Hi");
        if(tv.getText() == "Hi"){
            tv.setTextColor(Color.BLACK);
        }
        else{
            tv.setTextColor(Color.BLUE);
        }




    }
}