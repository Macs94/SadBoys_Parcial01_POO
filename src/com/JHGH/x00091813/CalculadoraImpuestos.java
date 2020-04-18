package com.JHGH.x00091813;

public final class CalculadoraImpuestos {
    private static double totalRenta,totalISSS,totalAFP;
    //Constructor privado
    private CalculadoraImpuestos() {}
    //Methods
    public static double calcularPago(Empleado employee){
        double montoPago = 0.00;
        double salario = employee.getSalario();
        if(employee instanceof PlazaFija){
            totalAFP = 0.0625*salario;
            totalISSS = 0.03*salario;
            double restante = salario-totalAFP-totalISSS;
            if(restante>=0.01 && restante<=472.00){
                totalRenta = 0.00;
            }
            else if(restante>=472.01 && restante<=895.24){
                totalRenta = 0.1*(restante-472)+17.67;
            }
            else if(restante>=895.25 && restante<=2038.10){
                totalRenta = 0.2*(restante-895.24)+60;
            }
            else if(restante>=2038.11){
                totalRenta = 0.3*(restante-2038.10)+288.57;
            }
           montoPago = restante - totalRenta;

        }
        else if (employee instanceof ServicioProfesional){
            totalRenta = 0.1*salario;
            montoPago = salario - totalRenta;
        }
        return montoPago;
    }
    public static String mostrarTotales(){
        return "Total Renta: "+totalRenta+"\nTotal ISSS: "+totalISSS+"\nTotal AFP: "+totalAFP;
    }


}
