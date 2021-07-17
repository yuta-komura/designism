package net.designism.api.domain.user;

import javax.validation.constraints.NotNull;
import net.designism.api.core.util.Validator;
import org.seasar.doma.Domain;

@Domain(valueType = Integer.class)
public class UserId {

  @NotNull
  private final Integer value;

  public UserId(Integer value) {
    this.value = value;
    Validator.validate(this);
  }

  public Integer getValue() {
    return value;
  }
}
