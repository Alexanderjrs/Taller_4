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
public class Ejercicio_9_test {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe,Consignar, Retirar;

        //se crea objeto cuenta1 sin parámetros
        //se ejecuta el constructor por defecto
        Cuenta Cuenta = new Cuenta();

        System.out.print("Nombre del cliente : ");
        nombre = sc.nextLine();
        System.out.print("Número de la cuenta : ");
        numero = sc.nextLine();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();
        System.out.print("Ingrese saldo a Consignar: ");
        Consignar = sc.nextDouble();
        
        System.out.print("Ingrese saldo a Retirar: ");
        Retirar = sc.nextDouble();
        
        Cuenta.setNombre(nombre);
        Cuenta.setNumeroCuenta(numero);
        Cuenta.setSaldo(importe);

        

        //mostrar los datos de cuenta
        System.out.println("\nDatos de la cuenta :");
        System.out.println("Nombre del titular: " + Cuenta.getNombre());
        System.out.println("Número de cuenta: " + Cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + Cuenta.getSaldo());
       // System.out.println("El nuevo saldo al realizar el retiro es de: " +Cuenta-retirar);
        System.out.println();

        //se realiza un ingreso en cuenta1
        Cuenta.Consignar(Consignar);
        System.out.println("El nuevo Saldo despues de consignar es: " + Cuenta.getSaldo());
        
        Cuenta.retirar(Retirar);

        //mostrar el saldo de cuenta1 después del ingreso
        System.out.println("El nuevo Saldo despues de retirar es: " + Cuenta.getSaldo());

    }
}
