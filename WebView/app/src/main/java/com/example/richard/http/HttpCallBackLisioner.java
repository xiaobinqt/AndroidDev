package com.example.richard.http;

/**
 * Created by Richard on 2018/1/3.
 */

public interface HttpCallBackLisioner {
    public void onFinish(String requestString);
    public void onError(Exception e);
}
