package com.blog.photoapp.api.users.service;

import com.blog.photoapp.api.users.entity.User;
import com.blog.photoapp.api.users.model.UserRequest;
import com.blog.photoapp.api.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl  {

//    @Autowired
//    private UserRepository userRepository;

//    @Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

//    @Override
//    public User createUser(UserRequest userRequest) {
//        User newUser = new User();
//        BeanUtils.copyProperties(userRequest, newUser);
//        User user = userRepository.save(newUser);
//        return user;
//    }
}
