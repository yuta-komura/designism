//package net.designism.api.application.usecase.user.get;
//
//import net.designism.api.domain.user.UserRepository;
//import net.designism.api.infrastructure.repository.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserGetInteractor implements UserGetUseCase {
//
//  private final UserRepository userRepository;
//
//  @Autowired
//  public UserGetInteractor(UserRepository userRepository) {
//    this.userRepository = userRepository;
//  }
//
//  @Override
//  public UserGetOutputData handle(UserGetInputData inputData) {
//
//    String name = inputData.getName();
//    String password = inputData.getPassword();
//
//    User user = userRepository.selectByKey(name, password);
//
//    return new UserGetOutputData(user);
//  }
//}
