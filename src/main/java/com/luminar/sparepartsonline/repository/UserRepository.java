package com.luminar.sparepartsonline.repository;


import com.luminar.sparepartsonline.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
