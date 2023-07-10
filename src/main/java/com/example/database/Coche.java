package com.example.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String empresa;
    private Integer anyo;
    
    public Coche () {

    }

    public Coche(Long id, String nombre, String empresa, Integer anyo) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
        this.anyo = anyo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Coche [id=" + id + ", nombre=" + nombre + ", empresa=" + empresa + ", anyo=" + anyo + "]";
    }
    
}
