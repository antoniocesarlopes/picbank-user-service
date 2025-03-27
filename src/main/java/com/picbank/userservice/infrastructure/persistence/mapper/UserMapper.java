package com.picbank.userservice.infrastructure.persistence.mapper;

import com.picbank.userservice.domain.model.User;
import com.picbank.userservice.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toDomain(UserEntity entity);
    UserEntity toEntity(User domain);
}
