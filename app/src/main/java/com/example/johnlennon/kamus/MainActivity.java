package com.example.johnlennon.kamus;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTransport = (Button) findViewById(R.id.transport_btn);
        Button btnHewan = (Button) findViewById(R.id.hewan_btn);
        Button btnBuah = (Button) findViewById(R.id.tumbuhan_btn);
        Button btnProfesi = (Button) findViewById(R.id.profesi_btn);

        btnTransport.setOnClickListener(this);
        btnHewan.setOnClickListener(this);
        btnBuah.setOnClickListener(this);
        btnProfesi.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.transport_btn:
                Log.d("Button1", "Button Transport");
                break;

            case R.id.hewan_btn:
                Log.d("Button2", "Button Hewan");
                break;

            case R.id.tumbuhan_btn:
                Log.d("Button3", "Button Buah");
                break;

            case R.id.profesi_btn:
                Log.d("Button4", "Button Profesi");
                break;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
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
