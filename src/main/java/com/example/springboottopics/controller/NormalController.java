package com.example.springboottopics.controller;

import com.example.springboottopics.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class NormalController {

    @RequestMapping(value = "/req1", method = RequestMethod.GET)
    public ResponseEntity<String> getHTML() {
        return ResponseEntity.ok("<b>Hello World</b>");
    }


    // will always call RestSpecific Controller, because this path will be overridden by that
    @RequestMapping // by default GET request
    public ResponseEntity<List<String>> getJsonList() {
        return ResponseEntity.ok(List.of("Hello", "World"));
    }


    @RequestMapping("/req2") // This will be overridden with RestSpecificController -> '/req2'
    public ResponseEntity<List<String>> getJsonData() {
        return ResponseEntity.ok(List.of("Hello", "World"));
    }

    @RequestMapping("normalError")
    public ResponseEntity<?> getError() {
        // will be output as Whitelabel Error page as text/html with 500 status
        throw new RuntimeException("Error In Normal Controller");
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUser() {
        User user = new User();
        user.name = "Test";
        return ResponseEntity.ok(user);
    }
}
