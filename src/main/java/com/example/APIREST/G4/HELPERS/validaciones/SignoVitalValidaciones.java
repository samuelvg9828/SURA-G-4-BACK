package com.example.APIREST.G4.HELPERS.validaciones;

import com.example.APIREST.G4.MODELOS.SignoVital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignoVitalValidaciones {


    //Inyeccion de dependencias
    //Llamar una clase dentro de otra

    private SignoVital signoVitalUno = new SignoVital();

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
    public Boolean validarValor(String valor){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(valor);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarFechaMedida(LocalDate fechaMedida){

        if(fechaMedida.getYear()<2024){
            return false;
        }else{
            return true;
        }
    }
}
