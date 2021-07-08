package net.designism.api.infrastructure.repository.stub;

import java.util.List;
import net.designism.api.domain.user.UserRepository;
import net.designism.api.infrastructure.repository.entity.User;

public class InMemoryUserRepository implements UserRepository {

  @Override
  public User selectAuthUser(String name, String password) {
    return null;
  }

  @Override
  public int insert(User user) {
    return 0;
  }
}
