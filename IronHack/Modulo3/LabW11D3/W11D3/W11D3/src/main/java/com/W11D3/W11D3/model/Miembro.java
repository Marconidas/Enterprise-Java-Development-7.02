package com.W11D3.W11D3.model;

import com.W11D3.W11D3.enums.MiembroStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Miembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MiembroStatus status;

    private LocalDate renewalDate;
}
