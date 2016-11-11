package com.dove.flyer.fuckthirdpart;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum User_Factory implements Factory<User> {
  INSTANCE;

  @Override
  public User get() {
    return new User();
  }

  public static Factory<User> create() {
    return INSTANCE;
  }
}
