package com.picbank.userservice.application.port.in;

import com.picbank.userservice.domain.model.User;

public interface CreateUserUseCase {
    void createUser(User user);
}
