package com.example.fan.ex03_12;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new Binder();//返回一个系统提供的IBinder对象
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
////                while(true){
////                    System.out.println("服务正在执行。。。。。");
////                    try{
////                        sleep(1200);
////                    }catch(Exception e){
////                        e.printStackTrace();
////                    }
////                }
////            }
//        }.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("service create");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("service destory");
    }
}
