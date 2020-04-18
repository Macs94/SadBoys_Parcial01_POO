package com.JHGH.x00091813;

public class ServicioProfesional extends Empleado{
    private int mesesContrato;

    //Constructores
    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContrato) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

   //Setters y Getters
    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}
