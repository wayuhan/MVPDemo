package com.example.administrator.newmvp.Fragemnt;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.newmvp.BaseFragment;
import com.example.administrator.newmvp.Bean.Entity;
import com.example.administrator.newmvp.Presenter.FirstPresenter;
import com.example.administrator.newmvp.R;
import com.example.administrator.newmvp.View.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class FirstFragemnt extends BaseFragment<FirstPresenter> implements LoginView {
    @BindView(R.id.tv_click)
    TextView tvClick;
    Unbinder unbinder;

    @Override
    public int getLayoutResId() {
        return R.layout.fragmentone;
    }

    @Override
    public void finishCreateView(Bundle state) {
//        mPresenter.login();
    }

    @Override
    public FirstPresenter createPresenter() {
        return new FirstPresenter(this);
    }

    @Override
    public void OnSuccess(Entity bean) {
        Log.v("---------1", String.valueOf(bean.getData().getBulletList().size()));
        String s = bean.getData().getBulletList().get(0);
        Log.v("---------2", s);
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.tv_click)
    public void onViewClicked() {
        mPresenter.login();
    }
}
