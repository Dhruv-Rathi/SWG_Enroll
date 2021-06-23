package com.dhruvrathiandroid.swg_enroll;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void enrollStudent(View view) {
        EditText edit = (EditText)findViewById(R.id.nameInput);
        EditText edit2 = (EditText)findViewById(R.id.rollInput);
        String name = edit.getText().toString();
        String roll = edit2.getText().toString();
        Intent intent = new Intent(this, activityWelcome.class);
        intent.putExtra("roll",roll);
        intent.putExtra("name",name);
        Toast.makeText(this,name+" is enrolled",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}