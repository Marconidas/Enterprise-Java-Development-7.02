package com.W11D1.W11D1.controller;

import com.W11D1.W11D1.model.Empleado;
import com.W11D1.W11D1.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getEmpleadoById(@PathVariable Long id) {
        return empleadoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/estado/{estado}")
    public List<Empleado> getEmpleadosByEstado(@PathVariable String estado) {
        return empleadoRepository.findByEstado(estado);
    }

    @GetMapping("/departamento/{departamento}")
    public List<Empleado> getEmpleadosByDepartamento(@PathVariable String departamento) {
        return empleadoRepository.findByDepartamento(departamento);
    }
}
