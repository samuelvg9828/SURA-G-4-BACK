package com.example.APIREST.G4.servicios;

import com.example.APIREST.G4.MODELOS.Medico;
import com.example.APIREST.G4.MODELOS.Paciente;
import com.example.APIREST.G4.repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicio {

    //PARA USAR UN SERVICIO DEBO LLAMAR AL REPOSITORIO
    //INYECTAR UNA DEPENDENCIA

    @Autowired
    IRepositorioMedico iRepositorioMedico;

    //LISTO LAS OPERACIONES QUE VOY A REALIZAR EN BD

    //REGISTRAR UN PACIENTE
    public Medico registrarMedico(Medico datosMedico) throws  Exception {

        try {
            //guardar en la bd los datos del paciente
            return iRepositorioMedico.save(datosMedico);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR LOS PACIENTE
    public List<Medico> buscarMedico()throws Exception{
        try{
            return iRepositorioMedico.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
