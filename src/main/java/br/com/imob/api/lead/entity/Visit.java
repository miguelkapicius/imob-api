package br.com.imob.api.lead.entity;

import br.com.imob.api.customer.entity.Customer;
import br.com.imob.api.property.entity.Property;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity @Table(name = "visitas")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor @Getter @Setter
public class Visit {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Lead lead;

    @ManyToOne
    private Property property;

    @ManyToOne
    private Customer broker;

    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private VisitStatus status;

    private String notes;

}
