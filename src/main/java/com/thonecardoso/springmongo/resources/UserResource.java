package com.thonecardoso.springmongo.resources;

import com.thonecardoso.springmongo.domain.User;
import com.thonecardoso.springmongo.dto.UserDto;
import com.thonecardoso.springmongo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserResource {

    private final UserService service;
    @GetMapping
    public ResponseEntity<List<UserDto>> findAll(){
        var dtos = service.findAll().stream().map(UserDto::new).toList();
        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable String id){
        var user = service.findById(id);
        return ResponseEntity.ok().body(new UserDto(user));
    }

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto){
        var user = new User(userDto.getId(), userDto.getName(), userDto.getEmail());
        user = service.save(user);
        var url = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(url).body(new UserDto(user));
    }
}
