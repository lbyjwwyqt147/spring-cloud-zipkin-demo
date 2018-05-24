package com.jwell.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 9211083682580290298L;
    private String userId;
    private String name;
    private Byte sex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }
}
