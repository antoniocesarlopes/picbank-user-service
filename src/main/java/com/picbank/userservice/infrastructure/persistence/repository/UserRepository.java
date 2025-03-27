package com.picbank.userservice.infrastructure.persistence.repository;

import com.picbank.userservice.application.port.out.UserRepositoryPort;
import com.picbank.userservice.infrastructure.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID>, UserRepositoryPort {

    boolean existsByEmail(String email);
    Optional<UserEntity> findByEmail(String email);
}
