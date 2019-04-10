package com.example.administrator.newmvp.Fragemnt;

import android.os.Bundle;

import com.example.administrator.newmvp.BaseFragment;
import com.example.administrator.newmvp.Bean.Entity;
import com.example.administrator.newmvp.Presenter.FirstPresenter;
import com.example.administrator.newmvp.R;
import com.example.administrator.newmvp.View.LoginView;

public class FourFragment extends BaseFragment<FirstPresenter> implements LoginView {
    @Override
    public int getLayoutResId() {
        return R.layout.fragmentone;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }

    @Override
    public FirstPresenter createPresenter() {
        return new FirstPresenter(this);
    }

    @Override
    public void OnSuccess(Entity bean) {

    }

    @Override
    public void Onfail(String msg) {

    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPwd() {
        return null;
    }

    @Override
    public String getRid() {
        return null;
    }

    @Override
    public void Onloading() {

    }

    @Override
    public void Ondismiss() {

    }
}
