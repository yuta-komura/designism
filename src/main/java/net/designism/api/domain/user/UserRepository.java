package net.designism.api.domain.user;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;
import org.springframework.transaction.annotation.Transactional;

@ConfigAutowireable
@Dao
public interface UserRepository {

  @Select
  User selectByAuthKey(Name name, Password password);

  @Insert
  @Transactional
  Result<User> insert(User user);

  @Delete(sqlFile = true)
  int deleteByUserId(UserId userId);

}