package com.thonecardoso.springmongo.service;

import com.thonecardoso.springmongo.domain.User;
import com.thonecardoso.springmongo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
