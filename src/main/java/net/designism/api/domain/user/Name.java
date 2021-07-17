package net.designism.api.domain.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import net.designism.api.core.util.Validator;
import org.seasar.doma.Domain;

@Domain(valueType = String.class)
public class Name {

  @NotNull
  // 半角英小文字大文字数字8文字以上100文字以下
  @Pattern(regexp = "^[a-zA-Z0-9]{4,100}+$")
  private final String value;

  public Name(String value) {
    this.value = value;
    Validator.validate(this);
  }

  public String getValue() {
    return value;
  }
}
