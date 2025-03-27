package com.picbank.userservice.infrastructure.persistence;

import com.picbank.userservice.application.port.out.UserRepositoryPort;
import com.picbank.userservice.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>, UserRepositoryPort {
    Optional<User> findByEmail(String email);
    Optional<User> findByCognitoId(String cognitoId);
}
