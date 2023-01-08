package com.thonecardoso.springmongo.resources.docs;

import com.thonecardoso.springmongo.domain.Post;
import org.springframework.http.ResponseEntity;

import java.util.List;

//@Api("Posts management")
public interface PostResourceDocs {
//    @ApiOperation(value = "Find post by id operation")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success post found"),
//            @ApiResponse(code = 404, message = "Post not found error code")
//    })
    ResponseEntity<Post> findById(String id);

    ResponseEntity<List<Post>> findByTitle(String text);

    ResponseEntity<List<Post>> fullSearch(String text,String minDate,String maxDate);

    ResponseEntity<Void> deleteById(String id);
}
