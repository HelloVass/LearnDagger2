package com.dove.flyer.fuckthirdpart;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<ClassRoom> mClassRoomProvider;

  public MainActivity_MembersInjector(Provider<ClassRoom> mClassRoomProvider) {
    assert mClassRoomProvider != null;
    this.mClassRoomProvider = mClassRoomProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<ClassRoom> mClassRoomProvider) {
    return new MainActivity_MembersInjector(mClassRoomProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mClassRoom = mClassRoomProvider.get();
  }

  public static void injectMClassRoom(
      MainActivity instance, Provider<ClassRoom> mClassRoomProvider) {
    instance.mClassRoom = mClassRoomProvider.get();
  }
}
