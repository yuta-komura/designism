package net.designism.api.domain.user;

import java.util.List;
import net.designism.api.infrastructure.repository.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

@ConfigAutowireable
@Dao
public interface UserRepository {

  @Select
  User selectAuthUser(String name, String password);

  @Insert
  @Transactional
  int insert(User user);

}