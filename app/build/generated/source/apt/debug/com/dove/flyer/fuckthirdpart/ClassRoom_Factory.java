package com.dove.flyer.fuckthirdpart;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClassRoom_Factory implements Factory<ClassRoom> {
  private final Provider<User> userProvider;

  public ClassRoom_Factory(Provider<User> userProvider) {
    assert userProvider != null;
    this.userProvider = userProvider;
  }

  @Override
  public ClassRoom get() {
    return new ClassRoom(userProvider.get());
  }

  public static Factory<ClassRoom> create(Provider<User> userProvider) {
    return new ClassRoom_Factory(userProvider);
  }
}
