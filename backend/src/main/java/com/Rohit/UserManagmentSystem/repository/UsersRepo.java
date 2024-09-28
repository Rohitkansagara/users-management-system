package com.Rohit.UserManagmentSystem.repository;

import com.Rohit.UserManagmentSystem.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers,Integer> {

    Optional<OurUsers> findByEmail(String email);
}
