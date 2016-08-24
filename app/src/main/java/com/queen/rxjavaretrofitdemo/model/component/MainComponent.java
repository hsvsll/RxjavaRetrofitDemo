package com.queen.rxjavaretrofitdemo.model.component;

import com.queen.rxjavaretrofitdemo.activity.MainActivity;
import com.queen.rxjavaretrofitdemo.http.HttpMethods;

import dagger.Component;

/**
 * Created by Administrator on 2016/4/17.
 */
@Component(modules = { HttpMethods.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
