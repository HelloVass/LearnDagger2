package com.dove.flyer.fuckthirdpart;

import dagger.Component;

/**
 * Created by flyer on 2016/11/11.
 */
@Component(modules = SubjectModule.class)
public interface UserComponent {
    void injectTo(MainActivity mainActivity);
}
