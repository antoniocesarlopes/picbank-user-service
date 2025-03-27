package com.picbank.userservice.application.port.in;

import com.picbank.userservice.domain.model.UserPreferences;

import java.util.UUID;

public interface GetUserPreferencesUseCase {
    UserPreferences getUserPreferences(UUID id);
}
