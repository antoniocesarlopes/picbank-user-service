package com.picbank.userservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Address {

    private Long id;
    private User user;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
