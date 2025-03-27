package com.picbank.userservice.application.port.out;

import com.picbank.userservice.infrastructure.persistence.entity.UserPreferencesEntity;

import java.util.Optional;
import java.util.UUID;

public interface UserPreferencesRepositoryPort {
    Optional<UserPreferencesEntity> findByUserId(UUID userId);
}

