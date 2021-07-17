package net.designism.api.domain.user;

import javax.validation.constraints.NotNull;
import net.designism.api.core.util.Validator;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(immutable = true, naming = NamingType.SNAKE_UPPER_CASE)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private final UserId userId;

  @NotNull
  private final Name name;

  @NotNull
  private final Password password;

  @NotNull
  private final MailAddress mailAddress;

  public User(UserId userId, Name name, Password password, MailAddress mailAddress) {
    this.userId = userId;
    this.name = name;
    this.password = password;
    this.mailAddress = mailAddress;
    Validator.validate(this);
  }

  public UserId getUserId() {
    return userId;
  }

  public Name getName() {
    return name;
  }

  public Password getPassword() {
    return password;
  }

  public MailAddress getMailAddress() {
    return mailAddress;
  }
}
