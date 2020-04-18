package com.JHGH.x00091813;

import javax.swing.*;

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
                menuChoice = 0;
            }
            switch (menuChoice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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
                    "MENU:\n1) Agregar empleado\n2) Despedir empleado\n3) Ver lista de empleados\n" +
                            "4) Calcular sueldo\n5) Mostrar totales\n6) SALIR"));
        }
        catch (IllegalArgumentException ex) {}
        return x;
    }
}
