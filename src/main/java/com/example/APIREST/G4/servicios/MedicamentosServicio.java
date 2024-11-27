package com.example.APIREST.G4.servicios;

import com.example.APIREST.G4.MODELOS.Medicamento;
import com.example.APIREST.G4.MODELOS.Paciente;
import com.example.APIREST.G4.repositorios.IRepositorioMedicamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentosServicio {

    //PARA USAR UN SERVICIO DEBO LLAMAR AL REPOSITORIO
    //INYECTAR UNA DEPENDENCIA

    @Autowired
    IRepositorioMedicamentos iRepositorioMedicamentos;

    //LISTO LAS OPERACIONES QUE VOY A REALIZAR EN BD

    //REGISTRAR UN PACIENTE
    public Medicamento registrarMedicamento(Medicamento datosMedicamento) throws  Exception {

        try {
            //guardar en la bd los datos del paciente
            return iRepositorioMedicamentos.save(datosMedicamento);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR LOS PACIENTE
    public List<Medicamento> buscarMedicamento()throws Exception{
        try{
            return iRepositorioMedicamentos.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
