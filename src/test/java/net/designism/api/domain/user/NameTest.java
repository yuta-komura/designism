package net.designism.api.domain.user;


import org.junit.Test;

public class NameTest {

  @Test
  public void 有効な値1() {
    new Name("dkl2");
  }

  @Test
  public void 有効な値2() {
    new Name(
        "dkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2");
  }

  @Test
  public void 有効な値3() {
    new Name("ssss");
  }

  @Test
  public void 有効な値4() {
    new Name(
        "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
  }

  @Test
  public void 有効な値5() {
    new Name("HHHH");
  }

  @Test
  public void 有効な値6() {
    new Name(
        "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
  }

  @Test
  public void 有効な値7() {
    new Name("0000");
  }

  @Test
  public void 有効な値8() {
    new Name(
        "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
  }

  @Test(expected = IllegalArgumentException.class)
  public void nullは無効() {
    new Name(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void 全角スペースを含んでいる() {
    new Name("sadkl2131401xf　kwls");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 半角スペースを含んでいる() {
    new Name("sadkl2131401xf kwls");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 記号を含んでいる() {
    new Name("sadkl2131401xfkwlsd-");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 空文字() {
    new Name("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 文字数がたりない_数字() {
    new Name("111");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 文字数がたりない_半角小文字() {
    new Name("aaa");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 文字数がたりない_半角大文字() {
    new Name("III");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 全角英字を含んでいる() {
    new Name("ｑｑｑｑｑｑｑｑ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 全角数字を含んでいる() {
    new Name("９９９９９９９９");
  }

  @Test(expected = IllegalArgumentException.class)
  public void 文字数制限超え_101文字() {
    new Name(
        "dkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl2131401xfkwSJdkl21");
  }
}
