package com.JHGH.x00091813;

import javax.print.Doc;
import javax.swing.*;
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
        this.documentos = new ArrayList<>();
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

    public void addDocumento(Documento doc) {
        this.documentos.add(doc);
    }

    public void removeDocumento(String docName) {

    }

    @Override
    public String toString() {
        if (documentos.isEmpty()) {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", puesto='" + puesto + '\'' +
                    ", salario=" + salario +
                    '}';
        } else if (documentos.size() == 1) {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", puesto='" + puesto + '\'' +
                    ", salario=" + salario + '\'' +
                    ", documentos= \n(1)nombre='" + this.documentos.get(0).getNombre() + '\'' +
                    ", numero='" + this.documentos.get(0).getNumero() + '\'' + '}' +
                    "\n..............."
                    ;
        } else {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", puesto='" + puesto + '\'' +
                    ", salario=" + salario + '\'' +
                    ", documentos= \n(1)nombre='" + this.documentos.get(0).getNombre() + '\'' +
                    ", numero='" + this.documentos.get(0).getNumero() + '\'' +
                    ", (2)nombre='" + this.documentos.get(1).getNombre() + '\'' +
                    ", numero='" + this.documentos.get(1).getNumero() + '\'' + '}' +
                    "\n..............."
                    ;
        }
    }
}

