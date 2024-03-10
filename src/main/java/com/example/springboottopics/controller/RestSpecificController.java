package com.example.springboottopics.controller;

import com.example.springboottopics.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestSpecificController {

    @GetMapping()
    public String getHTML() {
        return "<b>Rest Controller HTML</b>";
    }


    @GetMapping("/req2")
    public List<String> getJSON() {
        return List.of("Hello", "REST");
    }

    @GetMapping("req3")
    public List<Integer> getInts() {
        return List.of(1,2,3);
    }

    @GetMapping("/error")
    public List<String> getError() {
        // will be output as Whitelabel Error page as text/html with 500 status
        throw new RuntimeException("Error Occurred");
    }

    @GetMapping("/rest/user")
    public ResponseEntity<User> getUser() {
        User user = new User();
        user.name = "RestTest";
        return ResponseEntity.ok(user);
    }
}
