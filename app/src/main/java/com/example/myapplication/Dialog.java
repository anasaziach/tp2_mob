package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LIFECYCLE ",getLocalClassName() + ": ici onResumed");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LIFECYCLE ",getLocalClassName() + ": ici onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LIFECYCLE ",getLocalClassName() + ": ici onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LIFECYCLE ",getLocalClassName() + ": ici onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LIFECYCLE ",getLocalClassName() + ": ici onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LIFECYCLE ",getLocalClassName() + ": ici onDestroy");
    }
    public void finishDialog(View view) {
        finish();
    }
}