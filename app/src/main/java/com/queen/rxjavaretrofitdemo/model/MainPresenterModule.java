package com.queen.rxjavaretrofitdemo.model;

import com.queen.rxjavaretrofitdemo.activity.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/4/17.
 */
@Module
public class MainPresenterModule {
    private MainView mainView;
    public MainPresenterModule(MainView mainView){
        this.mainView=mainView;
    }
    @Provides
    public MainView provideMainView(){
        return mainView;
    }
}
