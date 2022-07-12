package com.argentinaprograma.APIBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String tituloEducacion;
    @Column
    private String urlDiploma;
    @Column
    private String imgDiploma;
    @Column
    private String institucion;
    @Column
    private String fechaEducacion;
    @Column
    private String localidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloEducacion() {
        return tituloEducacion;
    }

    public void setTituloEducacion(String tituloEducacion) {
        this.tituloEducacion = tituloEducacion;
    }

    public String getUrlDiploma() {
        return urlDiploma;
    }

    public void setUrlDiploma(String urlDiploma) {
        this.urlDiploma = urlDiploma;
    }

    public String getImgDiploma() {
        return imgDiploma;
    }

    public void setImgDiploma(String imgDiploma) {
        this.imgDiploma = imgDiploma;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getFechaEducacion() {
        return fechaEducacion;
    }

    public void setFechaEducacion(String fechaEducacion) {
        this.fechaEducacion = fechaEducacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
