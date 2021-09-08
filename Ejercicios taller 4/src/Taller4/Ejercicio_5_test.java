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
public class Ejercicio_5_test {
    public static void main(String[] args) {
        
        Ejercicio_triangulo T = new Ejercicio_triangulo();
        T.setAltura(30);
        T.setBase(20);
        T.setladoA(20);
        T.setladoB(20);
        T.setladoC(10);
        T.setBase(10);
        T.setAltura(20);
        T.setanguloA(18);
        T.setanguloB(20);
        imprimirInfoTriangulo(T);
        
        
    }
    
    public static void imprimirInfoTriangulo(Ejercicio_triangulo r){
        System.out.println("Longitud lados iguales: "+ r.longitudladosiguales());
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("Angulo vertice: " + r.Angulo_vertice());
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    }
}
