package net.designism.api.infrastructure.repository.entity;

import java.util.Date;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

}