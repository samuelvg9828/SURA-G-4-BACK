package com.example.APIREST.G4.MODELOS;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;//50 CARACTERES Y SOLO LETRAS
    private String matricula;// 20 CARACTERES
    private String especialidad;//50 CARACTERES
    private Integer salario;//NO PUEDE SER NEGATIVO //MINIMO 8000000 //MAXIMO 30000000
    private String ips; //50 CARACTERES
    private String correo; //DEBE DE TENER FORMATO @SURA.COM.CO
    private String telefono; //DEBE DE TENER 10 CARACTERES
    private String direccion; //DEBE DE TENER 100 CARACTERES
    private Boolean estaDisponibleFindeSemana;

      //PASIENTE
      @JsonManagedReference //PARA QUE NO SE QUEDE EN EL BUCK "IDA"
      @OneToMany(mappedBy = "medico") //@ONETOMANY= QUIERE DECIR DE UNO A MUCHOS** mappedBy= se refiere al nombre del atributo en la entidad relacionada
      private List<Paciente> pasientes;

    public Medico() {
    }

    public Medico(long id, String nombre, String matricula, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean estaDisponibleFindeSemana) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estaDisponibleFindeSemana = estaDisponibleFindeSemana;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstaDisponibleFindeSemana() {
        return estaDisponibleFindeSemana;
    }

    public void setEstaDisponibleFindeSemana(Boolean estaDisponibleFindeSemana) {
        this.estaDisponibleFindeSemana = estaDisponibleFindeSemana;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", salario=" + salario +
                ", ips='" + ips + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estaDisponibleFindeSemana=" + estaDisponibleFindeSemana +
                '}';
    }
}
