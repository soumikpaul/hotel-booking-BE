package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Configuration
@EnableJpaRepositories(basePackages="com.example.demo.repository")
@SpringBootApplication
public class Bookmyhotel1Application implements CommandLineRunner{

	@Autowired
	  UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(Bookmyhotel1Application.class, args);
	}
	 @Override
	  public void run(String... args) throws Exception {
	    userRepository.save(new User("user", "$2a$10$7vvKshs8Pp3qNRt6sEYG6.z8LQ10.MYHwLn.TaTqXFz9jK6Sz4uBK", "USERabcd"));
	    userRepository.save(new User("admin", "$2a$10$BGP.vJixGN92vUMHSFJaw.SItWItaDX1VEzdU9wcNWKV1KWN4QUEC", "ADMINpassword"));
	  }

}
