package com.example.APIREST.G4.HELPERS.validaciones;

import com.example.APIREST.G4.MODELOS.Medico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicoValidacion {


    //Inyeccion de dependencias
    //Llamar una clase dentro de otra

    private Medico david = new Medico();

    public Boolean validarNombre(String nombre){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(nombre);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarMatricula(String matricula){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(matricula);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarEspecialidad(String especialidad){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(especialidad);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarSalario(Integer salario){

    //VERIFICA SI EL SALARIO ES NULO
        if (salario == null){
            return false; //SALARIO NO VALIDO
        }
        //VERIFICA SI EL SALARIO ES UN NUMERO POSITIVO
        return salario > 0;
    }

    public Boolean validarIps(String ips){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(ips);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarCorreo(String correo){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(correo);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarTelefono(String telefono){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(telefono);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarDireccion(String direccion){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(direccion);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
}
