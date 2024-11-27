package com.example.APIREST.G4.controladores;

import com.example.APIREST.G4.MODELOS.Paciente;
import com.example.APIREST.G4.servicios.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paciente")
public class PacienteControlador {

    @Autowired
    PacienteServicio pacienteServicio;

    @PostMapping
    public ResponseEntity<?>guardar(@RequestBody Paciente datos){
        try {

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(pacienteServicio.registrarPaciente(datos));

        }catch (Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodo(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(pacienteServicio.buscarPacientes());
        }catch (Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

}
