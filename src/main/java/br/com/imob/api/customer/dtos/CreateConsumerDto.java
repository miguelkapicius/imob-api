package br.com.imob.api.customer.dtos;

import br.com.imob.api.customer.entity.CustomerType;
import br.com.imob.api.shared.domain.valueobject.Address;

public record CreateConsumerDto(
        String name,
        String email,
        String phone,
        CustomerType type,
        String document,
        Address address
) {
}
