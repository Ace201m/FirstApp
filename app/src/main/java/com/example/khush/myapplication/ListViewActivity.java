package com.example.khush.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        String[] food = {"paratha","sabzi","puri","raita","Baby corn","Roti","Aloo","Namkeen","Baingan","Waffle","Lassi","Naan","Pyaz","Onion"};
        ListAdapter foodAdapter = new CustomAdapter(this,food);
        ListView foodList = (ListView) findViewById(R.id.abcdefg);
        foodList.setAdapter(foodAdapter);

        foodList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String text = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(ListViewActivity.this, text , Toast.LENGTH_SHORT).show();
                    }
                }
        );


    }
}
