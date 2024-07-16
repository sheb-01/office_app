package office.coordination.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/api/users")

public class UserController {
    @GetMapping
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User(1L, "John Doe"),
                new User(2L, "Jane Smith")
        );
    }
    static class User {
        private Long id;
        private String username;
        public User(Long id, String username) {
            this.id = id;
            this.username = username;
        }
        public Long getId() {
            return id;
        }
        public String getUsername() {
            return username;
        }
    }
}