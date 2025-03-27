package com.picbank.userservice.application.adapter.web;


import com.picbank.userservice.application.adapter.dto.AddressResponse;
import com.picbank.userservice.application.adapter.dto.UserExistsResponse;
import com.picbank.userservice.application.adapter.dto.UserPreferencesResponse;
import com.picbank.userservice.application.adapter.dto.UserResponse;
import com.picbank.userservice.application.adapter.mapper.AddressResponseMapper;
import com.picbank.userservice.application.adapter.mapper.UserPreferencesResponseMapper;
import com.picbank.userservice.application.adapter.mapper.UserResponseMapper;
import com.picbank.userservice.application.adapter.web.api.UsersApi;
import com.picbank.userservice.application.port.in.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class UserController implements UsersApi {

    private final CheckUserUseCase checkUserUseCase;
    private final GetUserAddressUseCase getUserAddressUseCase;
    private final GetUserByEmailUseCase getUserByEmailUseCase;
    private final GetUserByIdUseCase getUserByIdUseCase;
    private final GetUserPreferencesUseCase getUserPreferencesUseCase;

    private final UserResponseMapper userResponseMapper;
    private final AddressResponseMapper addressResponseMapper;
    private final UserPreferencesResponseMapper userPreferencesResponseMapper;

    @Override
    public ResponseEntity<UserExistsResponse> checkUserExists(String email) {
        var exists = checkUserUseCase.checkUserExists(email);
        var response = new UserExistsResponse();
        response.setExists(exists);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<AddressResponse> getUserAddress(UUID id) {
        var address = getUserAddressUseCase.getUserAddress(id);
        var response = addressResponseMapper.toResponse(address);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<UserResponse> getUserByEmail(String email) {
        var user = getUserByEmailUseCase.getUserByEmail(email);
        var response = userResponseMapper.toResponse(user);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<UserResponse> getUserById(UUID id) {
        var user = getUserByIdUseCase.getUserById(id);
        var response = userResponseMapper.toResponse(user);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<UserPreferencesResponse> getUserPreferences(UUID id) {
        var preferences = getUserPreferencesUseCase.getUserPreferences(id);
        var response = userPreferencesResponseMapper.toResponse(preferences);
        return ResponseEntity.ok(response);
    }
}

