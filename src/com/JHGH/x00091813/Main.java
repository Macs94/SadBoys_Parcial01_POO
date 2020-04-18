package com.JHGH.x00091813;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Empresa business = new Empresa("IBM");
        int menuChoice = 0;
        do {
            try {
                menuChoice = mainMenu();
                if (menuChoice < 1 || menuChoice > 6)
                    throw new OutOfRangeException("Esa opcion no existe.");
            }
            catch (OutOfRangeException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            switch (menuChoice) {
                case 1:
                    business.addEmpleado(inputEmpleado());
                    break;
                case 2:
                    String despedido="";
                    if(business.getPlanilla().isEmpty())
                        JOptionPane.showMessageDialog(null,"La lista de empleados esta vacía.");
                    else
                        despedido = JOptionPane.showInputDialog(null,"Nombre del empleado a despedir:");
                        business.quitEmpleado(despedido);
                    break;

                case 3:
                    verEmpleados(business);
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (menuChoice != 6);
    }

    public static int mainMenu() {
        int x = 0;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "MENU:\n(1) Agregar empleado\n(2) Despedir empleado\n(3) Ver lista de empleados\n" +
                            "(4) Calcular sueldo\n(5) Mostrar totales\n(6) SALIR"));
        }
        catch (IllegalArgumentException ex) {}
        return x;
    }

    public static Empleado inputEmpleado() {
        boolean loop = true;
        int x = 0;
        while (loop) {
            try {
                loop = false;
                x = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "(1)Servicio profesional            (2)Plaza fija     "));
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
        }
        loop = true;
        String nombre = JOptionPane.showInputDialog(null, "Nombre:");
        String puesto = JOptionPane.showInputDialog(null, "Puesto:");
        double salario = 0;
        while (loop) {
            try {
                loop = false;
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario:"));
                if (salario < 0)
                    throw new OutOfRangeException("El salario no puede ser negativo.");
            }
            catch (OutOfRangeException ex) {
                JOptionPane.showMessageDialog(null, ex);
                loop = true;
            }
            catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex);
                loop = true;
            }
        }
        loop = true;
        if (x == 1) {
            int mesesContrato = 0;
            while (loop) {
                try {
                    loop = false;
                    mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses de contrato:"));
                    if (mesesContrato < 0)
                        throw new OutOfRangeException("Los meses de contrato no pueden ser negativos.");
                }
                catch (OutOfRangeException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    loop = true;
                }
                catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    loop = true;
                }
            }
            return new ServicioProfesional(nombre, puesto, salario, mesesContrato);
        }
        else {
            int extension = 0;
            while (loop) {
                try {
                    loop = false;
                    extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Extension:"));
                    if (extension < 0)
                        throw new OutOfRangeException("La extension no puede ser negativa.");
                }
                catch (OutOfRangeException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    loop = true;
                }
                catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    loop = true;
                }
            }
            return new PlazaFija(nombre, puesto, salario, extension);
        }
    }

    public static void verEmpleados(Empresa business) {
        if (!business.getPlanilla().isEmpty())
            business.getPlanilla().forEach(obj -> JOptionPane.showMessageDialog(null, obj.toString()));
        else
            JOptionPane.showMessageDialog(null, "No hay empleados en la lista.");
    }
}
