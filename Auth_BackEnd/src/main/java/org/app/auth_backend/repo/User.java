package org.app.auth_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface User extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
