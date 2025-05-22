/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicach1;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precioBase;

    public Vehiculo(String marca, String modelo, int año, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioBase = precioBase;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public double getPrecioBase() { return precioBase; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAño(int año) { this.año = año; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Precio Base: $" + precioBase);
    }
}
