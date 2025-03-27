package com.picbank.userservice.application.adapter.mapper;

import com.picbank.userservice.application.adapter.dto.AddressResponse;
import com.picbank.userservice.domain.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    AddressResponse toResponse(Address domain);
}

