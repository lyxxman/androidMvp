package com.ly.baseproject.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ly.baseproject.R;
import com.ly.baseproject.application.BaseActivity;
import com.ly.baseproject.net.response.IndexNewTopResponse;
import com.ly.baseproject.presenter.MainActivityPresenter;
import com.ly.baseproject.presenter.presenterImpl.MainActivityPresenterImpl;
import com.ly.baseproject.utils.ToastUtils;
import com.ly.baseproject.view.MainActivityView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainActivityView {

    @Bind(R.id.txt_test_hellor)
    TextView mTxtTestHellor;
    @Bind(R.id.txt_test_zl)
    TextView mTxtTestZl;
    private MainActivityPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMainPresenter = new MainActivityPresenterImpl(this, this);
        mMainPresenter.getTopData();

    }



    @OnClick({R.id.txt_test_hellor, R.id.txt_test_zl})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_test_hellor:
                ToastUtils.showMessage("hahahha");
                break;
            case R.id.txt_test_zl:
                break;
        }
    }

    @Override
    public void setIndexNewTopData(IndexNewTopResponse indexNewTopResponse) {

    }

    @Override
    public void showToast(String error) {
        ToastUtils.showMessage(error);
    }

    @Override
    public void hideLoadProgress() {

    }
}
