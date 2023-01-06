package com.thonecardoso.springmongo.resources;

import com.thonecardoso.springmongo.domain.Post;
import com.thonecardoso.springmongo.service.PostService;
import com.thonecardoso.springmongo.util.URL;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class PostResource {

    private final PostService service;


    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        var post = service.findById(id);
        return ResponseEntity.ok().body(post);
    }

    @GetMapping("/title-search")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text){
        text = URL.decodeParam(text);
        var post = service.findByTitle(text);
        return ResponseEntity.ok().body(post);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
