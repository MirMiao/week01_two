package com.bw.week01_two.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bw.week01_two.R;
import com.bw.week01_two.base.BaseActivity;
import com.bw.week01_two.view.fragment.HomeFragment;
import com.bw.week01_two.view.fragment.MyFragment;
import com.bw.week01_two.view.fragment.NewsFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {


    private ViewPager viewPager;
    private RadioGroup radioGroup;

    @Override
    protected void initData() {
        final List<Fragment> list=new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new NewsFragment());
        list.add(new MyFragment());
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

    }

    @Override
    protected void initView() {
        viewPager = findViewById(R.id.vp);
        radioGroup = findViewById(R.id.rg);

    }

    @Override
    protected int bindLayoutid() {
        return R.layout.activity_main;
    }
    public void tiao(){
        viewPager.setCurrentItem(1);
    }
}
