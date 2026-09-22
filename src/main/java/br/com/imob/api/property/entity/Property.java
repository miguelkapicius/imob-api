package br.com.imob.api.property.entity;

import br.com.imob.api.shared.domain.valueobject.Address;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity @Table(name = "imóveis")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor @Getter @Setter
public class Property {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private PropertyType type;

    @Enumerated(EnumType.STRING)
    private PropertyPurpose purpose;

    @Enumerated(EnumType.STRING)
    private PropertyStatus status;

    private BigDecimal salePrice;

    private BigDecimal rentPrice;

    private BigDecimal area;

    private Integer bedrooms;

    private Integer bathrooms;

    private Integer parkingSpaces;

    @Embedded
    private Address address;

}
