/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

// Ejercicio 5
public class Ejercicio_triangulo {
    
     // atributos de instancia
    private double base;
    private double al,ldA,ldB,ldC,angA,angB;
    
    // constructor por defecto
    public Ejercicio_triangulo(){
        this.ldA=10;
        this.ldB=10;
        this.ldC=5;
        this.base = ldC;
        this.al=10;
        this.angA=14;
        this.angB=10;
    }
    
    
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.al = altura;
    }
    
    public void setladoA(double lA){
        this.ldA = lA;
    }
    
    public void setladoB(double lB){
        this.ldB = lB;
    }
    public void setladoC(double lC){
        this.ldC = lC;
    }
    
    public void setanguloA(double aA){
        this.ldC = aA;
    }
    
    public void setanguloB(double aB){
        this.ldC = aB;
    }
    
    public double getBase(){
        return this.base;
    }   
    
    public double getAltura(){
        return this.al;
    }
    public double getladoA(){
        return this.ldA;
    }
    public double getladoB(){
        return this.ldB;
    }
    public double getladoC(){
        return this.ldC;
    }
    
    public double getanguloA(){
        return this.angA;
    }
    public double getanguloB(){
        return this.angB;
    }
    
    
    public double calcularArea(){
        return (this.ldB*Math.sqrt(Math.pow(this.ldA, 2)*(this.ldB/4))/2);
    }
    
    public double calcularPerimetro(){
        return 2 * this.ldA + this.ldB;
    }
    public double longitudladosiguales(){
        return this.ldA + this.ldB;
    
    }
    
    public double Angulo_vertice(){
        return this.angA + this.angB;
    
    }
}
