package com.example.andapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.resultTV);
    }

    public void methodToDo(View view) {
        this.count++;
        String st = getString(R.string.textOnTextBox) + count;
        tv.setText(st);
    }
}
