package com.JHGH.x00091813;

import java.text.DecimalFormat;


public final class CalculadoraImpuestos {
    //atributos

    private static double totalRenta=0.00,totalISSS=0.00,totalAFP=0.00;

    //constructor privado

    private CalculadoraImpuestos() {}

    //metodos

    public static double calcularPago(Empleado employee){
        double montoPago =0.00,renta=0.00,ISSS=0.00,AFP=0.00;
        double salario = employee.getSalario();
        double restante;

        if(employee instanceof PlazaFija){
            AFP = 0.0625*salario;
            ISSS = 0.03*salario;
            restante=salario-AFP-ISSS;
            if(restante>=0.01 && restante<=472.00){
                renta = 0.00;
            }
            else if(restante>=472.01 && restante<=895.24){
                renta = 0.1*(restante-472)+17.67;
            }
            else if(restante>=895.25 && restante<=2038.10){
                renta = 0.2*(restante-895.24)+60;
            }
            else if(restante>=2038.11){
                renta = 0.3*(restante-2038.10)+288.57;
            }
           montoPago = restante - renta;
        }
        else if (employee instanceof ServicioProfesional){
            renta = 0.1*salario;
            montoPago = salario - renta;
        }
        totalRenta+=renta;
        totalISSS+=ISSS;
        totalAFP+=AFP;
        return montoPago;
    }

    public static String mostrarTotales(){
        DecimalFormat dec = new DecimalFormat("#0.00");
        return "Total Renta: "+dec.format(totalRenta)+"\nTotal ISSS: "+dec.format(totalISSS)+"\nTotal AFP: "+dec.format(totalAFP);
    }
}
