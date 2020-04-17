package com.JHGH.x00091813;

import java.util.ArrayList;

public class Empresa {
    //atributos

    private String nombre;
    private ArrayList<Empleado> planilla;

    //constructores

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    //metodos

    public void addEmpleado(Empleado employee) {

    }

    public void quitEmpleado(String employeeName) {

    }
}
