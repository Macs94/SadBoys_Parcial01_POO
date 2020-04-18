package com.JHGH.x00091813;

import javax.swing.*;
import java.util.ArrayList;

public class Empresa {
    //atributos

    private String nombre;
    private ArrayList<Empleado> planilla;

    //constructores

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.planilla = new ArrayList<>();
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
        this.planilla.add(employee);
    }

    public void quitEmpleado(String employeeName) {
        if(planilla.isEmpty())
            JOptionPane.showMessageDialog(null,"No hay empleados que despedir.");
        else{
            planilla.removeIf(obj->obj.nombre.equals(employeeName));
            JOptionPane.showMessageDialog(null,"Empleado despedido . . .");
        }

    }
}
