package com.zonief.h2demo;

import com.zonief.h2demo.domain.ApplicationUser;
import com.zonief.h2demo.repository.UserRepository;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class H2DemoApplication implements CommandLineRunner {

  private UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(H2DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    userRepository.save(ApplicationUser.builder()
        .id(UUID.randomUUID().toString())
        .email("yosachot@truc.com")
        .name("Yoann")
        .build());

    userRepository.findAll().forEach(System.out::println);
  }

}
