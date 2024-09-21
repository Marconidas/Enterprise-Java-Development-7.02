package com.W11D3.W11D3.model;

import com.W11D3.W11D3.enums.HuespedStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private HuespedStatus status;
}
