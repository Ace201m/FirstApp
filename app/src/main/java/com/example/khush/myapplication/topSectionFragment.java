package com.example.khush.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.view.ViewGroup;

public class topSectionFragment extends Fragment {

    private static EditText topText;
    private static EditText bottomText;
    private static Button generateMeme;

    static topSectionListner activityCommander;

    public interface topSectionListner{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (topSectionListner) (Activity)context;

        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.meme_top_frag,container,false);

        topText = (EditText)view.findViewById(R.id.topText);
        bottomText = (EditText)view.findViewById(R.id.bottomText);
        generateMeme = (Button)view.findViewById(R.id.generateMeme);

        generateMeme.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v) {
                        generateMeme(v);
                    }
                }
        );

        return view;
    }

    public static void generateMeme(View view){
        activityCommander.createMeme(topText.getText().toString(),bottomText.getText().toString());
    }
}
