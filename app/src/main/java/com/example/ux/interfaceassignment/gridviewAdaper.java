package com.example.ux.interfaceassignment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.concurrent.RecursiveTask;

/**
 * Created by Ravi on 6/13/2016.
 */
public class gridviewAdaper extends BaseAdapter
{
    private Context mcontext;
    public  Integer[] image={R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icream,R.drawable.jelly,R.drawable.kitkat,R.drawable.lollipop};
    public  gridviewAdaper(Context c)
    {
        mcontext=c;
    }
    public int getCount()
    {
        return image.length;
    }

    public Object getItem(int position)
    {
        return null;
    }

    public long getItemId(int position)
    {
        return 0;
    }

    public View getView(int position,View view,ViewGroup viewGroup)
    {
        ImageView imageView;

        if (view==null)
        {
            imageView=new ImageView(mcontext);
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }
        else
        {
            imageView=(ImageView)view;
        }
        imageView.setImageResource(image[position]);
        return imageView;
    }

}
