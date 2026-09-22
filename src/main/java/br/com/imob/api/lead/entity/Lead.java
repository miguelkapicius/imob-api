package br.com.imob.api.lead.entity;

import br.com.imob.api.customer.entity.Customer;
import br.com.imob.api.property.entity.Property;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity @Table(name = "leads")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @Getter @Setter
public class Lead {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Property property;

    @Enumerated(EnumType.STRING)
    private LeadStatus leadStatus;

    @Enumerated(EnumType.STRING)
    private LeadSource leadSource;

    private String notes;

    private Instant createdAt;

}
