package com.ly.baseproject.presenter;

import com.ly.baseproject.net.response.IndexNewTopResponse;

/**
 * Created date on 2016/4/19 0019.
 * describe :mainActivity业务接口定义类
 * author : ly
 * email : 839482621@qq.com
 */
public interface MainActivityPresenter {

    /**
     * 当页面恢复
     */
    public void onResume();

    /**
     * 当页面结束
     */
    public void onDestroy();

    public void getTopData();
    public interface MainActivityLoadListener{
        public void onLoadTopDataSuccess(IndexNewTopResponse indexNewTopResponse);
        public void   onLoadTopDataError(String error);
        public void onLoadMiddleDataSuccess();
        public void onLoadBottomDataError();
    }
}
