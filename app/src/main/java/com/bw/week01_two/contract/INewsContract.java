package com.bw.week01_two.contract;

import com.bw.week01_two.entity.NewsEntity;

/**
 * 时间 :2019/12/2  19:01
 * 作者 :苗恒
 * 功能 :
 */
public interface INewsContract {
    interface Model{
      void getData(String url,ModelCallBack modelCallBack);
      interface ModelCallBack{
          void success(NewsEntity newsEntity);
      }
    }
    interface view{
        void success(NewsEntity newsEntity);
        void finear(Throwable throwable);
    }
    interface Presenter{
         void getData(String url);
    }
}
