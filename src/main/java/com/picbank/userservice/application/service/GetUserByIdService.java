package com.picbank.userservice.application.service;

import com.picbank.userservice.application.port.in.GetUserByIdUseCase;
import com.picbank.userservice.application.port.out.UserRepositoryPort;
import com.picbank.userservice.domain.model.User;
import com.picbank.userservice.infrastructure.persistence.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GetUserByIdService implements GetUserByIdUseCase {

    private final UserRepositoryPort userRepositoryPort;
    private final UserMapper userMapper;

    @Override
    public User getUserById(UUID id) {
        return userRepositoryPort.findById(id)
                .map(userMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado para o ID: " + id));
    }
}
