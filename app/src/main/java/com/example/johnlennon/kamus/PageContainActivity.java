package com.example.johnlennon.kamus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by John Lennon on 6/4/2015.
 */
public class PageContainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_content);

        Intent intent = getIntent();


    }
}
