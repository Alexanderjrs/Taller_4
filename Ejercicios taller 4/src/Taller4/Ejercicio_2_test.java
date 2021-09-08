/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Ejercicio_2_test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese valor de X: ");
        int x = entrada.nextInt();
        
        Ecuacion e = new Ecuacion();
        e.setA(4);
        e.setB(3);
        e.setC(6);
        
        System.out.printf("Y(%d)= %.2f%n",x, e.evaluarEcuacion(x) );
        
        
        Ecuacion eSobrecargada = new Ecuacion(5,2,6);
        System.out.printf("* Y(%d)= %.2f%n",x, eSobrecargada.evaluarEcuacion(x) );
        
        Ecuacion Sobrecargada2 = new Ecuacion(5,2);
        System.out.printf("* Y(%d)= %.2f%n",x, Sobrecargada2.evaluarEcuacion(x) );
        
    }
}
