package com.eren.www.spinneradapter;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private  String [] ss=new String[]{
            "北京","南京","上海"
    };
    private ArrayList<String> list=new ArrayList<>();
    private Spinner spn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add("java");
        list.add("C++");
        list.add("C#");

        spn=(Spinner)findViewById(R.id.spn);
        //BaseAdapter adapter=new myAdapter();
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ss);
        spn.setAdapter(adapter);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,list.get(i),Toast.LENGTH_SHORT).show();
//                TextView tv=(TextView)view;
//                Toast.makeText(MainActivity.this,tv.getText(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
            }
        });

    }
    private class  myAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            //return ss.length;
            return list.size();
        }
        @Override
        public Object getItem(int i) {
            return null;
        }
        @Override
        public long getItemId(int i) {
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textview=new TextView(MainActivity.this);
            //textview.setText(ss[i]);
            textview.setText(list.get(i));
            return textview;
        }
    }
}
