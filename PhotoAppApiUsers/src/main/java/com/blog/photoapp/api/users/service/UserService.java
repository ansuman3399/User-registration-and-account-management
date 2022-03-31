package com.blog.photoapp.api.users.service;

import com.blog.photoapp.api.users.entity.User;
import com.blog.photoapp.api.users.model.UserRequest;

public interface UserService {

    User createUser(UserRequest userRequest);
}
