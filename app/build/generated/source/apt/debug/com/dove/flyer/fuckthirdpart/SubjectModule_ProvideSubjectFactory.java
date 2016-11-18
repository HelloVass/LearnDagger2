package com.dove.flyer.fuckthirdpart;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubjectModule_ProvideSubjectFactory implements Factory<Subject> {
  private final SubjectModule module;

  private final Provider<ClassRoom> classRoomProvider;

  public SubjectModule_ProvideSubjectFactory(
      SubjectModule module, Provider<ClassRoom> classRoomProvider) {
    assert module != null;
    this.module = module;
    assert classRoomProvider != null;
    this.classRoomProvider = classRoomProvider;
  }

  @Override
  public Subject get() {
    return Preconditions.checkNotNull(
        module.provideSubject(classRoomProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Subject> create(
      SubjectModule module, Provider<ClassRoom> classRoomProvider) {
    return new SubjectModule_ProvideSubjectFactory(module, classRoomProvider);
  }
}
