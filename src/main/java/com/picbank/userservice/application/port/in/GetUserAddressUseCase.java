package com.picbank.userservice.application.port.in;

import com.picbank.userservice.domain.model.Address;

import java.util.UUID;

public interface GetUserAddressUseCase {
    Address getUserAddress(UUID userId);
}

