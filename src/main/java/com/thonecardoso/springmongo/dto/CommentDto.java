package com.thonecardoso.springmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentDto implements Serializable {
    private String text;
    private Date date;
    private AuthorDto author;

}
