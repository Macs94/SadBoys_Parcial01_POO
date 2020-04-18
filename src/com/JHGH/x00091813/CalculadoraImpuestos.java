package com.JHGH.x00091813;

public final class CalculadoraImpuestos {
    //atributos

    private static double totalRenta,totalISSS,totalAFP;

    //constructor privado

    private CalculadoraImpuestos() {}

    //metodos

    public static double calcularPago(Empleado employee){
        double montoPago = 0.00;
        return montoPago;
    }
    public static String mostrarTotales(){
        return "Total Renta: "+totalRenta+"\nTotal ISSS: "+totalISSS+"\nTotal AFP: "+totalAFP;
    }


}
