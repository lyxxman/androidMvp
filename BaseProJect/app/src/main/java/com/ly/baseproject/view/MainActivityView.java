package com.ly.baseproject.view;

import com.ly.baseproject.net.response.IndexNewTopResponse;

/**
 * Created date on 2016/6/25 0025.
 * describe :MainActivityView接口类
 * author : ly
 * email : 839482621@qq.com
 */
public interface MainActivityView {
    /**
     * 设置首页顶部数据
     * @param indexNewTopResponse 顶部数据返回类
     */
    public void setIndexNewTopData(IndexNewTopResponse indexNewTopResponse);

    /**
     * 加载顶部数据失败
     * @param error 失败字符串
     */
    public void showToast(String error);

    public void hideLoadProgress();
}
