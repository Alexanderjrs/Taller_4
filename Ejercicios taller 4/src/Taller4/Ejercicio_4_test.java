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
public class Ejercicio_4_test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ejercicio_Coche Coche = new Ejercicio_Coche();
        
        System.out.println("Ingrese el color del coche: ");
        String color = entrada.nextLine();
        
        System.out.println("Ingrese la marca del coche: ");
        String marca = entrada.nextLine();
        
        System.out.println("Ingrese el modelo del coche: ");
        String modelo = entrada.nextLine();
        
        System.out.println("Ingrese la matricula del coche: ");
        String matricula = entrada.nextLine();
        
        System.out.println("Ingrese los caballos de fuerza del coche: ");
        int caballos = entrada.nextInt();
        
        System.out.println("Ingrese el numero de puertas del coche: ");
        int puertas = entrada.nextInt();
       
        Coche.setColor(color);
        Coche.setMarca(marca);
        Coche.setModelo(modelo);
        Coche.setCaballos(caballos);
        Coche.setPuertas(puertas);
        Coche.setMatricula(matricula);
        
        System.out.println("\nDatos del Coche :");
        System.out.println("Color: " + Coche.getColor());
        System.out.println("Marca: " + Coche.getMarca());
        System.out.println("Modelo: " + Coche.getModelo());
        System.out.println("Caballos de fuerza: " + Coche.getCaballos());
        System.out.println("Numero de puertas: " + Coche.getPuertas());
        System.out.println("Matricula: " + Coche.getMatricula());
                 
    }
    
}
