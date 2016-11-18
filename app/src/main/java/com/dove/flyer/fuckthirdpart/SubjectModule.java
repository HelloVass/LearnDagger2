package com.dove.flyer.fuckthirdpart;

import dagger.Module;
import dagger.Provides;

/**
 * Created by flyer on 2016/11/14.
 */
@Module
public class SubjectModule {


    public SubjectModule(){

    }


    @Provides Subject provideSubject(ClassRoom classRoom){
        return new Subject(classRoom);
    }

}
