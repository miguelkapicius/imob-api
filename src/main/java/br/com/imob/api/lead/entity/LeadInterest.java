package br.com.imob.api.lead.entity;

import br.com.imob.api.property.entity.Property;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity @Table(name = "lead_interesses")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @Getter @Setter
public class LeadInterest {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Lead lead;

    @ManyToOne
    private Property property;

}
