package com.bw.week01_two.view.fragment;

import android.view.View;
import android.webkit.WebView;
import android.widget.ListView;
import android.widget.TabHost;

import com.bw.week01_two.R;
import com.bw.week01_two.adapter.ProductAdapter;
import com.bw.week01_two.base.BaseFragment;
import com.bw.week01_two.contract.INewsContract;
import com.bw.week01_two.entity.NewsEntity;
import com.bw.week01_two.presenter.NewsPresenter;
import com.bw.week01_two.util.NetUtil;

import java.util.List;

/**
 * 时间 :2019/12/2  19:31
 * 作者 :苗恒
 * 功能 :
 */
public class NewsFragment extends BaseFragment  implements INewsContract.view {

    private ListView listView;

    @Override
    protected void initData() {
         //判断有没有网
        NewsPresenter newsPresenter = new NewsPresenter(this);
        newsPresenter.getData("http://172.17.8.100/small/commodity/v1/commodityList");
    }

    @Override
    protected void initView(View inflate) {
        listView = inflate.findViewById(R.id.lv);
    }

    @Override
    protected int bindLayoutid() {
        return R.layout.newsfragment;
    }

    @Override
    public void success(NewsEntity newsEntity) {
           //成功的对象
        List<NewsEntity.ResultBean.RxxpBean.CommodityListBean> commodityList = newsEntity.getResult().getRxxp().getCommodityList();
        ProductAdapter productAdapter = new ProductAdapter(getActivity(),commodityList);
        listView.setAdapter(productAdapter);
    }

    @Override
    public void finear(Throwable throwable) {

    }
}
