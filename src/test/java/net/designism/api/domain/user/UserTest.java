package net.designism.api.domain.user;


import org.junit.Test;

public class UserTest {

  @Test
  public void 有効な値1() {
    Name name = new Name("xzxllsdlslasLad");
    Password password = new Password("skdJKsk92dkds");
    MailAddress mailAddress = new MailAddress("abc@gmail.com");
    new User(null, name, password, mailAddress);
  }

  @Test
  public void 有効な値2() {
    UserId userId = new UserId(1);
    Name name = new Name("xzxllsdlslasLad");
    Password password = new Password("skdJKsk92dkds");
    MailAddress mailAddress = new MailAddress("abc@gmail.com");
    new User(userId, name, password, mailAddress);
  }

  @Test(expected = IllegalArgumentException.class)
  public void nameがnull() {
    Password password = new Password("skdJKsk92dkds");
    MailAddress mailAddress = new MailAddress("abc@gmail.com");
    new User(null, null, password, mailAddress);
  }

  @Test(expected = IllegalArgumentException.class)
  public void passwordがnull() {
    Name name = new Name("xzxllsdlslasLad");
    MailAddress mailAddress = new MailAddress("abc@gmail.com");
    new User(null, name, null, mailAddress);
  }

  @Test(expected = IllegalArgumentException.class)
  public void mailAddressがnull() {
    Name name = new Name("xzxllsdlslasLad");
    Password password = new Password("skdJKsk92dkds");
    new User(null, name, password, null);
  }
}
