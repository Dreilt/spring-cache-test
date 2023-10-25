package pl.dreilt.springcachetest.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.dreilt.springcachetest.model.User;
import pl.dreilt.springcachetest.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }
}
