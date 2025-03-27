package com.picbank.userservice.infrastructure.persistence.mapper;

import com.picbank.userservice.domain.model.Address;
import com.picbank.userservice.infrastructure.persistence.entity.AddressEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    Address toDomain(AddressEntity entity);
    AddressEntity toEntity(Address domain);
}
