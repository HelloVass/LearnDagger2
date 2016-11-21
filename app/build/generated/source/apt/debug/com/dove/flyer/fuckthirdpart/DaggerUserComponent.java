package com.dove.flyer.fuckthirdpart;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerUserComponent implements UserComponent {
  private Provider<User> provideUserProvider;

  private MembersInjector<ClassARoomActivity> classARoomActivityMembersInjector;

  private MembersInjector<ClassBRoomActivity> classBRoomActivityMembersInjector;

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

    this.provideUserProvider =
        DoubleCheck.provider(UserModule_ProvideUserFactory.create(builder.userModule));

    this.classARoomActivityMembersInjector =
        ClassARoomActivity_MembersInjector.create(provideUserProvider);

    this.classBRoomActivityMembersInjector =
        ClassBRoomActivity_MembersInjector.create(provideUserProvider);
  }

  @Override
  public void injectTo(ClassARoomActivity classARoomActivity) {
    classARoomActivityMembersInjector.injectMembers(classARoomActivity);
  }

  @Override
  public void injectTo(ClassBRoomActivity classBRoomActivity) {
    classBRoomActivityMembersInjector.injectMembers(classBRoomActivity);
  }

  public static final class Builder {
    private UserModule userModule;

    private Builder() {}

    public UserComponent build() {
      if (userModule == null) {
        this.userModule = new UserModule();
      }
      return new DaggerUserComponent(this);
    }

    public Builder userModule(UserModule userModule) {
      this.userModule = Preconditions.checkNotNull(userModule);
      return this;
    }
  }
}
