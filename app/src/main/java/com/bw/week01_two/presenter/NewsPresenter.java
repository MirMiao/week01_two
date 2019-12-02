package com.bw.week01_two.presenter;

import com.bw.week01_two.contract.INewsContract;
import com.bw.week01_two.entity.NewsEntity;
import com.bw.week01_two.model.NewsModel;

/**
 * 时间 :2019/12/2  19:17
 * 作者 :苗恒
 * 功能 :
 */
public class NewsPresenter implements INewsContract.Presenter {
    INewsContract.view view;
    private NewsModel newsModel;
     public NewsPresenter(INewsContract.view view){
         this.view=view;
     }
    @Override
    public void getData(String url) {
       //获取Model的数据   并转发给view
        newsModel = new NewsModel();

        newsModel.getData(url, new INewsContract.Model.ModelCallBack() {
            @Override
            public void success(NewsEntity newsEntity) {
                    view.success(newsEntity);
            }
        });
    }
}
