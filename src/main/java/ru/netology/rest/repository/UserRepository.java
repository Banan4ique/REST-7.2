package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.DTO.User;
import ru.netology.rest.data.Authorities;

import java.util.List;

@Repository
public class UserRepository {

    private final User user = new User("banana", "1234");
    private final List<Authorities> authorities = List.of(Authorities.READ, Authorities.WRITE);

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (!this.user.getLogin().equals(user) || !this.user.getPassword().equals(password)) {
            return null;
        }
        return authorities;
    }
}
