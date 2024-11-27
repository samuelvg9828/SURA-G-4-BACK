package com.example.APIREST.G4.HELPERS.validaciones;

import com.example.APIREST.G4.MODELOS.Medicamento;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicamentoValidacion {

    //Inyeccion de dependencias
    //Llamar una clase dentro de otra

    private Medicamento acetaminofen = new Medicamento();

    //Crear un metodo para cada dato que debo validar
    public Boolean validaNombre(String nombre){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(nombre);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarPresentacion(String presentacion){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(presentacion);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarDosis(Double dosis) {
        // Verifica si la dosis es nula
        if (dosis == null) {
            return false; // Dosis no válida
        }

        // Verifica si la dosis es un número positivo
        return dosis > 0;
    }
    public Boolean validarLaboratorio(String laboratorio){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(laboratorio);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarFechaCaducidad(LocalDate fechaCaducidad){
        if(fechaCaducidad.getYear()>2024){
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarContraIndicasiones(String contraIndicaciones){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(contraIndicaciones);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean validarRegistroInvima(String registroInvima){
        String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(registroInvima);

        if (coincidencia.find()) {
            return false;
        }else{
            return true;
        }
    }

}
