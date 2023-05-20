package com.codekul.spring5Apr.jpa.repository;

import com.codekul.spring5Apr.jpa.entity.UserActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserActivityRepository extends JpaRepository<UserActivity,Long> {
}
