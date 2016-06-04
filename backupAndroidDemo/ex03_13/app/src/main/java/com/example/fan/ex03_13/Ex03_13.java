package com.example.fan.ex03_13;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ex03_13 extends AppCompatActivity {
    private Button button ;
    private TextView textView;
    private int[] mColors;
    private int colornum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex03_13);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
//        int myColor = getResources().getColor(R.color.opaque_red);

        // getColor()已过时，但是我还不知道新的用法
        textView.setTextColor(getResources().getColor(R.color.opaque_red));
        // 声明并构造一整数array来存储欲使用的文字颜色。使用Color类
        mColors = new int[]{
                Color.BLACK,Color.RED,Color.BLUE,
                Color.GREEN,Color.MAGENTA,Color.YELLOW
        };
        colornum = 0;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(colornum < mColors.length){
                    textView.setTextColor(mColors[colornum]);
                    textView.setText(Color.BLACK+"");
                    colornum++;
                }else{
                    colornum = 0;
                }

            }
        });
    }
}
