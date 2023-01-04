package com.thonecardoso.springmongo.service;

import com.thonecardoso.springmongo.domain.User;
import com.thonecardoso.springmongo.repository.UserRepository;
import com.thonecardoso.springmongo.service.exception.ObjectNotFoundException;
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

    public User save(User user){
        return repository.save(user);
    }

    public User findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public void deleteById(String id) {
        var user = findById(id);
        repository.delete(user);
    }

    public User update(String id, User userToUpdate) {
        var user = findById(id);
        user.setEmail(userToUpdate.getEmail());
        user.setName(userToUpdate.getName());
        return  repository.save(user);
    }
}
