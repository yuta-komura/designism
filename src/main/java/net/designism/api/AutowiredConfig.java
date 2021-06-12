package net.designism.api;

import net.designism.api.domain.user.service.Impl.AdminUserService;
import net.designism.api.domain.user.service.Impl.DefaultUserService;
import net.designism.api.domain.user.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutowiredConfig {

  @Bean
  public UserService adminUserService() {
    return new AdminUserService();
  }

}
