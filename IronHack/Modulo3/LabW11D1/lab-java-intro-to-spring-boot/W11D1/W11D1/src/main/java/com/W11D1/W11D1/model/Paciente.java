package com.W11D1.W11D1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "pacientes")
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Define el campo como clave primaria y autogenerado
    private Long idPaciente;

    private String nombre;
    private LocalDate fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "admitido_por", referencedColumnName = "idEmpleado")
    private Empleado admitidoPor; // Relación con el empleado (médico que admitió)
}
