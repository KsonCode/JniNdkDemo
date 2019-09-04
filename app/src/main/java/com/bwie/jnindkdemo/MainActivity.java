package com.bwie.jnindkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("hellojni");
    }

    String string = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        string = getString();

        System.out.println("jni======"+string);


    }


    /**
     * 获取字符串秘钥
     * @return
     */
    public native String getString();
}
