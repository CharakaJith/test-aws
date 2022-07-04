package com.aws.sample.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping()
    public String testEndpoint(){
        System.out.println("testEndpoint was hit.....");

        return "Hello world!";
    }
}
