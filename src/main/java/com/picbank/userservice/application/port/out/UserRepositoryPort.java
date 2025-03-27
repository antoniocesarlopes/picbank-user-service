package com.picbank.userservice.application.port.out;

import com.picbank.userservice.infrastructure.persistence.entity.UserEntity;

import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryPort {
    boolean existsByEmail(String email);
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findById(UUID id);
}

