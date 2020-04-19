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
            return "Nombre: " + nombre +
                    ", Puesto: " + puesto +
                    ", Salario: " + salario+" USD";
        } else if (documentos.size() == 1) {
            return "Nombre: " + nombre +
                    ",Puesto: " + puesto +
                    ", Salario: " + salario +" USD"+
                    "\nDocumento:\n(1)" + this.documentos.get(0).getNombre() +"-" + this.documentos.get(0).getNumero();
        } else {
            return "Nombre: " + nombre +
                    ",Puesto: " + puesto +
                    ", Salario: " + salario +" USD"+
                    "\nDocumentos:\n(1)" + this.documentos.get(0).getNombre() +"-" + this.documentos.get(0).getNumero() +
                    "\n(2)" + this.documentos.get(1).getNombre() +"-" + this.documentos.get(1).getNumero()+
                    "\n.............";
        }
    }
}

