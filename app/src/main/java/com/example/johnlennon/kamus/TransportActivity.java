package com.example.johnlennon.kamus;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by John Lennon on 6/4/2015.
 */
public class TransportActivity extends AppCompatActivity {
    ListView list;
    int[] images = {R.drawable.image, R.drawable.motor};
    String[] title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.list_view);

        Resources res = getResources();
        title = res.getStringArray(R.array.title);

        list = (ListView) findViewById(R.id.listView);
        arrayAdapter adapter = new arrayAdapter(this, title, images);
        list.setAdapter(adapter);

    }

    class arrayAdapter extends ArrayAdapter<String>
    {
        Context context;
        int[] images;
        String[] titleArray;
        arrayAdapter(Context c, String[] title, int imgs[])
        {
            super(c, R.layout.image_view, R.id.textView, title);
            this.context = c;
            this.images = imgs;
            this.titleArray = title;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            View row = convertView;
            if(row == null)
            {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.image_view, parent, false);
            }
            ImageView myImage = (ImageView) row.findViewById(R.id.imageView2);
            TextView title = (TextView) row.findViewById(R.id.textView);

            myImage.setImageResource(images[position]);
            title.setText(titleArray[position]);
            return row;
        }
    }

}
