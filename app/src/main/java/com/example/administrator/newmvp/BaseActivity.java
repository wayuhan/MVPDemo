package com.example.administrator.newmvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.newmvp.Presenter.IPresenter;
import com.example.administrator.newmvp.View.IBaseView;

public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IBaseView {
    //P层主导
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            int layoutResID = getLayoutResId(savedInstanceState);
            if (layoutResID != 0) {
                setContentView(layoutResID);
                //创建P对象
                mPresenter = createPresenter();
                if (mPresenter != null) {
                    //绑定View
                    mPresenter.attachView(this);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        initData(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        //把所有的数据销毁掉
        if (mPresenter != null)
            mPresenter.onDestroy();//释放资源
        this.mPresenter = null;
        super.onDestroy();
    }

    //每个activity都需要创建Presenter
    public abstract P createPresenter();

    //每个activity都需要创建setLayoutId
    public abstract int getLayoutResId(Bundle savedInstanceState);

    public abstract void initData(Bundle savedInstanceState);

    @Override
    public void Onloading() {

    }
    @Override
    public void Ondismiss() {

    }
}
