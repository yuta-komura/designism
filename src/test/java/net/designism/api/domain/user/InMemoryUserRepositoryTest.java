package net.designism.api.domain.user;

import org.junit.jupiter.api.Test;
import org.seasar.doma.jdbc.Result;

public class InMemoryUserRepositoryTest {

  @Test
  void name() {
    UserRepository userRepository = new InMemoryUserRepository();
    Name name = new Name("xzxllsdlslasLad");
    Password password = new Password("skdJKsk92dkds");
    MailAddress mailAddress = new MailAddress("abc@gmail.com");
    User user = new User(null, name, password, mailAddress);
    Result<User> result = userRepository.insert(user);
    User resultUser = result.getEntity();
    System.out.println(resultUser.getMailAddress().getValue());
  }
}
