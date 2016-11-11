package com.dove.flyer.fuckthirdpart;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<User> mUserProvider;

  public MainActivity_MembersInjector(Provider<User> mUserProvider) {
    assert mUserProvider != null;
    this.mUserProvider = mUserProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<User> mUserProvider) {
    return new MainActivity_MembersInjector(mUserProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mUser = mUserProvider.get();
  }

  public static void injectMUser(MainActivity instance, Provider<User> mUserProvider) {
    instance.mUser = mUserProvider.get();
  }
}
