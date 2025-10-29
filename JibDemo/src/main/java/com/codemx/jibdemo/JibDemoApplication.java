package com.codemx.jibdemo;

import com.codemx.jibdemo.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties(value = {ContactDto.class})
public class JibDemoApplication {

    @Autowired
    private ContactDto contactDto;

    public static void main(String[] args) {
        SpringApplication.run(JibDemoApplication.class, args);
    }

    @GetMapping()
    public String home() {
        return "Jib Demo App is running!";
    }

    @GetMapping("/info")
    public ContactDto info() {
        return contactDto;
    }
}
