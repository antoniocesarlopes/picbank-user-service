package com.picbank.userservice.application.service;

import com.picbank.userservice.application.port.in.CreateUserUseCase;
import com.picbank.userservice.application.port.out.UserRepositoryPort;
import com.picbank.userservice.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    @Transactional
    public void createUser(User user) {
        userRepositoryPort.save(user);
    }
}
