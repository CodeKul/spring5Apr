package com.codekul.spring5Apr.jpa.repository;

import com.codekul.spring5Apr.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    Boolean existsByUsernameAndPassword(String username,String password);
}
