package com.W11D3.W11D3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Conferencia extends Evento {

    @OneToMany
    private List<Orador> oradores;
}
