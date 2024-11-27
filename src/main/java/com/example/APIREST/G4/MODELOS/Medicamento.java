package com.example.APIREST.G4.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "medicamentos")
public class Medicamento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; //NO MAS DE 50 CARACTERES Y SOLO LETRAS
    private String presentacion; //NO MAS DE 30 CARACTERES
    private Double dosis; //NO MAS DE 5 CARACTERES Y SOLO NUMEROS
    private String laboratorio; //NO MAS DE 50 CARACTERES Y SOLO LETRAS
    private LocalDate fechaCaducidad; //NO MAS DE 10 CARACTERES Y SOLO NUMEROS
    private String contraIndicaciones; //NO MAS DE 50 CARACTERES
    private String registroINVIMA; //NO MAS DE 50 CARACTERES
    private Boolean tieneCopago;

    //PASIENTE
    @ManyToOne //DE UNO A MUCHOS
    @JsonBackReference //PARA QUE NOSE QUEDE EN EL BUCK "VUELTA"
    @JoinColumn(name = "fk_pasiente", referencedColumnName = "id")
    private Paciente pasiente;

    public Medicamento() {
    }

    public Medicamento(long id, String nombre, String presentacion, Double dosis, String laboratorio, LocalDate fechaCaducidad, String contraIndicaciones, String registroINVIMA, Boolean tieneCopago) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.fechaCaducidad = fechaCaducidad;
        this.contraIndicaciones = contraIndicaciones;
        this.registroINVIMA = registroINVIMA;
        this.tieneCopago = tieneCopago;
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

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getDosis() {
        return dosis;
    }

    public void setDosis(Double dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraIndicaciones() {
        return contraIndicaciones;
    }

    public void setContraIndicaciones(String contraIndicaciones) {
        this.contraIndicaciones = contraIndicaciones;
    }

    public String getRegistroINVIMA() {
        return registroINVIMA;
    }

    public void setRegistroINVIMA(String registroINVIMA) {
        this.registroINVIMA = registroINVIMA;
    }

    public Boolean getTieneCopago() {
        return tieneCopago;
    }

    public void setTieneCopago(Boolean tieneCopago) {
        this.tieneCopago = tieneCopago;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", dosis=" + dosis +
                ", laboratorio='" + laboratorio + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", contraIndicaciones='" + contraIndicaciones + '\'' +
                ", registroINVIMA='" + registroINVIMA + '\'' +
                ", tieneCopago=" + tieneCopago +
                '}';
    }
}
