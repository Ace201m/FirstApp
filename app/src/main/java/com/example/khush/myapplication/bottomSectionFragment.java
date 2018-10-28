package com.example.khush.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;

public class bottomSectionFragment extends Fragment {

    private static TextView topTextView;
    private static TextView bottomTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.meme_bottom_frag,container,false);
        topTextView = (TextView) view.findViewById(R.id.topTextView);
        bottomTextView = (TextView) view.findViewById(R.id.bottomTextView);
        return view;
    }

    public void makeMeme(String top, String bottom) {
        topTextView.setText(top);
        bottomTextView.setText(bottom);
    }
}
