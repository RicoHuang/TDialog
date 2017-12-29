package com.timmy.tdialogdemo;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.timmy.tdialogdemo.ui.DialogEncapActivity;
import com.timmy.tdialogdemo.ui.DiffentDialogActivity;
import com.timmy.tdialogdemo.ui.NormalDFActivity;
import com.timmy.tdialogdemo.ui.SystemDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 系统Dialog使用
     *
     * @param view
     */
    public void systemDialog(View view) {
        startActivity(new Intent(this, SystemDialog.class));
    }

    /**
     * DialogFragment的使用
     *
     * @param view
     */
    public void NormalDF(View view) {
        startActivity(new Intent(this, NormalDFActivity.class));
    }

    /**
     * DialogFragment封装
     *
     * @param view
     */
    public void DialogEncap(View view) {
        startActivity(new Intent(this, DialogEncapActivity.class));
    }

    /**
     * 常用的各种Dialog
     *
     * @param view
     */
    public void diffentDialog(View view) {
//        Handler handler ;
//
//        //HandlerThread的使用
//        HandlerThread handlerThread = new HandlerThread("handlerThread");
//        handlerThread.start();
//        handler = new Handler(handlerThread.getLooper());
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
        startActivity(new Intent(this, DiffentDialogActivity.class));
    }
}