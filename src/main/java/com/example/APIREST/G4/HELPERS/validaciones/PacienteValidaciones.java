package com.example.APIREST.G4.HELPERS.validaciones;

import com.example.APIREST.G4.MODELOS.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PacienteValidaciones {

    //Inyeccion de dependencias
    //Llamar una clase dentro de otra

    private Paciente juan = new Paciente();

    //Crear un metodo para cada dato que debo validar
    public Boolean validarNombre(String nombre) {


        //VALIDARE QUE EL NOMBRE SOLO TENGA LETRAS

        //PASOS 1-DEBO DE CREAR UNA EXPESION REGULAR
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        //2- CREAR UN PATRON DE JAVA PARA LA REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        //3-APLICAR EL PATRON AL TEXTO QUE INTRODUCE EL USUARIO
        Matcher coincidencia = patron.matcher(nombre);

        //4-SE VERIFICA LA COINCIDENCIA
        if (coincidencia.find()) {
            return true;
        } else {
            return false;
        }
    }
    public Boolean validarFechaNacimiento(LocalDate fecha){
        if(fecha.getYear()>2024 || fecha.getYear()<1920){
           return false;
        }else{
            return true;
        }
    }
    public Boolean validarCiudad(String ciudad) {


        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(ciudad);

        if (coincidencia.find()) {
            return false;
    }else{
            return true;
        }
    }
    public Boolean validarCorreo(String correo){
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@sura\\.com$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(correo);

        if (coincidencia.find()) {
           return false;
        }else {
            return true;
        }

    }
    public Boolean validaTelefono(String telefono){
        if(telefono.length() !=10){
            return false;
        }else {
            return true;
        }
    }
    public Boolean validarGrupoIngresos(String grupoIngresos){
        if(grupoIngresos.toUpperCase().equals("A")|| grupoIngresos.toUpperCase().equals("B")|| grupoIngresos.toUpperCase().equals("C")){
           return false;
        }else {
            return false;
        }
    }
    public Boolean fechaValidacionO(LocalDate fecha){
        if (fecha.getYear()>1995 && fecha.getYear()<2023) {
            return false;
        }else {
            return false;
        }
    }


}
