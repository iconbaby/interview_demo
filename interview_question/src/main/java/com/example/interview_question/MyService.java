package com.example.interview_question;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class MyService extends Service {
    private static final String TAG = "MyService";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.d(TAG, "onBind: ");
//        new Thread(){
//            @Override
//            public void run() {
//                while(true){
//                    Log.d(TAG, "run: ");
//                }
//            }
//        }.start();
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        new Thread(){
            @Override
            public void run() {
                while(true){
                    Log.d(TAG, "run: ");
                }
            }
        }.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
