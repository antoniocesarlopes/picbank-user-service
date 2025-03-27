package com.picbank.userservice.application.service;

import com.picbank.userservice.application.port.in.GetUserPreferencesUseCase;
import com.picbank.userservice.application.port.out.UserPreferencesRepositoryPort;
import com.picbank.userservice.domain.model.UserPreferences;
import com.picbank.userservice.infrastructure.persistence.mapper.UserPreferencesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GetUserPreferencesService implements GetUserPreferencesUseCase {

    private final UserPreferencesRepositoryPort userPreferencesRepositoryPort;
    private final UserPreferencesMapper userPreferencesMapper;

    @Override
    public UserPreferences getUserPreferences(UUID userId) {
        return userPreferencesRepositoryPort.findByUserId(userId)
                .map(userPreferencesMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Preferências não encontradas para o usuário ID: " + userId));
    }
}
