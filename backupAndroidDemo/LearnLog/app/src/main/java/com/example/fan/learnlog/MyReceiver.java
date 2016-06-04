package com.example.fan.learnlog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }
    public static final String ACTION = "com.example.fan.learnlog.intent.action.Myreceiver" ;
    @Override
    public void onReceive(Context context, Intent intent) {
//        System.out.println("收到了信息"+intent.getStringExtra("data"));
    Log.i("reg","MyReceiver接收到了一条信息");
        abortBroadcast();
    }
}
