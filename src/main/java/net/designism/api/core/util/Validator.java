package net.designism.api.core.util;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

public class Validator<T> {

  private Validator() {
  }

  public static <T> void validate(T obj) {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    javax.validation.Validator validator = factory.getValidator();
    Set<ConstraintViolation<T>> results = validator.validate(obj);
    showError(results);
  }

  private static <T> void showError(Set<ConstraintViolation<T>> results) {
    for (ConstraintViolation<T> r : results) {
      System.out.println("----------");
      System.out.println("MessageTemplate : " + r.getMessageTemplate());
      System.out.println("Message : " + r.getMessage());
      System.out.println("InvalidValue : " + r.getInvalidValue());
      System.out.println("PropertyPath : " + r.getPropertyPath());
      System.out.println("RootBeanClass : " + r.getRootBeanClass());
      System.out.println("RootBean : " + r.getRootBean());
      throw new IllegalArgumentException(r.getMessage());
    }
  }

}