package br.com.imob.api.rental.entity;

import br.com.imob.api.customer.entity.Customer;
import br.com.imob.api.property.entity.Property;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity @Table(name = "contratos_aluguel")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @Getter @Setter
public class RentalContract {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Property property;

    @ManyToOne
    private Customer tenant;

    private LocalDate startDate;

    private LocalDate endDate;

    private BigDecimal rentAmount;

    private Integer dueDay;

    @Enumerated(EnumType.STRING)
    private RentalContractStatus status;

}
