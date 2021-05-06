package com.alhelpthecat.model;

import java.io.Serializable;

public class Animal implements Serializable {

    String nombre, veterinario, urlImage, cantidadPendiente, cantidadRecaudada, intervenciones;

    public Animal(String nombre, String veterinario, String urlImage, String cantidadPendiente, String cantidadRecaudada, String intervenciones) {
        this.nombre = nombre;
        this.veterinario = veterinario;
        this.urlImage = urlImage;
        this.cantidadPendiente = cantidadPendiente;
        this.cantidadRecaudada = cantidadRecaudada;
        this.intervenciones = intervenciones;
    }

    public Animal() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getCantidadPendiente() {
        return cantidadPendiente;
    }

    public void setCantidadPendiente(String cantidadPendiente) {
        this.cantidadPendiente = cantidadPendiente;
    }

    public String getCantidadRecaudada() {
        return cantidadRecaudada;
    }

    public void setCantidadRecaudada(String cantidadRecaudada) {
        this.cantidadRecaudada = cantidadRecaudada;
    }

    public String getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(String intervenciones) {
        this.intervenciones = intervenciones;
    }
}