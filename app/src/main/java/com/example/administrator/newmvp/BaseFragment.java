package com.example.administrator.newmvp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.newmvp.Presenter.IPresenter;
import com.example.administrator.newmvp.View.IBaseView;

import io.reactivex.annotations.Nullable;

public abstract class BaseFragment <P extends IPresenter>extends Fragment implements IBaseView{
    private View parentView;
    protected FragmentActivity activity;
    protected P mPresenter;



    @LayoutRes
    public abstract int getLayoutResId();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();//创建presenter
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state) {
        parentView = inflater.inflate(getLayoutResId(), container, false);
        activity = getActivity();
        return parentView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        finishCreateView(savedInstanceState);
    }

    /**
     * 初始化views
     *
     * @param state
     */
    public abstract void finishCreateView(Bundle state);
    public abstract P createPresenter();

    @Override
    public void onDestroy() {
        if (mPresenter != null)
            mPresenter.onDestroy();//释放资源
        this.mPresenter = null;
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.activity = null;
    }
}
