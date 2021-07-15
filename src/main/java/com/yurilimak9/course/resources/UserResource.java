package com.yurilimak9.course.resources;

import com.yurilimak9.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(
                1L,
                "Maria",
                "Santos",
                "maria@gmail.com",
                "11936673312",
                "12345678"
        );

        return ResponseEntity.ok().body(user);
    }

}
