package com.W11D1.W11D1.repository;

import com.W11D1.W11D1.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findByFechaNacimientoBetween(LocalDate startDate, LocalDate endDate);
    List<Paciente> findByAdmitidoPor_Departamento(String departamento);
    List<Paciente> findByAdmitidoPor_Estado(String estado);
}
