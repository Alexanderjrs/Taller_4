/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/*Ejercicio 1
 */

    public class Rectangulo {
    //atributos de instacia
    private double base;
    private double altura;
    
    //atributos de clase
    public static final String COLOR="Azul";
    
    //metodo constructor por defecto
    public Rectangulo(){
        this.base=4;
        this.altura=10;
    }
    
    //metodos getter
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    //metodos setters
    public void setBase(double base){
        this.base=base;
    }
    
    public void setAltura(double Altura){
        this.altura=Altura;
    }
    //metodo miembros
    
    public double calcularArea(){
        return this.base*this.altura;
    }
    public double calcularPerimetro(){
        return 2*this.altura+ 2*this.base;
    }
    
}

