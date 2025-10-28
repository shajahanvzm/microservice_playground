package com.codemx.buildpackdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuildPackDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuildPackDemoApplication.class, args);
    }

    @GetMapping
    public String home() {
        return "Build Pack Demo Service";
    }

}
