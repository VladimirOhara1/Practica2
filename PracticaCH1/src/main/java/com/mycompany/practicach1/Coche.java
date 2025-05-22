/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicach1;
public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int año, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, año, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() { return numPuertas; }
    public String getTipoCombustible() { return tipoCombustible; }

    public void setNumPuertas(int numPuertas) { this.numPuertas = numPuertas; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puertas: " + numPuertas + ", Combustible: " + tipoCombustible);
    }
}
