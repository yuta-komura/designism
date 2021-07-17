package net.designism.api.domain.user;


import org.junit.Test;

public class PasswordTest {

  @Test
  public void 有効な値1() {
    new Password("dkl2131401xfkwSJ");
  }

  @Test
  public void 有効な値2() {
    new Password(
        "dkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2");
  }

  @Test(expected = IllegalArgumentException.class)
  public void nullは無効() {
    new Password(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void 全角スペースを含んでいる() {
    new Password("sadkl2131401xf　kwls");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 半角スペースを含んでいる() {
    new Password("sadkl2131401xf kwls");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 記号を含んでいる() {
    new Password("sadkl2131401xfkwlsd-");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 空文字() {
    new Password("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 文字数がたりない_数字() {
    new Password("1111111");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 文字数がたりない_半角小文字() {
    new Password("aaaaaaa");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 文字数がたりない_半角大文字() {
    new Password("IIIIIII");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 全角英字を含んでいる() {
    new Password("ｑｑｑｑｑｑｑｑ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 全角数字を含んでいる() {
    new Password("９９９９９９９９");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 文字数制限超え_101文字() {
    new Password(
        "dkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl21");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 小文字のみ() {
    new Password("ssssssssssssssssssssssssssssssss");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 大文字のみ() {
    new Password("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 数字のみ() {
    new Password("00000000000000000000000000000000");
  }
}
