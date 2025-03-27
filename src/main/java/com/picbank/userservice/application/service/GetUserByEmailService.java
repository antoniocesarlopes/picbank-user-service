package com.picbank.userservice.application.service;

import com.picbank.userservice.application.port.in.GetUserByEmailUseCase;
import com.picbank.userservice.application.port.out.UserRepositoryPort;
import com.picbank.userservice.domain.model.User;
import com.picbank.userservice.infrastructure.persistence.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserByEmailService implements GetUserByEmailUseCase {

    private final UserRepositoryPort userRepositoryPort;
    private final UserMapper userMapper;

    @Override
    public User getUserByEmail(String email) {
        return userRepositoryPort.findByEmail(email)
                .map(userMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado para o email: " + email));
    }
}
