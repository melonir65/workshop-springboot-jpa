package com.rafaelmeloni.course.resources;

import com.rafaelmeloni.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L,"Rafael Meloni","rafaelmeloni@gmail.com","1111221212","2325258");
        return ResponseEntity.ok().body(user);
    }


}
