package com.example.subba.eventhandlingvibgyor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TextView01: {
                Log.d(TAG,"You Clicked Red");
                Toast.makeText(getBaseContext(), "You Clicked Red", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.TextView02: {
                Log.d(TAG,"You Clicked Orange");
                Toast.makeText(getBaseContext(), "You Clicked Orange", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.TextView03: {
                Log.d(TAG,"You Clicked Yellow");
                Toast.makeText(getBaseContext(), "You Clicked Yellow", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.TextView04: {
                Log.d(TAG,"You Clicked Green");
                Toast.makeText(getBaseContext(), "You Clicked Green", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.TextView05: {
                Log.d(TAG,"You Clicked Blue");
                Toast.makeText(getBaseContext(), "You Clicked Blue", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.TextView06: {
                Log.d(TAG,"You Clicked Indigo");
                Toast.makeText(getBaseContext(), "You Clicked Indigo", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.TextView07: {
                Log.d(TAG,"You Clicked Violet");
                Toast.makeText(getBaseContext(), "You Clicked Violet", Toast.LENGTH_SHORT).show();
                break;
            }
            default: {
                Log.d(TAG, "You Clicked Nothing");
                Toast.makeText(getBaseContext(), "Not Clicked Anything", Toast.LENGTH_LONG).show();
            }
        }
    }
}

