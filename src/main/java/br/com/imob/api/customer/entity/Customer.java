package br.com.imob.api.customer.entity;

import br.com.imob.api.shared.domain.valueobject.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity @Table(name = "clientes")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor @Getter @Setter
public class Customer {

    public Customer(String name, String document, String email, String phone, CustomerType type, Address address) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.phone = phone;
        this.type = type;
        this.address = address;
    }

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String document;

    private String email;

    private String phone;

    @Enumerated(EnumType.STRING)
    private CustomerType type;

    @Embedded
    private Address address;

}
