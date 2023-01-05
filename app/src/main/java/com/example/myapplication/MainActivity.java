package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LIFECYCLE ",getLocalClassName() + ": ici onCreate");
    }

    public void finish(View view) {
        finish();
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
        System.exit(0);
    }

    public void goToFakeActivity(View view) {
        startActivity(new Intent(this,FakeActivity.class));
    }

    public void goToSecondFakeActivity(View view) {
        startActivity(new Intent(this,SecondFakeActivity.class));
    }

    public void startDialog(View view) {
        startActivity(new Intent(this,Dialog.class));
    }
}