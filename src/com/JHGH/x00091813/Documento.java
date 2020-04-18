package com.JHGH.x00091813;

public class Documento {
    //atributos

    private String nombre;
    private String numero;

    //constructores

    public Documento(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
