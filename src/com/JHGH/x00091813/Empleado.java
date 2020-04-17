package com.JHGH.x00091813;

import java.util.ArrayList;

abstract public class Empleado {
    //atributos
    protected String nombre;
    protected String puesto;
    protected ArrayList<Documento> documentos;
    protected double salario;

    //constructores
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public double getSalario() {
        return salario;
    }

    //setters
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodos
    void addDocumento(Documento documento) {

    }

    void removeDocumento(String documento) {

    }
}
