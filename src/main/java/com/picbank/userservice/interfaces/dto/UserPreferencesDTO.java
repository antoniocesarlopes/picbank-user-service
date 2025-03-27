package com.picbank.userservice.interfaces.dto;

import com.picbank.userservice.domain.model.FontSize;
import com.picbank.userservice.domain.model.Language;
import com.picbank.userservice.domain.model.Theme;

public record UserPreferencesDTO(
        Language language,
        Theme theme,
        FontSize fontSize
) {}
