package net.designism.api.registry;

import net.designism.api.domain.user.UserService;
import net.designism.api.domain.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutowiredConfig {

  @Bean
  public UserService UserServiceImpl() {
    return new UserServiceImpl();
  }

//  @Bean
//  public UserRepository userRepositoryImpl() {
//    return new InMemoryUserRepository();
//  }
}
