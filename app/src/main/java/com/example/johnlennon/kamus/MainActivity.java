package com.example.johnlennon.kamus;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fts = fm.beginTransaction();


        Configuration configInfo = getResources().getConfiguration();

        if (configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            fragmentLandscape fragmentLandscape = new fragmentLandscape();
            fts.replace(android.R.id.content, fragmentLandscape);

        }
        else
        {
            fragmentPotrait fragmentPotrait = new fragmentPotrait();
            fts.replace(android.R.id.content, fragmentPotrait);

        }

        fts.commit();

        View.OnClickListener listener = new View.OnClickListener()
        {
            public void onClick(View v){
            switch (v.getId())
            {
                case R.id.transport_btn:
                    Log.d("Button", "Click Transport");
                    break;

                case R.id.hewan_btn:
                    Log.d("Button", "Click Hewan");
                    break;

                case R.id.tumbuhan_btn:
                    Log.d("Button", "Clcik tumbuhan");
                    break;

                case R.id.profesi_btn:
                    Log.d("Button", "Click Profesi");
                    break;
            }
            }
        };
        findViewById(R.id.transport_btn).setOnClickListener(listener);
        findViewById(R.id.hewan_btn).setOnClickListener(listener);
        findViewById(R.id.tumbuhan_btn).setOnClickListener(listener);
        findViewById(R.id.profesi_btn).setOnClickListener(listener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
