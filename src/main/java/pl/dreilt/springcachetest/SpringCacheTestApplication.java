package pl.dreilt.springcachetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.dreilt.springcachetest.model.User;
import pl.dreilt.springcachetest.repository.UserRepository;

@SpringBootApplication
public class SpringCacheTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringCacheTestApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.save(new User(1L, "Jan", "Kowalski", 30L));
    }

}
