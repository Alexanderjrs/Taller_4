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
public class Ejercicio_1_test {
    public static void main(String[] args) {
        
        Rectangulo a=new Rectangulo();
        a.setAltura(20);
        a.setBase(10);
        imprimirInfoRec(a);
        Rectangulo b=new Rectangulo();
         imprimirInfoRec(b);
        
    }
    public static void imprimirInfoRec(Rectangulo r){
        System.out.println("Base: "+ r.getBase());
        System.out.println("Altura: "+ r.getAltura());
        System.out.println("Color: "+ Rectangulo.COLOR);
        System.out.println("Area: "+ r.calcularArea());
        System.out.println("Perimetro: "+ r.calcularPerimetro());
        System.out.println("------------------+---------------");
        
    }
        
        
    }

