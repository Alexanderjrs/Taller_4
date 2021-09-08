/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/**
Ejercicio 12
 */

    
    public class CaidaLibre {
    
    private int Vo;
    private double G;
    private int t;
    
  
    public CaidaLibre(){
      
    }
    
    public void setVelocidadInicial(int VelocidadInicial) {
        this.Vo = VelocidadInicial;
    }

    public void setGravedad(Double Gravedad) {
        this.G = Gravedad;
    }

    public void setTiempo(int tiempo) {
        this.t = tiempo;
    }

    public int getVelocidadInicial() {
        return Vo;
    }

    public Double getGravedad() {
        return G;
    }

    public int getTiempo() {
        return t;
    }

   
    public double Calculardistancia(){
        double distancia = 0.5 * G * Math.pow(t,2);
        return distancia;
    }
  
    public double evaluar(){
        
        double VelocidadFinal = this.Vo + G * t;
        return VelocidadFinal;
    }
}
    
    
