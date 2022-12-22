package ru.ohhaithere.microservices.articles.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.ohhaithere.microservices.articles.models.Author;

import java.util.List;

@FeignClient("author-service")
public interface AuthorClient {

    @GetMapping()
    List<Author> getAuthors();
    @GetMapping("/{id}")
    Author getAuthor(@PathVariable("id") Integer id);

}
