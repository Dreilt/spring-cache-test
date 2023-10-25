package pl.dreilt.springcachetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dreilt.springcachetest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
