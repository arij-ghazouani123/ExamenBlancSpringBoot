package com.example.examenpratiquespringboot.Controller;


import com.example.examenpratiquespringboot.Entity.User;
import com.example.examenpratiquespringboot.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserRestController {

    @Autowired
    IUserService iUserService;



    @PostMapping("/AddUser")
    public User addUser(@RequestBody User user) {
        return iUserService.addUser(user);
    }
}
