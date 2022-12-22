package ru.ohhaithere.microservices.articles.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author {

    private Integer id;
    private String name;
    private String email;
    private Author author;

}
