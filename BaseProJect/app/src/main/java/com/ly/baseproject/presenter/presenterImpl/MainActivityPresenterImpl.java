package com.ly.baseproject.presenter.presenterImpl;

import android.content.Context;

import com.ly.baseproject.model.MainActivityModel;
import com.ly.baseproject.model.modelImpl.MainActivityModelImpl;
import com.ly.baseproject.net.request.GetIndexNewTopV1Request;
import com.ly.baseproject.net.response.IndexNewTopResponse;
import com.ly.baseproject.presenter.MainActivityPresenter;
import com.ly.baseproject.view.MainActivityView;


/**
 * Created date on 2016/4/29 0029.
 * describe :MainActivity业务处理类
 * author : ly
 * email : 839482621@qq.com
 */
public class MainActivityPresenterImpl implements MainActivityPresenter, MainActivityPresenter.MainActivityLoadListener {
    private  Context mContext;
    private MainActivityModel mMainActivityModel;
    private MainActivityView mMainActivityView;
    public MainActivityPresenterImpl(Context mContext,MainActivityView mainActivityView) {
        this.mContext = mContext;
        mMainActivityModel = new MainActivityModelImpl(this);
        mMainActivityView = mainActivityView;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void getTopData() {
        mMainActivityModel.getIndexTopData(mContext);
    }


    @Override
    public void onLoadTopDataSuccess(IndexNewTopResponse indexNewTopResponse) {
        mMainActivityView.setIndexNewTopData(indexNewTopResponse);
    }
    @Override
    public void onLoadTopDataError(String error) {
        mMainActivityView.hideLoadProgress();
        mMainActivityView.showToast(error);
    }

    @Override
    public void onLoadMiddleDataSuccess() {

    }

    @Override
    public void onLoadBottomDataError() {

    }
}
