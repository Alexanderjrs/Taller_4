/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/**
 Ejercicio 7
 */

    public class Producto {
    private int codigo ;
    private double PrCompra, PrVenta;
    private double PrUtilidad;
    
    public Producto(){
    
    
    }

    public Producto(int codigo, double pCompra, int pUtilidad) {
        this.codigo = codigo;
        this.PrCompra = pCompra;
        this.PrUtilidad = pUtilidad;
    }
   public int getCodigo() {
        return codigo;
    }

    public double getpCompra() {
        return PrCompra;
    }

    public double getpVenta() {
        return PrVenta;
    }

    public double getpUtilidad() {
        return PrUtilidad;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setpCompra(double pCompra) {
        this.PrCompra = pCompra;
    }

    public void setpVenta(double pVenta) {
        this.PrVenta = pVenta;
    }

    public void setpUtilidad(double pUtilidad) {
        this.PrUtilidad = pUtilidad;
    }

 
    
    
    public double calcularpVenta(){
        return  this.PrCompra * PrUtilidad;
    }
    }

