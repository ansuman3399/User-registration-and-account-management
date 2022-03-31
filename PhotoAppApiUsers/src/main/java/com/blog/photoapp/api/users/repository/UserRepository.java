package com.blog.photoapp.api.users.repository;

import com.blog.photoapp.api.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
