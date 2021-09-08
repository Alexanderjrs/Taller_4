/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/*Ejercicio 11
 */

    public class Fraccion {
     private int numerador;
     private int denominador;
  public Fraccion() {
     numerador=0;
     denominador=1;
  }
  public Fraccion(int x, int y) {
     numerador=x;
     denominador=y;
  }
  
  
  public static Fraccion sumarFraccion(Fraccion a, Fraccion b){
     Fraccion c=new Fraccion();
     c.numerador=a.numerador*b.denominador+b.numerador*a.denominador;
     c.denominador=a.denominador*b.denominador;
     return c;
  }
  public static Fraccion restarFraccion(Fraccion a, Fraccion b){
     Fraccion c=new Fraccion();
     c.numerador=a.numerador*b.denominador-b.numerador*a.denominador;
     c.denominador=a.denominador*b.denominador;
     return c;
  }

  public static Fraccion multiplicarFraccion(Fraccion a, Fraccion b){
     return new Fraccion(a.numerador*b.numerador, a.denominador*b.denominador);
  }
  public static Fraccion inversa(Fraccion a){
     return new Fraccion(a.denominador, a.numerador);
  }
  public static Fraccion dividirFraccion(Fraccion a, Fraccion b){
     return multiplicarFraccion(a, inversa(b));
  }

  private int mcd(){
     int u=Math.abs(numerador);
     int v=Math.abs(denominador);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
  }

  public Fraccion simplificarFraccion(){
     int dividir=mcd();
     numerador/=dividir;
     denominador/=dividir;
     return this;
  }

     @Override
  public String toString(){
     String texto=numerador+ " / " + denominador;
     return texto;
  }
}

