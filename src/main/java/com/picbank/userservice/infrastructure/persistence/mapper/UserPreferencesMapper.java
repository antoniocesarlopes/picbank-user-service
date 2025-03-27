package com.picbank.userservice.infrastructure.persistence.mapper;

import com.picbank.userservice.domain.model.UserPreferences;
import com.picbank.userservice.infrastructure.persistence.entity.UserPreferencesEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPreferencesMapper {
    UserPreferences toDomain(UserPreferencesEntity entity);
    UserPreferencesEntity toEntity(UserPreferences domain);
}