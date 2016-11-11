package com.dove.flyer.fuckthirdpart;

import dagger.Component;

/**
 * Created by flyer on 2016/11/11.
 */
@Component
public interface UserComponent {
    void injectTo(MainActivity mainActivity);
}
