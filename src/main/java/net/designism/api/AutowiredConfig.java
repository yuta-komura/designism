package net.designism.api;

import net.designism.api.domain.user.UserServiceImpl;
import net.designism.api.domain.user.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutowiredConfig {

  @Bean
  public UserService userServiceImpl() {
    return new UserServiceImpl();
  }

}
