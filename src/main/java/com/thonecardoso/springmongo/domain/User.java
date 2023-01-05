package com.thonecardoso.springmongo.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class User implements Serializable {
    @Id
    private String id;
    @EqualsAndHashCode.Exclude
    private String name;
    @EqualsAndHashCode.Exclude
    private String email;

    @DBRef(lazy = true)
    @Setter(AccessLevel.NONE)
    private final List<Post> posts = new ArrayList<>();
}
