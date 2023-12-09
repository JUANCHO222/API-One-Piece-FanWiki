package com.onepiece.One.Piece.FanWiki.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OnePieceModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apodo;
    private String ocupacion;
    private String edad;
    private String cumpleanos;
    private String aparicion;

    public OnePieceModelo() {
    }

    public OnePieceModelo(String nombre, String apodo, String ocupacion, String edad, String cumpleaños, String aparicion) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.cumpleanos = cumpleanos;
        this.aparicion = aparicion;
    }

    public OnePieceModelo(long id, String nombre, String apodo, String ocupacion, String edad, String cumpleanos, String aparicion) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.cumpleanos = cumpleanos;
        this.aparicion = aparicion;
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

    public String getAlias() {
        return apodo;
    }

    public void setAlias(String alias) {
        this.apodo = alias;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(String cumpleaños) {
        this.cumpleanos = cumpleaños;
    }

    public String getDebut() {
        return aparicion;
    }

    public void setDebut(String debut) {
        this.aparicion = debut;
    }
}
