package com.dove.flyer.fuckthirdpart;

import javax.inject.Inject;

/**
 * Created by flyer on 2016/11/9.
 */

public class User {
    int age;

    @Inject
    public User(){

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
