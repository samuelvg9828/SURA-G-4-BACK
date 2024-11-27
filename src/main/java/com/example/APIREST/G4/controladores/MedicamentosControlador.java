package com.example.APIREST.G4.controladores;


import com.example.APIREST.G4.MODELOS.Medicamento;
import com.example.APIREST.G4.MODELOS.Paciente;
import com.example.APIREST.G4.servicios.MedicamentosServicio;
import com.example.APIREST.G4.servicios.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentosControlador {

    @Autowired
    MedicamentosServicio medicamentosServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Medicamento datos){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(medicamentosServicio.registrarMedicamento(datos));

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
                    .body(medicamentosServicio.buscarMedicamento());
        }catch (Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
