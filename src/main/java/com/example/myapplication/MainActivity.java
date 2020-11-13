package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Log.i("MainActivity","调用onCreate()");

        Button normalBtn = findViewById(R.id.start_normal_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent1);
            }
        });
        Button dialogBtn = findViewById(R.id.start_dialog_activity);
        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent2);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","调用onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","调用onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","调用onStop()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","调用onStart()");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity ","调用onDestroy()");
    }
}
