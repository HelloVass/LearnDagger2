package com.dove.flyer.fuckthirdpart;

/**
 * Created by flyer on 2016/11/14.
 */

public class Subject {

    String mName;
    String mId;
    ClassRoom mClassRoom;
    User mUser;

    public Subject(ClassRoom classRoom){
        this.mName = "";
        this.mId = "";
        this.mClassRoom = classRoom;
        this.mUser = classRoom.getUser();
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
