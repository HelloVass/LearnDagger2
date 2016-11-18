package com.dove.flyer.fuckthirdpart;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Subject> mSubjectProvider;

  public MainActivity_MembersInjector(Provider<Subject> mSubjectProvider) {
    assert mSubjectProvider != null;
    this.mSubjectProvider = mSubjectProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<Subject> mSubjectProvider) {
    return new MainActivity_MembersInjector(mSubjectProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSubject = mSubjectProvider.get();
  }

  public static void injectMSubject(MainActivity instance, Provider<Subject> mSubjectProvider) {
    instance.mSubject = mSubjectProvider.get();
  }
}
