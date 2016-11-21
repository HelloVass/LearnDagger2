package com.dove.flyer.fuckthirdpart;

import dagger.Module;
import dagger.Provides;

/**
 * Created by flyer on 2016/11/21.
 */

@Module
public class UserModule {

    public UserModule(){

    }

    @Provides
    User provideUser(){
        return new User();
    }


}
