package com.blog.photoapp.api.users.repository;

import com.blog.photoapp.api.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
