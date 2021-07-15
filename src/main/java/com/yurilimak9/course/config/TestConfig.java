package com.yurilimak9.course.config;

import com.yurilimak9.course.entities.User;
import com.yurilimak9.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Maria", "Santos", "maria@gmail.com", "11943275532", "12345678");
        User user2 = new User(null, "João", "Oliveira", "joao@gmail.com", "38893654912", "87654321");

        this.userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
