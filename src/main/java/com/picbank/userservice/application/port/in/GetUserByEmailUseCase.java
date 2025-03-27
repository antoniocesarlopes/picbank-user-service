package com.picbank.userservice.application.port.in;

import com.picbank.userservice.domain.model.User;

public interface GetUserByEmailUseCase {
    User getUserByEmail(String email);
}
