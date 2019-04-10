package com.example.administrator.newmvp.Model;

import com.example.administrator.newmvp.Presenter.OnListener.ComitOnListener;
import com.example.administrator.newmvp.Presenter.OnListener.LoginOnListener;

public interface LoginNet {
    void Login(String name,String pwd,String resid,LoginOnListener loginOnListener);
    void Comit(String name,ComitOnListener comitOnListener);
}
