package com.example.administrator.newmvp.Presenter;

import com.example.administrator.newmvp.View.IBaseView;

public interface IPresenter<T extends IBaseView> {
    /**
     * 做一些初始化操作
     */
    void onStart();

    /**
     * 销毁
     */
    void onDestroy();

    /**
     * 绑定View
     */
    void attachView(T view);

    T getView();
}
