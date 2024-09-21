package com.W11D1.W11D1.controller;

import com.W11D1.W11D1.model.Paciente;
import com.W11D1.W11D1.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getPacienteById(@PathVariable Long id) {
        return pacienteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/fecha-nacimiento")
    public List<Paciente> getPacientesByFechaNacimiento(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return pacienteRepository.findByFechaNacimientoBetween(startDate, endDate);
    }

    @GetMapping("/departamento-admitido/{departamento}")
    public List<Paciente> getPacientesByDepartamentoAdmitido(@PathVariable String departamento) {
        return pacienteRepository.findByAdmitidoPor_Departamento(departamento);
    }

    @GetMapping("/medico-apagado")
    public List<Paciente> getPacientesByMedicoApagado() {
        return pacienteRepository.findByAdmitidoPor_Estado("APAGADO");
    }
}
