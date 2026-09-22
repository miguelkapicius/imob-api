package br.com.imob.api.financial.entity;

import br.com.imob.api.rental.entity.RentalContract;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity @Table(name = "pagamentos")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor @Getter @Setter
public class Payment {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private RentalContract contract;

    private BigDecimal amount;

    private LocalDate dueDate;

    private LocalDate paidAt;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
}
