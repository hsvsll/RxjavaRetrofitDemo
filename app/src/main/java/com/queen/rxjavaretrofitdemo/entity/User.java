package com.queen.rxjavaretrofitdemo.entity;

import javax.inject.Inject;

/**
 * Created by clevo on 2015/6/10.
 */
public class User {

    private String id;
    private String name;

    @Inject
    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
