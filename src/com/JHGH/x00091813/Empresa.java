package com.JHGH.x00091813;

import java.util.ArrayList;

public class Empresa extends Empleado {
    //atributos

    private String nombre;
    private ArrayList<Empleado> planilla;

    //constructores

    public Empresa(String nombre, String puesto, double salario, String nombre1) {
        super(nombre, puesto, salario);
        this.nombre = nombre1;
    }

    //getters

    @Override
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
