package com.thonecardoso.springmongo.resources;

import com.thonecardoso.springmongo.domain.User;
import com.thonecardoso.springmongo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserResource {

    private final UserService service;
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        var users = service.findAll();
        return ResponseEntity.ok().body(users);
    }
}
