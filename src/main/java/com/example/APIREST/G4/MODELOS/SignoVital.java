package com.example.APIREST.G4.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "signos_vitales")
public class SignoVital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; // 50 CARACTERES MAXIMO Y SOLO LETRAS
    private String valor; // 15 CARACTERES MAXIMO
    private LocalDate fechaMedida; //ESTE DATO NO PUEDE PASAR DE 2024

    //PASIENTE
    @ManyToOne //DE UNO A MUCHOS
    @JsonBackReference //PARA QUE NOSE QUEDE EN EL BUCK "VUELTA"
    @JoinColumn(name = "fk_pasiente", referencedColumnName = "id")
    private Paciente pasiente;


    public SignoVital() {
    }

    public SignoVital(long id, String nombre, String valor, LocalDate fechaMedida) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.fechaMedida = fechaMedida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDate getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(LocalDate fechaMedida) {
        this.fechaMedida = fechaMedida;
    }

    @Override
    public String toString() {
        return "SignoVital{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", valor='" + valor + '\'' +
                ", fechaMedida=" + fechaMedida +
                '}';
    }
}
