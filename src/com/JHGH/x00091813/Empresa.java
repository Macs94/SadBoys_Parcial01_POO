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
        boolean loop = true;
        int x = 0;
        while (loop) {
            try {
                loop = false;
                x = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "(1) Agregar documento          (2) Finalizar     "));
                if (x != 1 && x != 2)
                    throw new OutOfRangeException("Esa opcion no existe.");
            }
            catch (OutOfRangeException ex) {
                JOptionPane.showMessageDialog(null, ex);
                loop = true;
            }
            catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex);
                loop = true;
            }
            if (x == 1) {
                String nombre = JOptionPane.showInputDialog(null, "Nombre:");
                String numero = JOptionPane.showInputDialog(null, "Numero:");
                this.planilla.get(this.planilla.size() - 1).addDocumento(new Documento(nombre, numero));
                loop = true;
            }
        }
    }

    public void quitEmpleado(String employeeName) {
        for (int i = 0; i < planilla.size(); i++) {
            if (planilla.get(i).getNombre().equalsIgnoreCase(employeeName)) {

                JOptionPane.showMessageDialog(null,"Empleado a despedir:\n" + planilla.remove(i));
            }
            else
                JOptionPane.showMessageDialog(null,"No se encontro el empleado.");

        }


    }
}

