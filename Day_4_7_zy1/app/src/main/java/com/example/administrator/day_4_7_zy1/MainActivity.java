package com.example.administrator.day_4_7_zy1;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //苏园
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        vp = (ViewPager) findViewById(R.id.vp);
        ArrayList<Fragment> fragments = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        fragments.add(new ListFragment());
        fragments.add(new CollectFragment());
        list.add("首页");
        list.add("收藏");
        VpAdapter adapter = new VpAdapter(getSupportFragmentManager(), fragments, list);
        vp.setAdapter(adapter);
        tab.setupWithViewPager(vp);
    }
}
