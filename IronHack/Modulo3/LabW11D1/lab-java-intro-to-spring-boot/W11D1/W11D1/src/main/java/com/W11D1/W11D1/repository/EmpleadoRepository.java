package com.W11D1.W11D1.repository;

import com.W11D1.W11D1.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findByEstado(String estado);
    List<Empleado> findByDepartamento(String departamento);
}
