package com.example.helloworld.controller;

import com.example.helloworld.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private AppConfig appConfig;

    @GetMapping("/app")
    public ResponseEntity<String> info() {
        return ResponseEntity.status(HttpStatus.OK).body(appConfig.getUrl());
    }
}
