package com.example.examenpratiquespringboot.Service;

import com.example.examenpratiquespringboot.Entity.User;
import com.example.examenpratiquespringboot.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class IUserServiceIMP implements IUserService {
    UserRepository userRepository;





    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
