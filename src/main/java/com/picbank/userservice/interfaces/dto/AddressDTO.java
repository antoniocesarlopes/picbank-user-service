package com.picbank.userservice.interfaces.dto;

public record AddressDTO(
        String street,
        String city,
        String state,
        String zipCode,
        String country
) {}
