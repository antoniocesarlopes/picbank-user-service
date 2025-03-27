package com.picbank.userservice.application.adapter.mapper;

import com.picbank.userservice.application.adapter.dto.UserResponse;
import com.picbank.userservice.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserResponseMapper {
    UserResponse toResponse(User domain);
}

