package com.picbank.userservice.infrastructure.persistence.repository;

import com.picbank.userservice.application.port.out.UserPreferencesRepositoryPort;
import com.picbank.userservice.infrastructure.persistence.entity.UserPreferencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserPreferencesRepository extends JpaRepository<UserPreferencesEntity, UUID>, UserPreferencesRepositoryPort {

    Optional<UserPreferencesEntity> findByUserId(UUID userId);
}
