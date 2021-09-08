/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller4;

/*Ejercicio 8
 */

    public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String edicion;
   private  String editorial;
   private String lugar;
    private String fechaedicion;
    private  int paginas;
     
    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, int paginas, String edicion, String editorial, String lugar, String fechaedicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugar = lugar;
        this.fechaedicion = fechaedicion;
        this.paginas = 500;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setLugar(String ciudad,String pais) {
        this.lugar = ciudad+"("+pais+")";
    }

    public void setFecha_edicion(String fecha_edicion) {
        this.fechaedicion = fecha_edicion;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getISBN() {
        return ISBN;
    }
     public int getPaginas() {
        return paginas;
    }
    public String getEdicion() {
        return edicion;
    }
     public String getEditorial() {
        return editorial;
    }

    public String getLugar() {
        return lugar;
    }
public String getFecha_edicion() {
        return fechaedicion;
    }
    
    }

