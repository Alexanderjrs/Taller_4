/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/**
 *
 * @author acer
 */

    
    public class Ejercicio_Coche {
    private String color;
    private String marca;
    private String modelo;
    private int caballos;
    private int puertas;
    private String matricula;
    
    
    public Ejercicio_Coche(){
    
        
        
        
}
    public Ejercicio_Coche(String color, String marca, String modelo, int caballos, int puertas, String matricula){
        this.color="";
        this.marca="";
        this.modelo="";
        this.caballos= 0;
        this.puertas=0;
        this.matricula="";
    }
    
   
    public void setColor(String color){
        this.color=color;
    }
     public void setMarca(String marca){
        this.marca=marca;
    }
     
    public void setModelo(String modelo){
       this.modelo=modelo;
    }
    public void setCaballos(int caballos){
       this.caballos=caballos;
    }
    public void setPuertas(int puertas){
        this.puertas=puertas;
    }
    public void setMatricula (String matricula){
        this.matricula=matricula;
    }
     public String getColor(){
        return this.color;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
     }
    public int getCaballos(){
        return this.caballos;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public String getMatricula(){
        return this.matricula;
    }
    
    }
    

