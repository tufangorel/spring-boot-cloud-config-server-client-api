package org.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
public class CloudConfigClientAPI {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientAPI.class, args);
    }

    @Value("${user.role}")
    private String role;


    @GetMapping( value = "/whoami/{username}" )
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello! You're %s and you'll become a(n) %s...\n", username, role);
    }

}