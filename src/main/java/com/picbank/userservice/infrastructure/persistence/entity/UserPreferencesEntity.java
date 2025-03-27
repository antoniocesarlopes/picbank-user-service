package com.picbank.userservice.infrastructure.persistence.entity;

import com.picbank.userservice.domain.model.FontSize;
import com.picbank.userservice.domain.model.Language;
import com.picbank.userservice.domain.model.Theme;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_preferences")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPreferencesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Language language;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Theme theme;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FontSize fontSize;
}
