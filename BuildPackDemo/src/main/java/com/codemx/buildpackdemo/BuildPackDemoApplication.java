package com.codemx.buildpackdemo;

import com.codemx.buildpackdemo.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties(value = {ContactDto.class})
public class BuildPackDemoApplication {

    @Autowired
    private ContactDto contactDto;

    public static void main(String[] args) {
        SpringApplication.run(BuildPackDemoApplication.class, args);
    }

    @GetMapping
    public String home() {
        return "Build Pack Demo Service";
    }

    @ GetMapping("/info")
    public ContactDto info() {
        return contactDto;
    }

}
