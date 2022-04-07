package payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/secure/auth")
public class AdminController {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin/users")
    List<User> all() {
        return userRepository.findAll();
    }
//    @GetMapping("/process")
//    public String process(){
//        return "passed the spring security through DB";
//    }
}
