package net.designism.api.domain.user.service.Impl;

import net.designism.api.domain.user.service.UserService;

public class DefaultUserService implements UserService {

  @Override
  public void show() {
    System.out.println("DefaultUserService");
  }
}
