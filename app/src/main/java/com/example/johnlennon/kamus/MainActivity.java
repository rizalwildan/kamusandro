package com.example.johnlennon.kamus;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;



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
