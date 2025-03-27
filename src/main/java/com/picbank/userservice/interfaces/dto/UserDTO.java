package com.picbank.userservice.interfaces.dto;

import com.picbank.userservice.domain.model.UserType;
import java.util.UUID;

public record UserDTO(
        UUID id,
        String email,
        String document,
        String fullName,
        UserType type,
        AddressDTO address,
        UserPreferencesDTO preferences
) {}
