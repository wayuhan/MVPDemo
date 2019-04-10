package com.example.administrator.newmvp;


import com.example.administrator.newmvp.Bean.Entity;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

/**
 * Created by Administrator on 2018/4/23.
 */

public interface RequestServices {

    /**
     * 登录
     *
     * @return
     */
    @POST("api/bullet")
    Observable<Entity> login(@Body RequestBody requestBody);
}
