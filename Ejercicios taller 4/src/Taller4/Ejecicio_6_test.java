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
public class Ejecicio_6_test {
    
    public static void main(String[] args) {
     
       Scanner entrada = new Scanner(System.in);
        Bicicleta b = new Bicicleta();
        b.setVelocidad(25);
        b.setPlato(3);
        b.setPiñon(2);
        imprimirBicicleta(b);
        System.out.print("velocidad: ");
        int v = entrada.nextInt();
        System.out.print("plato: ");
        int pl = entrada.nextInt();
        System.out.print("piñon: ");
        int p = entrada.nextInt();

        Bicicleta a = new Bicicleta();
        a.setVelocidad(52);
        a.setPlato(1);
        a.setPiñon(8);
        a.setVelocidad2(v);
        a.setPlato2(pl);
        a.setPiñon2(p);
        imprimirBicicleta2(a);
             
    }
    
        public static void imprimirBicicleta(Bicicleta r){
        System.out.println("Velocidad: "+ r.getVelocidad());
        System.out.println("Plato: "+ r.getPlato());
        System.out.println("Piñon: "+ r.getPiñon());
        System.out.println("Aceleracion: "+ r.calculaAceleracion());
        System.out.println("Frenado: "+ r.calculoFreno());
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    
        }
        
        public static void imprimirBicicleta2(Bicicleta u){
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println("Nueva Velocidad: "+ u.getVelocidad2());
        System.out.println("Nuevo Plato: "+ u.getPlato2());
        System.out.println("Nuevo Piñon: "+ u.getPiñon2());
        System.out.println("Nueva Aceleracion: "+ u.calculaAceleracion2());
        System.out.println("Nuevo Frenado: "+ u.calculoFreno2());
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
     
        
    }
}
