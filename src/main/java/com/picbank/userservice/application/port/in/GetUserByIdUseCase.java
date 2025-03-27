package com.picbank.userservice.application.port.in;

import com.picbank.userservice.domain.model.User;

import java.util.UUID;

public interface GetUserByIdUseCase {
    User getUserById(UUID id);
}
