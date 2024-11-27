package com.example.APIREST.G4.controladores;

import com.example.APIREST.G4.MODELOS.Medicamento;
import com.example.APIREST.G4.MODELOS.Paciente;
import com.example.APIREST.G4.MODELOS.SignoVital;
import com.example.APIREST.G4.servicios.MedicamentosServicio;
import com.example.APIREST.G4.servicios.SignosVitalServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signovital")
public class SignoVitalControlador {

    @Autowired
    SignosVitalServico signosVitalServico;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital datos){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(signosVitalServico.registrarSignoVital(datos));

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
                    .body(signosVitalServico.buscarSignoVital());
        }catch (Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
