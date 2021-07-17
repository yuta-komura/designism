package net.designism.api.domain.user;

import org.seasar.doma.jdbc.Result;

public class InMemoryUserRepository implements UserRepository {

  @Override
  public User selectByAuthKey(Name name, Password password) {
    return null;
  }

  @Override
  public Result<User> insert(User user) {
    return new Result<User>(9, user);
  }

  @Override
  public int deleteByUserId(UserId userId) {
    return 0;
  }
}
