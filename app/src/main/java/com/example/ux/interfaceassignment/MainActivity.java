package com.example.ux.interfaceassignment;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gv=(GridView)findViewById(R.id.gridview1);
        gv.setAdapter(new gridviewAdaper(this));
    }
}
