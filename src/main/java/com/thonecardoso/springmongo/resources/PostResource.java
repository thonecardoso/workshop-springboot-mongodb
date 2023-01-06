package com.thonecardoso.springmongo.resources;

import com.thonecardoso.springmongo.domain.Post;
import com.thonecardoso.springmongo.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
