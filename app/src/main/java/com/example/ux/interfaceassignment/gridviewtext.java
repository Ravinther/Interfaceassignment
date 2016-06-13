package com.example.ux.interfaceassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ravi on 6/13/2016.
 */
public class gridviewtext extends Activity {
    GridView gridView;
    String[] text1={"GingerBread","Honeycomb","Icecream","JellyBean","KitKat","Lollipop"};
    int[] images={R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icream,R.drawable.jelly,R.drawable.kitkat,R.drawable.lollipop};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);
        gridView=(GridView)findViewById(R.id.grid1);
        gridView.setAdapter(new gridadapter(text1,images));
    }
    class gridadapter extends BaseAdapter
    {
        String[] title;
        int[] img;

        gridadapter()
        {
            title=null;
            img=null;
        }
        public gridadapter(String[] getTitle,int[] imag)
        {
            title=getTitle;
            img=imag;
        }
        public int getCount()
        {
            return title.length;
        }
        public Object getItem(int position)
        {
        return  null;
        }
        public long getItemId(int position)
        {
            return position;
        }

        public View getView(int position,View view,ViewGroup viewGroup)
        {
            LayoutInflater layoutInflater=getLayoutInflater();
            View row;
            row=layoutInflater.inflate(R.layout.imagestext,viewGroup,false);
            TextView Title;
            ImageView imgg;
            Title=(TextView)row.findViewById(R.id.text1);
            imgg=(ImageView)row.findViewById(R.id.image1);
            Title.setText(title[position]);
            imgg.setImageResource(img[position]);

            return row;
        }
    }
}
