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
public class Ejercicio_7_test {
    public static void main(String[] args) {
         Producto pr=new Producto();
        pr.setCodigo(3117);
        pr.setpCompra(30.00);
        pr.setpUtilidad(0.5);
        imprimirInformacion(pr);
    }
    
    
        public static void imprimirInformacion(Producto r){
        System.out.println("Codigo de producto: "+ r.getCodigo());
        System.out.println("Precio de compra: "+ r.getpCompra());
        System.out.println("Precio de utilidad: "+ r.getpUtilidad());
        System.out.println("Precio de venta: "+ r.calcularpVenta());
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    }
}
