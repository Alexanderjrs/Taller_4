/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/*Ejercicio 6
 */
public class Bicicleta {
    
    private int acelerar_1; 
    private int acelerar_2;
    private int frenar_1;
    private int frenar_2;
    private int velocidad_1; 
    private int velocidad_2; 
    private int plato_1;
    private int plato_2; 
    private int piñon_1;
    private int piñon_2;

    
   
    public Bicicleta(){
      
    }
    
    

    public Bicicleta(int acelerar_1, int acelerar_2, int frenar_1, int frenar_2, int velocidad_1, int velocidad_2, int plato_1, int plato_2, int piñon_1, int piñon_2) {
        this.acelerar_1=acelerar_1;
        this.acelerar_2=acelerar_2;
        this.frenar_1=frenar_1;
        this.frenar_2=frenar_2;
        this.velocidad_1 = velocidad_1;
        this.velocidad_2 = velocidad_2;
        this.plato_1 = plato_1;
        this.plato_2 = plato_2;
        this.piñon_1 = piñon_1;
        this.piñon_2 = piñon_2;

    }

    public int getAcelera() {
        return this.acelerar_1;
    }

    public int getAcelera2() {
        return this.acelerar_2;
    }

    public int getFrena() {
        return this.frenar_1;
    }

    public int getFrena2() {
        return this.frenar_2;
    }

    public int getVelocidad() {
        return this.velocidad_1;
    }

    public int getVelocidad2() {
        return this.velocidad_2;
    }

    public int getPlato() {
        return this.plato_1;
    }

    public int getPlato2() {
        return this.plato_2;
    }

    public int getPiñon() {
        return this.piñon_1;
    }

    public int getPiñon2() {
        return this.piñon_2;
    }

    public void setAcelera(int acelera) {
        this.acelerar_1 = acelera;
    }

    public void setAcelera2(int acelera2) {
        this.acelerar_2 = acelera2;
    }

    public void setFrena(int frena) {
        this.frenar_1 = frena;
    }

    public void setFrena2(int frena2) {
        this.frenar_2 = frena2;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad_1 = velocidad;
    }

    public void setVelocidad2(int velocidad2) {
        this.velocidad_2 = velocidad2;
    }

    public void setPlato(int plato) {
        this.plato_1 = plato;
    }

    public void setPlato2(int plato2) {
        this.plato_2 = plato2;
    }

    public void setPiñon(int piñon) {
        this.piñon_1 = piñon;
    }

    public void setPiñon2(int piñon2) {
        this.piñon_2 = piñon2;
    }
    
    public int calculaAceleracion(){
    
        return this.velocidad_1 * 2;

    }

    public int calculoFreno(){
        
        return this.velocidad_1 / 2;
    
    
    }
    public int calculaAceleracion2(){
    
        return this.velocidad_2 * 2;

    }
    
    public int calculoFreno2(){
        
        return this.velocidad_2 / 2;
    
    
    }

}