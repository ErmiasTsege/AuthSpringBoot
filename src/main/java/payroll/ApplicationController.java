package payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {
    @Autowired
private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

@PostMapping("/admin/add")
public String addUser(@RequestBody User user){
    String pwd=user.getPassword();
    String encryptedPwd=passwordEncoder.encode(pwd);
    user.setPassword(encryptedPwd);
    userRepository.save(user);
    return "User Added Successfully";
}
//    @GetMapping("/profile")
//    public String process(){
//        return "passed the spring security through DB";
//    }


}
