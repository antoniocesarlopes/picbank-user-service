package com.picbank.userservice.application.port.out;

import com.picbank.userservice.infrastructure.persistence.entity.AddressEntity;

import java.util.Optional;
import java.util.UUID;

public interface AddressRepositoryPort {
    Optional<AddressEntity> findByUserId(UUID userId);
}

