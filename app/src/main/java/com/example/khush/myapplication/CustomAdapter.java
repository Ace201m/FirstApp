package com.example.khush.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {
    public CustomAdapter(Context context, String[] food) {
        super(context,R.layout.row, food);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myinflater = LayoutInflater.from(getContext());
        View customa = myinflater.inflate(R.layout.row,parent,false);
        String f = (String)getItem(position);
        TextView row_text = customa.findViewById(R.id.listTextView);
        ImageView img_view = customa.findViewById(R.id.imageView);
        row_text.setText(f);
        img_view.setImageResource(R.drawable.imgtest);
        return customa;
    }
}
