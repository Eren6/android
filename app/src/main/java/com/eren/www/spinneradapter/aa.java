package com.eren.www.spinneradapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class aa extends Activity {

    private int aa=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa);

        LinearLayout linnerlayout=new LinearLayout(this);
        linnerlayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linnerlayout.setLayoutParams(params);

//        TextView tv=new TextView(this);
//        tv.setText("nihao");
//        tv.setTextSize(30);
//
//        tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                aa++;
//                ViewGroup pav=(ViewGroup)view.getParent();
//                TextView tv1=new TextView(aa.this);
//                tv1.setText("我是动态生成的！"+aa);
//                tv1.setTextSize(25);
//                tv1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ViewGroup paview=(ViewGroup)view.getParent();
//                        paview.removeView(view);
//                    }
//                });
//                pav.addView(tv1);
//            }
//        });
//        linnerlayout.addView(tv);

        LayoutInflater inflater=getLayoutInflater();
        View view1=inflater.inflate(R.layout.aaa,null);
        View view2=inflater.inflate(R.layout.aaa,null);
        LinearLayout lay1=(LinearLayout) findViewById(R.id.lay1);
        lay1.addView(view1);
        lay1.addView(view2);
        //this.setContentView(linnerlayout);
    }
}
