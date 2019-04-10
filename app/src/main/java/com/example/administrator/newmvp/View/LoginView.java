package com.example.administrator.newmvp.View;

import com.example.administrator.newmvp.Bean.Entity;

public interface LoginView extends IBaseView{
    void OnSuccess(Entity bean);
    void Onfail(String msg);

    String getUserName();
    String getPwd();
    String getRid();


}
