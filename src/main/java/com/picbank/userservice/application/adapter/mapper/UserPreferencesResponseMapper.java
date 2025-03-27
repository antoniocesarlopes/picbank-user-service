package com.picbank.userservice.application.adapter.mapper;

import com.picbank.userservice.application.adapter.dto.UserPreferencesResponse;
import com.picbank.userservice.domain.model.UserPreferences;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPreferencesResponseMapper {
    UserPreferencesResponse toResponse(UserPreferences domain);
}

