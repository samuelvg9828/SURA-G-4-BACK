package com.example.APIREST.G4.servicios;

import com.example.APIREST.G4.MODELOS.Paciente;
import com.example.APIREST.G4.repositorios.IRespositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {

    //PARA USAR UN SERVICIO DEBO LLAMAR AL REPOSITORIO
    //INYECTAR UNA DEPENDENCIA

    @Autowired
    IRespositorioPaciente iRespositorioPaciente;

    //LISTO LAS OPERACIONES QUE VOY A REALIZAR EN BD

    //REGISTRAR UN PACIENTE
    public Paciente registrarPaciente(Paciente datosPaciente) throws  Exception {

        try {
            //guardar en la bd los datos del paciente
            return iRespositorioPaciente.save(datosPaciente);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }


    //BUSCAR LOS PACIENTE
    public List<Paciente> buscarPacientes()throws Exception{
        try{
            return iRespositorioPaciente.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }


    //BUSCAR UN PACIENTE POR ID


}
