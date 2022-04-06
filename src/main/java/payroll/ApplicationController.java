package payroll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {

    private final UserRepository repository;

    ApplicationController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/process")
    public String process(){
        return "passed the spring security through DB";
    }

    @GetMapping("/users")
    List<User> all() {
        return repository.findAll();
    }
}
