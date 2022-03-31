package com.blog.photoapp.api.users.service;

import com.blog.photoapp.api.users.entity.User;
import com.blog.photoapp.api.users.model.UserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User createUser(UserRequest userRequest);

}
