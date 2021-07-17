package net.designism.api.domain.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import net.designism.api.core.util.Validator;
import org.seasar.doma.Domain;

@Domain(valueType = String.class)
public class MailAddress {

  @NotNull
  // メールアドレスを表す現実的な正規表現
  @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")
  private final String value;

  public MailAddress(String value) {
    this.value = value;
    Validator.validate(this);
  }

  public String getValue() {
    return value;
  }
}