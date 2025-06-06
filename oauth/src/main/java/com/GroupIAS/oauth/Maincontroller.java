package com.GroupIAS.oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @GetMapping("/")
    public String home() {
        return "Welcome to IAS PROJECT";
    }

    @GetMapping("/user")
    public Principal getUser(Principal principal) {
        return principal;
    }
}
