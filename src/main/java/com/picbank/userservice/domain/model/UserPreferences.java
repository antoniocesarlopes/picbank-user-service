package com.picbank.userservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPreferences {

    private Long id;
    private User user;
    private Language language;
    private Theme theme;
    private FontSize fontSize;
}
