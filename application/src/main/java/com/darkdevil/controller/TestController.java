package com.darkdevil.controller;

import com.darkdevil.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {

    @Autowired
    private HashMap<String, String> textHandler;

    @Autowired
    private TestService testService;

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("test")
    public String test() {
        return "Message: " + message + " ### " + textHandler.get("TEST1") + " ### " + testService.test();
    }

}
