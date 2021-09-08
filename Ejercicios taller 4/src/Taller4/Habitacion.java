/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/*Ejercicio 3
 */

    
    public class Habitacion {
    
    private double longi;
    private double an;
     private double al;
    
    public Habitacion(){
    }
    
    public Habitacion(double largo, double ancho, double alto){
        this.al=alto;
        this.an=ancho;
        this.longi = largo;
    }

 
    public double getLargo() {
        return longi;
    }
    public double getAncho() {
        return an;
    }
    public double getAlto() {
        return al;
    }
    
    
    public void setLargo(double largo) {
        this.longi = largo;
    }

  
    public void setAncho(double ancho) {
        this.an = ancho;
    }

    public void setAlto(double alto) {
        this.al = alto;
    }
    
    public double cantidadEnchape(){
        return this.an*this.longi;
    }
    
    public double cantidadTapizado(){
        
        return 2*(this.al*this.an) + 2 * (this.al*this.longi);
    }
    
}

