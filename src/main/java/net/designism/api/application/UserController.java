package net.designism.api.application;

import net.designism.api.application.usecase.user.common.UserData;
import net.designism.api.application.usecase.user.get.UserGetInputData;
import net.designism.api.application.usecase.user.get.UserGetOutputData;
import net.designism.api.application.usecase.user.get.UserGetUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private final UserGetUseCase getUseCase;

  @Autowired
  public UserController(UserGetUseCase getUseCase) {
    this.getUseCase = getUseCase;
  }

  @GetMapping("/getUser")
  public UserData getUser(UserGetInputData inputData) {
    UserGetOutputData getOutputData = getUseCase.handle(inputData);
    getOutputData.
    return getOutputData.getUserData();
  }
}