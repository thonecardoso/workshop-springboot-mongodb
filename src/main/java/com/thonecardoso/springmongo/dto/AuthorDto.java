package com.thonecardoso.springmongo.dto;

import com.thonecardoso.springmongo.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class AuthorDto implements Serializable {
    private String id;
    private String name;

    public AuthorDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }
}
