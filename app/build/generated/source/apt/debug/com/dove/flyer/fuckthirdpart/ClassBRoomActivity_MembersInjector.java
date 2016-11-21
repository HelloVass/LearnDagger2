package com.dove.flyer.fuckthirdpart;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClassBRoomActivity_MembersInjector
    implements MembersInjector<ClassBRoomActivity> {
  private final Provider<User> mUserProvider;

  public ClassBRoomActivity_MembersInjector(Provider<User> mUserProvider) {
    assert mUserProvider != null;
    this.mUserProvider = mUserProvider;
  }

  public static MembersInjector<ClassBRoomActivity> create(Provider<User> mUserProvider) {
    return new ClassBRoomActivity_MembersInjector(mUserProvider);
  }

  @Override
  public void injectMembers(ClassBRoomActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mUser = mUserProvider.get();
  }

  public static void injectMUser(ClassBRoomActivity instance, Provider<User> mUserProvider) {
    instance.mUser = mUserProvider.get();
  }
}
