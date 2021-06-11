package net.designism.api.domain.user.repository;

import java.util.List;
import net.designism.api.domain.user.model.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

@ConfigAutowireable
@Dao
public interface UserRepository {

  @Select
  List<User> selectAll();

  @Insert
  @Transactional
  int insert(User reservation);
}