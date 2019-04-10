package com.example.administrator.newmvp.Presenter;

import com.example.administrator.newmvp.Bean.Entity;
import com.example.administrator.newmvp.Model.LoginNet;
import com.example.administrator.newmvp.Model.LoginNetIml;
import com.example.administrator.newmvp.Presenter.OnListener.ComitOnListener;
import com.example.administrator.newmvp.Presenter.OnListener.LoginOnListener;
import com.example.administrator.newmvp.View.LoginView;

public class FirstPresenter extends BasePresenter<LoginView> {
    private LoginNet baseNet;
    private LoginView loginView;
    public FirstPresenter(LoginView loginView) {
        this.loginView=loginView;
        baseNet = new LoginNetIml();
    }
    public void login(){
        loginView.Onloading();
        baseNet.Login(loginView.getUserName(), loginView.getPwd(), loginView.getRid(), new LoginOnListener() {
            @Override
            public void onSuccess(Entity mString) {
                loginView.OnSuccess(mString);
                loginView.Ondismiss();
            }

            @Override
            public void onError() {
                loginView.Onfail("");
                loginView.Ondismiss();
            }
        });
    }

    public void comit(){
        loginView.Onloading();
        baseNet.Comit(loginView.getUserName(), new ComitOnListener() {
            @Override
            public void onSuccess(Entity mString) {
                loginView.OnSuccess(mString);
                loginView.Ondismiss();
            }

            @Override
            public void onError() {
                loginView.Onfail("");
                loginView.Ondismiss();
            }
        });
    }
}
