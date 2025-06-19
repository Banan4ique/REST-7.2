package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.data.Authorities;

import java.util.List;

@Repository
public class UserRepository {

    private String user = "banana";
    private String password = "1234";
    private List<Authorities> authorities = List.of(Authorities.READ, Authorities.WRITE);

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (!this.user.equals(user) || !this.password.equals(password)) {
            return null;
        }
        return authorities;
    }
}
