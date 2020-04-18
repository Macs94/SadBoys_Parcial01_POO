package com.JHGH.x00091813;

public class PlazaFija extends Empleado {
    //atributos

    private int extension;

    //constructores

    public PlazaFija(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    //Setters y Getters

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
