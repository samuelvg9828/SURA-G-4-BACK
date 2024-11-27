package com.example.APIREST.G4.repositorios;

import com.example.APIREST.G4.MODELOS.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedico extends JpaRepository<Medico,Long> {
}
