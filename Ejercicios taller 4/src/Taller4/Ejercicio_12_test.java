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
public class Ejercicio_12_test {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CaidaLibre caidaL = new CaidaLibre();
        System.out.println("Ingrese la velocidad inicial: ");
        int VelocidadInicial = entrada.nextInt();  
        System.out.println("Ingrese el Tiempo( segundos ) : ");
        int tiempo = entrada.nextInt();
        caidaL.setVelocidadInicial(VelocidadInicial);
        caidaL.setTiempo(tiempo);
        caidaL.setGravedad(9.8);
        imprimirCaidaLibre(caidaL);
          
    }
    public static void imprimirCaidaLibre(CaidaLibre r) {
        System.out.println("La distancia recorrida es de: " + r.Calculardistancia()+ " metros");
        System.out.println("La velocidad final es: " + r.evaluar() + " m/s");
        
    }
}
