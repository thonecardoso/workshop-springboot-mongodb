package com.thonecardoso.springmongo.config;

import com.thonecardoso.springmongo.domain.Post;
import com.thonecardoso.springmongo.domain.User;
import com.thonecardoso.springmongo.dto.AuthorDto;
import com.thonecardoso.springmongo.dto.CommentDto;
import com.thonecardoso.springmongo.repository.PostRepository;
import com.thonecardoso.springmongo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

@AllArgsConstructor
@Configuration
public class Instantiation implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        var sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        var maria = new User(null, "Maria Brown", "maria@gmail.com");
        var alex = new User(null, "Alex Green", "alex@gmail.com");
        var bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(List.of(maria, alex, bob));

        var post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDto(maria));
        var post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", new AuthorDto(maria));

        var c1 = new CommentDto("Boa viagem mano!", sdf.parse("21/03/2018"), new AuthorDto(alex));
        var c2 = new CommentDto("Aproveite", sdf.parse("22/03/2018"), new AuthorDto(bob));
        var c3 = new CommentDto("Tenha um ótimo dia!", sdf.parse("23/03/2018"), new AuthorDto(alex));

        post1.getComments().addAll(List.of(c1, c2));
        post2.getComments().add(c3);

        postRepository.saveAll(List.of(post1, post2));

        maria.getPosts().addAll(List.of(post1,post2));
        userRepository.save(maria);
    }
}
