package com.picbank.userservice.infrastructure.persistence.repository;

import com.picbank.userservice.application.port.out.AddressRepositoryPort;
import com.picbank.userservice.infrastructure.persistence.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, UUID>, AddressRepositoryPort {

    Optional<AddressEntity> findByUserId(UUID userId);
}
