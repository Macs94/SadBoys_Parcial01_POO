package com.JHGH.x00091813;

public class Documento extends Empleado {
    //atributos
    private String nombre;
    private String numero;

    //constructores
    public Documento(String nombre, String puesto, double salario, String nombre1, String numero) {
        super(nombre, puesto, salario);
        this.nombre = nombre1;
        this.numero = numero;
    }

    //getters
    @Override
    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }
}
