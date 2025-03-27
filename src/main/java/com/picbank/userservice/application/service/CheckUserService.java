package com.picbank.userservice.application.service;

import com.picbank.userservice.application.port.in.CheckUserUseCase;
import com.picbank.userservice.application.port.out.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CheckUserService implements CheckUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public boolean checkUserExists(String email) {
        return userRepositoryPort.existsByEmail(email);
    }
}
