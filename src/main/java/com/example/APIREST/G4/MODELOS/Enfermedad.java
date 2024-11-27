package com.example.APIREST.G4.MODELOS;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "enfermedades")
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; //50 CARACTERES Y SOLO LETRAS
    private String sintoma; //100 CARACTERES
    private String clasifiacion;//20 CARACTERES MAXIMO
    private String grado; //SOLO NUMEROS //NO MAS DE 20 CARACTERES
    private Double probabilidadVivir;

       //PASIENTE
       @JsonBackReference //PARA QUE NO SE QUEDE EN EL BUCK "IDA"
       @JoinColumn (name = "fk_pasiente", referencedColumnName = "id")
       @ManyToOne //@ONETOMANY= QUIERE DECIR DE UNO A MUCHOS** mappedBy= se refiere al nombre del atributo en la entidad relacionada
       private Paciente pasiente;

    public Enfermedad() {
    }

    public Enfermedad(long id, String nombre, String sintoma, String clasifiacion, String grado, Double probabilidadVivir) {
        this.id = id;
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.clasifiacion = clasifiacion;
        this.grado = grado;
        this.probabilidadVivir = probabilidadVivir;
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

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getClasifiacion() {
        return clasifiacion;
    }

    public void setClasifiacion(String clasifiacion) {
        this.clasifiacion = clasifiacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Double getProbabilidadVivir() {
        return probabilidadVivir;
    }

    public void setProbabilidadVivir(Double probabilidadVivir) {
        this.probabilidadVivir = probabilidadVivir;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sintoma='" + sintoma + '\'' +
                ", clasifiacion='" + clasifiacion + '\'' +
                ", grado='" + grado + '\'' +
                ", probabilidadVivir=" + probabilidadVivir +
                '}';
    }
}
