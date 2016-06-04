package com.example.fan.learnlog;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static String TAG = "MainActivity信息";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"error -----");
        Log.w(TAG,"warn -----");
        Log.i(TAG,"info -----");
        Log.d(TAG,"debug -----");
        Log.v(TAG,"verbose -----");
        Log.e("MSG","其他信息");
        findViewById(R.id.btnSendMSG).setOnClickListener(this);
        findViewById(R.id.btnreg).setOnClickListener(this);
        findViewById(R.id.btnUnreg).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnSendMSG:
                Intent intent = new Intent(MyReceiver.ACTION);
                intent.putExtra("data","一条附加的信息");
                sendOrderedBroadcast(intent,null);
                break;
            case R.id.btnreg:
                if(receiver == null){
                    receiver = new MyReceiver();
                    registerReceiver(receiver,new IntentFilter(MyReceiver.ACTION));
                }
                break;
            case R.id.btnUnreg:
                if(receiver!=null){
                    unregisterReceiver(receiver);
                    receiver = null;
                }
                break;
        }
    }
    private MyReceiver receiver = null;
}
