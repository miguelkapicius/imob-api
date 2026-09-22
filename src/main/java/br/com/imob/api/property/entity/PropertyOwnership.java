package br.com.imob.api.property.entity;

import br.com.imob.api.customer.entity.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity @Table(name = "proprietarios")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @Getter @Setter
public class PropertyOwnership {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Property property;

    @ManyToOne
    private Customer customer;

    private BigDecimal percentage;

}
