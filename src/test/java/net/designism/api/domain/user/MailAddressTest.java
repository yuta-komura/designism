package net.designism.api.domain.user;

import org.junit.Test;

public class MailAddressTest {

  @Test
  public void 有効な値1() {
    new MailAddress("acb@gmail.com");
  }

  @Test(expected = IllegalArgumentException.class)
  public void nullは無効() {
    new MailAddress(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void 空文字() {
    new MailAddress("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void アットより後ろがない() {
    new MailAddress("acb@");
  }

  @Test(expected = IllegalArgumentException.class)
  public void アットより前がない() {
    new MailAddress("@gmail.com");
  }

  @Test(expected = IllegalArgumentException.class)
  public void アット忘れ() {
    new MailAddress("acbgmail.com");
  }
}
