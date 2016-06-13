package com.example.ux.interfaceassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ravi on 6/13/2016.
 */
public class listviewadapter extends Activity {
    ListView lv;
    String[] text1={"Ravinther","Kevin","Arun","Pravin","Nithin","Karthick","Bala","Ashwin"};
    String[] text2={"9600673341","9566895120","9443126403","8974562300","9566648576","8080808080","8754443632","9751410036"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listtview);
        lv=(ListView)findViewById(R.id.listview1);
        lv.setAdapter(new lstviewadapter(text1,text2));
    }
    class lstviewadapter extends BaseAdapter
    {
        String[] txt1,txt2;

        lstviewadapter()
        {
            txt1=null;
            txt2=null;
        }
        public lstviewadapter(String[] textview1,String[] textview2)
        {
            txt1=textview1;
            txt2=textview2;
        }
        public int getCount()
        {
            return txt1.length;
        }
        public Object getItem(int position)
        {
            return null;
        }
        public long getItemId(int position)
        {
            return position;
        }

        public View getView(int position,View view,ViewGroup viewGroup)
        {
            LayoutInflater layoutInflater=getLayoutInflater();
           View row= layoutInflater.inflate(R.layout.listviewdes, viewGroup, false);
            TextView Title1,Title2;
            Title1=(TextView)row.findViewById(R.id.textview1);
            Title2=(TextView)row.findViewById(R.id.textview2);
            Title1.setText(txt1[position]);
            Title2.setText(txt2[position]);

            return row;
        }
    }
}
