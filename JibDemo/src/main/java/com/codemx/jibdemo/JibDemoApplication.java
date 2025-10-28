package com.codemx.jibdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JibDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JibDemoApplication.class, args);
    }

    @GetMapping()
    public String home() {
        return "Jib Demo App is running!";
    }

}
