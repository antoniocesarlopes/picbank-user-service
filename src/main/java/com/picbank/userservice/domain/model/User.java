package com.picbank.userservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private UUID id;
    private String cognitoId;
    private String email;
    private String document;
    private String fullName;
    private UserType type;
    private Address address;
    private UserPreferences preferences;
    private LocalDateTime createdAt;
}
