package com.example.APIREST.G4.servicios;

import com.example.APIREST.G4.MODELOS.Paciente;
import com.example.APIREST.G4.MODELOS.SignoVital;
import com.example.APIREST.G4.repositorios.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignosVitalServico {

    //PARA USAR UN SERVICIO DEBO LLAMAR AL REPOSITORIO
    //INYECTAR UNA DEPENDENCIA

    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;

    //LISTO LAS OPERACIONES QUE VOY A REALIZAR EN BD


    //REGISTRAR UN PACIENTE
    public SignoVital registrarSignoVital(SignoVital datosSignoVital) throws  Exception {

        try {
            //guardar en la bd los datos del paciente
            return iRepositorioSignoVital.save(datosSignoVital);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR LOS PACIENTE
    public List<SignoVital> buscarSignoVital()throws Exception{
        try{
            return iRepositorioSignoVital.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
