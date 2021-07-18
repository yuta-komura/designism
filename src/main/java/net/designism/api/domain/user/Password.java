package net.designism.api.domain.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.EqualsAndHashCode;
import net.designism.api.core.util.Validator;
import org.seasar.doma.Domain;

@EqualsAndHashCode
@Domain(valueType = String.class)
public class Password {

  @NotNull
  // 半角英小文字大文字数字をそれぞれ1種類以上含む8文字以上100文字以下
  @Pattern(regexp = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?\\d)[a-zA-Z\\d]{8,100}$")
  private final String value;

  public Password(String value) {
    this.value = value;
    Validator.validate(this);
  }

  public String getValue() {
    return value;
  }
}
