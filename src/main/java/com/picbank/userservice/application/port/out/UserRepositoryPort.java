package com.picbank.userservice.application.port.out;

import com.picbank.userservice.domain.model.User;

import java.util.Optional;

public interface UserRepositoryPort {
    Optional<User> findByEmail(String email);
    Optional<User> findByCognitoId(String cognitoId);
    User save(User user);
}
