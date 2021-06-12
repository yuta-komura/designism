package net.designism.api.application.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import net.designism.api.domain.greeting.model.Greeting;
import net.designism.api.domain.user.model.User;
import net.designism.api.domain.user.repository.UserRepository;
import net.designism.api.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  private final UserRepository userRepository;

  private final UserService userService;

  @Autowired
  public GreetingController(UserRepository userRepository, UserService adminUserService) {
    this.userRepository = userRepository;
    this.userService = adminUserService;
  }

  @GetMapping("/greeting")
  public Greeting greeting() {
    System.out.println("--------------------------------------------");
    userService.show();
    System.out.println("--------------------------------------------");

    List<User> users = userRepository.selectAll();

    String name = "";
    for (User user : users) {
      name = user.getName();
    }

    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
}