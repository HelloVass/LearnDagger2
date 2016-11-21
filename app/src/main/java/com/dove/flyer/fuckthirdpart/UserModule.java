package com.dove.flyer.fuckthirdpart;

import com.dove.flyer.fuckthirdpart.annotation.UserScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by flyer on 2016/11/21.
 */

@Module
public class UserModule {

    public UserModule(){

    }

    @UserScope
    @Provides
    User provideUser(){
        return new User();
    }


}
