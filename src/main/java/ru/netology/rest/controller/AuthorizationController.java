package ru.netology.rest.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.rest.DTO.User;
import ru.netology.rest.annotations.SplitIntoUserAndPassword;
import ru.netology.rest.data.Authorities;
import ru.netology.rest.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@SplitIntoUserAndPassword @Validated User user) {
        return service.getAuthorities(user);
    }
}