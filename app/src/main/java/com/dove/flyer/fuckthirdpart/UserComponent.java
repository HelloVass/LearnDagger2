package com.dove.flyer.fuckthirdpart;

import com.dove.flyer.fuckthirdpart.annotation.UserScope;

import dagger.Component;

/**
 * Created by flyer on 2016/11/11.
 */
//@UserScope
@Component(modules = {UserModule.class})
public interface UserComponent {
    void injectTo(ClassARoomActivity classARoomActivity);
    void injectTo(ClassBRoomActivity classBRoomActivity);
}
