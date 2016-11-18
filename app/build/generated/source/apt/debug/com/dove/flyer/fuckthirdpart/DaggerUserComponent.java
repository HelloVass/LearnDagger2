package com.dove.flyer.fuckthirdpart;

import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerUserComponent implements UserComponent {
  private Provider<ClassRoom> classRoomProvider;

  private Provider<Subject> provideSubjectProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerUserComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static UserComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.classRoomProvider = ClassRoom_Factory.create(User_Factory.create());

    this.provideSubjectProvider =
        SubjectModule_ProvideSubjectFactory.create(builder.subjectModule, classRoomProvider);

    this.mainActivityMembersInjector = MainActivity_MembersInjector.create(provideSubjectProvider);
  }

  @Override
  public void injectTo(MainActivity mainActivity) {
    mainActivityMembersInjector.injectMembers(mainActivity);
  }

  public static final class Builder {
    private SubjectModule subjectModule;

    private Builder() {}

    public UserComponent build() {
      if (subjectModule == null) {
        this.subjectModule = new SubjectModule();
      }
      return new DaggerUserComponent(this);
    }

    public Builder subjectModule(SubjectModule subjectModule) {
      this.subjectModule = Preconditions.checkNotNull(subjectModule);
      return this;
    }
  }
}
