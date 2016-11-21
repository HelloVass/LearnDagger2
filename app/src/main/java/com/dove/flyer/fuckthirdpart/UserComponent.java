package com.dove.flyer.fuckthirdpart;

import dagger.Component;

/**
 * Created by flyer on 2016/11/11.
 */

@Component(modules = {UserModule.class})
public interface UserComponent {
    void injectTo(ClassARoomActivity classARoomActivity);
    void injectTo(ClassBRoomActivity classBRoomActivity);
}
