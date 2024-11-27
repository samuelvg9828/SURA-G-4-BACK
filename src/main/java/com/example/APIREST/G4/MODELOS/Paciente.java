package com.example.APIREST.G4.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; //NO DEBE DE TENER MAS DE 40 CARACTERES //SOLO ADMITO LETRAS
    private LocalDate anioNacimiento; //ESTE AÑO NO PUEDE SER MAYOR A 2024 //NO PUEDE SER MENOR 1920
    private String ciudad; //NO DEBE DE TENER MAS DE 50 CARACTERES //SOLO LETRAS
    private String correo; //DEBE DE TENER FORMATO @SURA.COM.CO
    private String telefono; //DEBE DE TENER 10 DIJITOS
    private String ips; //
    private Boolean tienePoliza;
    private String grupoIngresos; //A,B,C
    private LocalDate fechaAfiliaciones; //SOLO VALIDAS ENTRE 1995 Y 2023

    //LAS RELACIONES SON ATRIBUTOS
       //MEDICO
       @ManyToOne //DE UNO A MUCHOS
       @JsonBackReference //PARA QUE NOSE QUEDE EN EL BUCK "VUELTA"
       @JoinColumn(name = "fk_medico", referencedColumnName = "id")
       private Medico medico;

       //ENFERMEDADES
       @JsonManagedReference //DE MUCHOS A UNO
       @OneToMany(mappedBy = "pasiente")
       private List<Enfermedad> enfermedades;

       //MEDICAMENTO
       @JsonManagedReference //DE MUCHOS A UNO
       @OneToMany(mappedBy = "pasiente")
       private List<Medicamento> medicamentos;

    //SIGNOSVITALES
    @JsonManagedReference //DE MUCHOS A UNO
    @OneToMany(mappedBy = "pasiente")
    private List<SignoVital> signosVitales;

    public Paciente() {
    }

    public Paciente(long id, String nombre, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, Boolean tienePoliza, String grupoIngresos, LocalDate fechaAfiliaciones) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.tienePoliza = tienePoliza;
        this.grupoIngresos = grupoIngresos;
        this.fechaAfiliaciones = fechaAfiliaciones;
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

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public LocalDate getFechaAfiliaciones() {
        return fechaAfiliaciones;
    }

    public void setFechaAfiliaciones(LocalDate fechaAfiliaciones) {
        this.fechaAfiliaciones = fechaAfiliaciones;
    }

    @Override
    public String toString() {
        return "Pasiente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", ciudad='" + ciudad + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ips='" + ips + '\'' +
                ", tienePoliza=" + tienePoliza +
                ", grupoIngresos='" + grupoIngresos + '\'' +
                ", fechaAfiliaciones=" + fechaAfiliaciones +
                '}';
    }
}
