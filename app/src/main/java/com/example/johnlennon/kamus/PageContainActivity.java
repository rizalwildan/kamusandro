package com.example.johnlennon.kamus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by John Lennon on 6/4/2015.
 */
public class PageContainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        Bundle extras = getIntent().getExtras();
        int[] arrayB = extras.getIntArray("number");

        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText("" + arrayB);
        setContentView(textView);

    }
}
