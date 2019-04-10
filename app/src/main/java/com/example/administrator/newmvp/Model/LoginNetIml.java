package com.example.administrator.newmvp.Model;

import com.example.administrator.newmvp.Bean.Entity;
import com.example.administrator.newmvp.Presenter.OnListener.ComitOnListener;
import com.example.administrator.newmvp.Presenter.OnListener.LoginOnListener;
import com.trust.modular.TrustRetrofitCallBack;

import java.util.HashMap;
import java.util.Map;

import static com.example.administrator.newmvp.MainApplication.mAppRetrofit;
import static com.example.administrator.newmvp.MainApplication.mRequstServices;

public class LoginNetIml implements LoginNet {
    @Override
    public void Login(String name, String pwd, String resid, final LoginOnListener loginOnListener) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> DataBean = new HashMap();
        DataBean.put("userId", "112");
        DataBean.put("channelid", "");
        map.put("param", DataBean);
        mAppRetrofit.connection(mRequstServices.login(mAppRetrofit.addJsonParms(map)), new TrustRetrofitCallBack<Entity>() {
            @Override
            public void accept(Entity entity) {
                if (entity.getCode() == 200) {
                    loginOnListener.onSuccess(entity);
                }
            }

            @Override
            public void failure(Throwable error) {
                loginOnListener.onError();
            }
        });
    }

    @Override
    public void Comit(String name, final ComitOnListener comitOnListener) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> DataBean = new HashMap();
        DataBean.put("userId", "112");
        DataBean.put("channelid", "");
        map.put("param", DataBean);
        mAppRetrofit.connection(mRequstServices.login(mAppRetrofit.addJsonParms(map)), new TrustRetrofitCallBack<Entity>() {
            @Override
            public void accept(Entity entity) {
                if (entity.getCode() == 200) {
                    comitOnListener.onSuccess(entity);
                }
            }

            @Override
            public void failure(Throwable error) {
                comitOnListener.onError();
            }
        });
    }

}
