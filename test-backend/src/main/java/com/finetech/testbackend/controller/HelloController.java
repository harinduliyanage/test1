package com.finetech.testbackend.controller;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/")
    public ResponseEntity<JsonNode> hello(){
        ObjectMapper ob =new ObjectMapper();
        JsonNode hello = ob.convertValue("Hello", JsonNode.class);
        return ResponseEntity.ok(hello);
    }
}
