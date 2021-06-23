package com.dhruvrathiandroid.swg_enroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activityWelcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        String roll = getIntent().getStringExtra("roll");
        String name = getIntent().getStringExtra("name");
        TextView textView = (TextView)findViewById(R.id.textView3);
        textView.setText(roll+" successfully enrolled. Welcome "+name+"!!");

    }
}