package ru.netology.rest.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import ru.netology.rest.annotations.SplitIntoUserAndPassword;

public class User {
    @NotBlank
    @Size(min = 2, max = 20)
    private String login;
    @NotBlank
    @Size(min = 4, max = 20)
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
