package com.demo.naumov.repository;

import com.demo.naumov.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository
extends JpaRepository<User, Integer>
{
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Optional<User> findById(Integer id);
}