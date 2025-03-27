package com.picbank.userservice.application.service;

import com.picbank.userservice.application.port.in.GetUserAddressUseCase;
import com.picbank.userservice.application.port.out.AddressRepositoryPort;
import com.picbank.userservice.domain.model.Address;
import com.picbank.userservice.infrastructure.persistence.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GetUserAddressService implements GetUserAddressUseCase {

    private final AddressRepositoryPort addressRepositoryPort;
    private final AddressMapper addressMapper;

    @Override
    public Address getUserAddress(UUID userId) {
        return addressRepositoryPort.findByUserId(userId)
                .map(addressMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado para o usuário ID: " + userId));
    }
}
