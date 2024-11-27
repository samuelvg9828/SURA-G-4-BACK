package com.example.APIREST.G4.servicios;

import com.example.APIREST.G4.MODELOS.Enfermedad;
import com.example.APIREST.G4.MODELOS.Paciente;
import com.example.APIREST.G4.repositorios.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfermedadServicio {

    //PARA USAR UN SERVICIO DEBO LLAMAR AL REPOSITORIO
    //INYECTAR UNA DEPENDENCIA

    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    //LISTO LAS OPERACIONES QUE VOY A REALIZAR EN BD

    //REGISTRAR UN PACIENTE
    public Enfermedad registrarEnfermedad(Enfermedad datosEnfemedad) throws  Exception {

        try {
            //guardar en la bd los datos del paciente
            return iRepositorioEnfermedad.save(datosEnfemedad);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR LOS PACIENTE
    public List<Enfermedad> buscarEnfermedad()throws Exception{
        try{
            return iRepositorioEnfermedad.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
