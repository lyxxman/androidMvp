package com.ly.baseproject.model.modelImpl;

import android.content.Context;

import com.ly.baseproject.model.MainActivityModel;
import com.ly.baseproject.net.request.GetIndexNewTopV1Request;
import com.ly.baseproject.net.response.IndexNewTopResponse;
import com.ly.baseproject.presenter.presenterImpl.MainActivityPresenterImpl;

/**
 * Created date on 2016/6/25 0025.
 * describe :xxxx
 * author : ly
 * email : 839482621@qq.com
 */
public class MainActivityModelImpl implements MainActivityModel {
   private MainActivityPresenterImpl.MainActivityLoadListener mainActivityLoadListener;

    public MainActivityModelImpl(MainActivityPresenterImpl.MainActivityLoadListener mainActivityLoadListener) {
        this.mainActivityLoadListener = mainActivityLoadListener;
    }

    @Override
    public void getIndexTopData(Context context) {
         new GetIndexTopDataTask().request(context);
    }
    private class GetIndexTopDataTask extends GetIndexNewTopV1Request {
        @Override
        public void onPostExecute(IndexNewTopResponse indexNewTopResponse) {
            if(mainActivityLoadListener!=null) {
                mainActivityLoadListener.onLoadTopDataSuccess(indexNewTopResponse);
            }
        }

        @Override
        public void onErrorExecute(String error) {
            if(mainActivityLoadListener!=null) {
                mainActivityLoadListener.onLoadTopDataError(error);
            }
        }
    }
}
