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
public class Ejercicio_8_test {
     public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.setTitulo("El psicoanalista");
        miLibro.setAutor("John Katzenbach");
        miLibro.setISBN("9789585984844");
        miLibro.setPaginas(500);
        miLibro.setEdicion("1a.");
        miLibro.setEditorial("Ballantine Books");
        miLibro.setLugar(" Estados Unidos", "Miami");
        miLibro.setFecha_edicion("29 de enero de 2002");
        imprimirInfoLibro(miLibro);
     
    }
    
    
    public static void imprimirInfoLibro(Libro r){
        System.out.println("Titulo: " + r.getTitulo());
        System.out.println(r.getEdicion() + "Edicion");
        System.out.println("Autor: "+ r.getAutor());
        System.out.println("ISBN: " + r.getISBN());
        System.out.println(r.getEditorial() + ","+ r.getLugar() + ","+ r.getFecha_edicion());
        System.out.println(r.getPaginas() + " Paginas");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    }
}
