package net.designism.api.domain.user;


import org.junit.Test;

public class UserIdTest {

  @Test
  public void 数字() {
    new UserId(1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void nullは無効() {
    new UserId(null);
  }
}
