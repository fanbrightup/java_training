package com.example.fan.ex03_14;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Ex03_14 extends AppCompatActivity {
    private TextView textView;
    private int mcolor[]={Color.GREEN,Color.BLACK,Color.GRAY,Color.YELLOW, Color.RED};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex03_14);
        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText((int)(Math.random()*1000)+"");// 必须要加“” 将其变为String
                textView.setTextColor(mcolor[new Random().nextInt(5)]);
            }
        });
    }
}
