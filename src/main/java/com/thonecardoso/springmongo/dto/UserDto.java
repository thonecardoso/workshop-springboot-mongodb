package com.thonecardoso.springmongo.dto;

import com.thonecardoso.springmongo.domain.User;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class UserDto implements Serializable {
    private String id;
    private String name;
    private String email;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }
}
