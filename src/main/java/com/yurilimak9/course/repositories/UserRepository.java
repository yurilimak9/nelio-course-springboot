package com.yurilimak9.course.repositories;

import com.yurilimak9.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
