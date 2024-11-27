package com.example.APIREST.G4.repositorios;

import com.example.APIREST.G4.MODELOS.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioSignoVital extends JpaRepository<SignoVital,Long> {
}
