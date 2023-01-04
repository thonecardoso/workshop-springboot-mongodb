package com.thonecardoso.springmongo.config;

import com.thonecardoso.springmongo.domain.User;
import com.thonecardoso.springmongo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@AllArgsConstructor
@Configuration
public class Instantiation implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        var maria = new User(null, "Maria Brown", "maria@gmail.com");
        var alex = new User(null, "Alex Green", "alex@gmail.com");
        var bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(List.of(maria, alex, bob));
    }
}
