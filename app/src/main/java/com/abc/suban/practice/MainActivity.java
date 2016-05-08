package com.abc.suban.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is git test
        //aasdas
        // asadasd
        /// aaasss
        ///aasds
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("check", "onStart");
        //hello
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
