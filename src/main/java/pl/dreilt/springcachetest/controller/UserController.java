package pl.dreilt.springcachetest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.dreilt.springcachetest.model.User;
import pl.dreilt.springcachetest.service.UserService;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.findById(id);
    }
}
