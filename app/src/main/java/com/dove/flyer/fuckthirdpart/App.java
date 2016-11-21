package com.dove.flyer.fuckthirdpart;

import android.app.Application;

/**
 * Created by flyer on 2016/11/21.
 */

public class App extends Application{


    static UserComponent sUserComponent;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static UserComponent getUserComponent(){
        if (sUserComponent == null){
            sUserComponent = DaggerUserComponent.builder().userModule(new UserModule())
                    .build();
        }
        return sUserComponent;
    }

    public static void releaseUserComponent(){
        sUserComponent = null;
    }


}
