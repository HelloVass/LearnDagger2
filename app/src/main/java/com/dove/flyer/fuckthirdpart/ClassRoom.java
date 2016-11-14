package com.dove.flyer.fuckthirdpart;

import javax.inject.Inject;

/**
 * Created by flyer on 2016/11/11.
 */

public class ClassRoom {

    User mUser;

    @Inject
    public ClassRoom(User user){
        this.mUser = user;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }
}
