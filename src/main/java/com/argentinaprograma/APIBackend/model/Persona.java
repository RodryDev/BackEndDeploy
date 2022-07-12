package com.argentinaprograma.APIBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombreUsuario;
   
    @Column
    private String nombre;
    @Column
    private String apellido;
  
    @Column
    private String urlImg;
    @Column
    private String ciudad;
    @Column
    private String provincia;
    @Column
//    @JsonFormat(pattern = "dd/MM/yyyy")
    private String fechaNac;

// RELACIONES    
    @OneToOne()
    private Educacion educacion;
    @OneToOne()
    private Experiencia experiencia;
    @OneToOne()
    private Habilidad habilidad;
    @OneToOne()
    private Proyecto proyecto;
    @OneToOne()
    private User user;
    @OneToOne()
    private AcercaDe acercaDe; 

    public Persona() {
    }

    public Persona(Long id, String nombreUsuario, String nombre, String apellido, String urlImg, String ciudad, String provincia, String fechaNac, Educacion educacion, Experiencia experiencia, Habilidad habilidad, Proyecto proyecto, User user, AcercaDe acercaDe) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.urlImg = urlImg;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.fechaNac = fechaNac;
        this.educacion = educacion;
        this.experiencia = experiencia;
        this.habilidad = habilidad;
        this.proyecto = proyecto;
        this.user = user;
        this.acercaDe = acercaDe;
    }


    
    
    
}
