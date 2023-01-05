package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FakeActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextTextPersonName);
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
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void copier(View view) {
        String text = (String) editText.getText().toString();
        textView.setText(text);
    }
}