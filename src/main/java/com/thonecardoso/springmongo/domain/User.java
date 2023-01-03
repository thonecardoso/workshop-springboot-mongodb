package com.thonecardoso.springmongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String id;
    @EqualsAndHashCode.Exclude
    private String name;
    @EqualsAndHashCode.Exclude
    private String email;
}
