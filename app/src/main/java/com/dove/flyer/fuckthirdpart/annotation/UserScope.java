package com.dove.flyer.fuckthirdpart.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by flyer on 2016/11/21.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
