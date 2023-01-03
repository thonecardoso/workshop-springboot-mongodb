package com.thonecardoso.springmongo.resources;

import com.thonecardoso.springmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        var u1 = new User("1", "maria", "maria@gmail.com");
        var u2 = new User("2", "jose", "jose@gmail.com");

        return ResponseEntity.ok().body(List.of(u1, u2));
    }
}
