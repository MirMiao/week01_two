package com.bw.week01_two.model;

import com.bw.week01_two.contract.INewsContract;
import com.bw.week01_two.entity.NewsEntity;
import com.bw.week01_two.util.NetUtil;
import com.google.gson.Gson;


/**
 * 时间 :2019/12/2  19:14
 * 作者 :苗恒
 * 功能 :    处理数据
 */
public class NewsModel implements  INewsContract.Model{
    @Override
    public void getData(String url, final ModelCallBack modelCallBack) {
        NetUtil.getInstance().getJson(url, new NetUtil.MyCallBack() {
            @Override
            public void getjsonData(String json) {
                NewsEntity newsEntity = new Gson().fromJson(json, NewsEntity.class);
                modelCallBack.success(newsEntity);
            }
        });
    }
}
