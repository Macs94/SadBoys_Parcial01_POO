package com.JHGH.x00091813;

public class PlazaFija extends Empleado {
    private int extension;

    //Constructor
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
