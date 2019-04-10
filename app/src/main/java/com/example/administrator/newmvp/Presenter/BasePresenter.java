package com.example.administrator.newmvp.Presenter;

import com.example.administrator.newmvp.View.IBaseView;

public abstract class BasePresenter <V extends IBaseView> implements IPresenter<V> {
    //View 显示回显的接口
    protected V mRootView;

    public BasePresenter() {
        onStart();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onDestroy() {
        this.mRootView = null;
    }

    @Override
    public void attachView(V view) {
        this.mRootView = view;
    }

    @Override
    public V getView() {
        return mRootView;
    }
}
