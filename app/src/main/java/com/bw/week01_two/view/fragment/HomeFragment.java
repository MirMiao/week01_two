package com.bw.week01_two.view.fragment;

import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import com.bw.week01_two.R;
import com.bw.week01_two.base.BaseFragment;
import com.bw.week01_two.contract.INewsContract;
import com.bw.week01_two.entity.NewsEntity;
import com.bw.week01_two.view.activity.MainActivity;

/**
 * 时间 :2019/12/2  18:28
 * 作者 :苗恒
 * 功能 :
 */
public class HomeFragment extends BaseFragment {

    private Button button;

    @Override
    protected void initData() {
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               MainActivity mainActivity= (MainActivity) getActivity();
               mainActivity.tiao();
           }
       });
    }

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.bt);
    }

    @Override
    protected int bindLayoutid() {
        return R.layout.homefragment;
    }


}
