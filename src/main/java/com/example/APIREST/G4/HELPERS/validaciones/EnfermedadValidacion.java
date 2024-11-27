package com.example.APIREST.G4.HELPERS.validaciones;

import com.example.APIREST.G4.MODELOS.Enfermedad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EnfermedadValidacion {

        //Inyeccion de dependencias
        //Llamar una clase dentro de otra

        private Enfermedad fiebre = new Enfermedad();

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
        public Boolean validarSintoma(String sintomas){
            String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

            Pattern patron = Pattern.compile(expresionRegular);

            Matcher coincidencia = patron.matcher(sintomas);

            if (coincidencia.find()) {
                return false;
            }else{
                return true;
            }
        }
        public Boolean validarClasificacion(String clasificasiones) {
            String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

            Pattern patron = Pattern.compile(expresionRegular);

            Matcher coincidencia = patron.matcher(clasificasiones);

            if (coincidencia.find()) {
                return false;
            }else{
                return true;
            }
        }
        public Boolean validarGrado(String grado){
            String expresionRegular = "^[a-zA-ZñÑ\\s]+$";

            Pattern patron = Pattern.compile(expresionRegular);

            Matcher coincidencia = patron.matcher(grado);

            if (coincidencia.find()) {
                return false;
            }else{
                return true;
            }
        }
    }

