package com.dove.flyer.fuckthirdpart;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClassARoomActivity_MembersInjector
    implements MembersInjector<ClassARoomActivity> {
  private final Provider<User> mUserProvider;

  public ClassARoomActivity_MembersInjector(Provider<User> mUserProvider) {
    assert mUserProvider != null;
    this.mUserProvider = mUserProvider;
  }

  public static MembersInjector<ClassARoomActivity> create(Provider<User> mUserProvider) {
    return new ClassARoomActivity_MembersInjector(mUserProvider);
  }

  @Override
  public void injectMembers(ClassARoomActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mUser = mUserProvider.get();
  }

  public static void injectMUser(ClassARoomActivity instance, Provider<User> mUserProvider) {
    instance.mUser = mUserProvider.get();
  }
}
