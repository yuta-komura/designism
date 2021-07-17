package net.designism.api.domain.user;

import java.util.Objects;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.doma.jdbc.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

  @Autowired
  UserRepository userRepository;

  @Test
  public void 検索結果1件() {
    Name name = new Name("komura");
    Password password = new Password("pDs200dsDpp");

    User user = userRepository.selectByAuthKey(name, password);

    assertThat(user.getName().getValue()).isEqualTo("komura");
    assertThat(user.getPassword().getValue()).isEqualTo("pDs200dsDpp");
    assertThat(user.getMailAddress().getValue()).isEqualTo("abc@gmail.com");
  }

  @Test
  public void 検索結果0件() {
    Name name = new Name("komuraaa");
    Password password = new Password("pDs200dsDpp");

    User user = userRepository.selectByAuthKey(name, password);

    assertThat(Objects.isNull(user)).isTrue();
  }

  @Test
  public void insertとDelete() {
    User user = getTestUserObj();
    Result<User> result = userRepository.insert(user);

    User insertedUser = result.getEntity();
    assertThat(insertedUser.getName().getValue()).isEqualTo("komurrrr");
    assertThat(insertedUser.getPassword().getValue()).isEqualTo("pDs200dsDpp");
    assertThat(insertedUser.getMailAddress().getValue()).isEqualTo("iii@gmail.com");

    UserId userId = new UserId(insertedUser.getUserId().getValue());

    int deleteCnt = userRepository.deleteByUserId(userId);

    assertThat(deleteCnt).isEqualTo(1);
  }

  @Test(expected = DuplicateKeyException.class)
  public void insert時の重複エラー() {
    userRepository.insert(getTestUserObj());
    userRepository.insert(getTestUserObj());
  }

  private User getTestUserObj() {
    Name name = new Name("komurrrr");
    Password password = new Password("pDs200dsDpp");
    MailAddress mailAddress = new MailAddress("iii@gmail.com");
    return new User(null, name, password, mailAddress);
  }

}
