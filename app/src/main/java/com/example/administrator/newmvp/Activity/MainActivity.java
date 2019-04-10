package com.example.administrator.newmvp.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.Toast;

import com.example.administrator.newmvp.BaseActivity;
import com.example.administrator.newmvp.Bean.Entity;
import com.example.administrator.newmvp.Presenter.FirstPresenter;
import com.example.administrator.newmvp.R;
import com.example.administrator.newmvp.View.LoginView;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<FirstPresenter> implements LoginView {

    private Fragment one1;
    private Fragment two1;
    private Fragment three1;
    private Fragment four1;
    private Fragment[] fragments;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    public FirstPresenter createPresenter() {

        return new FirstPresenter(this);
    }


    @Override
    public int getLayoutResId(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        ButterKnife.bind(this);
        initFragment();
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
        return "";
    }

    @Override
    public String getPwd() {
        return "";
    }

    @Override
    public String getRid() {
        return "123456";
    }

    @Override
    public void Onloading() {
        Toast.makeText(MainActivity.this, "显示加载中dialog", Toast.LENGTH_LONG).show();
    }

    @Override
    public void Ondismiss() {
        Toast.makeText(MainActivity.this, "隐藏加载中dialog", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    /**
     * 添加fragment
     */
    public void initFragment() {
        fragments = new Fragment[4];
        fragmentManager = getSupportFragmentManager();
        one1 = fragmentManager.findFragmentById(R.id.first);
        two1= fragmentManager.findFragmentById(R.id.two);
        three1= fragmentManager.findFragmentById(R.id.three);
        four1= fragmentManager.findFragmentById(R.id.four);
        fragmentTransaction = fragmentManager.beginTransaction()
                .hide(one1)
                .hide(two1)
                .hide(three1)
                .hide(four1);
        fragmentTransaction.show(one1).commit();
    }
}
