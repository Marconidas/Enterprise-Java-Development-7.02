package com.W11D1.W11D1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Define el campo como clave primaria y autogenerado
    private Long idEmpleado;

    private String departamento;
    private String nombre;
    private String estado; // Valores posibles: "EN LLAMADA", "APAGADO", etc.
}
