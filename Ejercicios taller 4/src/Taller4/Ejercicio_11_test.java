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
public class Ejercicio_11_test {
    public static void main(String[] args) {
        
        Fraccion x=new Fraccion(8,2);
     Fraccion y=new Fraccion(4,7);
     Fraccion z=new Fraccion(2,8);
     System.out.println("x-->  "+x);
     System.out.println("y-->  "+y);
     System.out.println("z-->  "+z);
     System.out.println("Suma = "+Fraccion.sumarFraccion(x, y));
     System.out.println("Resta = "+Fraccion.restarFraccion(x, y));
     System.out.println("Multiplicacion = "+Fraccion.multiplicarFraccion(x,y));

     Fraccion resultado=Fraccion.multiplicarFraccion(Fraccion.sumarFraccion(x,y),z);
     System.out.println("\nSimplificacion=  " + resultado);
     System.out.println(resultado.simplificarFraccion());
     try  {
            System.in.read();
        }catch (Exception e) {  }
        
    }
}
