package src.TP1.Ej6_biblioteca;

import src.TP1.ListaEnlazada;

public class Biblioteca {
    private final ListaEnlazada <Libro> listaDeLibros;
    private int librosPrestados;

    public Biblioteca(){
        this.listaDeLibros = new ListaEnlazada();
        librosPrestados = 0;
    }
    public void agregarEjemplar(Libro libro1){
        listaDeLibros.agregarElemento(libro1);
    }
    public void agregarCantidad(Libro libro1, int cantidad){
        libro1.aumentarCantidad(cantidad);
    }
    public void prestarLibro(Libro libroPrestado){
        if (libroPrestado.prestarEjemplar()){
            librosPrestados++;
        }
    }
    public void masPaginas(Libro libro1, Libro libro2){
        if (libro1.getCantidad_paginas() > libro2.getCantidad_paginas()){
            System.out.println("El libro con mas paginas es: " + libro1.getTitulo());
        }else if (libro1.getCantidad_paginas() < libro2.getCantidad_paginas()){
            System.out.println("El libro con mas paginas es: " + libro2.getTitulo());
        }
        else System.out.println("Ambos libros tienen la misma cantidad de paginas.");
    }
    public void mostrarDescripcion(Libro libro1){
        System.out.println("El libro " + libro1.getTitulo() + " creado por el autor " + libro1.getAutor() + " tiene " + libro1.getCantidad_paginas() + " páginas, quedan " + libro1.getCantidadStock() + " disponibles y se prestaron: " + (libro1.getCantidadTotal() - libro1.getCantidadStock()));
    }
    public Libro buscarLibro(String titulo, String autor){
        int longitudLista = listaDeLibros.obtenerLongitud();
        Libro libro1;
        for (int i = 0; i < longitudLista; i++){
            libro1 = listaDeLibros.recuperarElemento(i);
            if (libro1.getTitulo() == titulo && libro1.getAutor() == autor){
                return libro1;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
        libro1 = null;

        return libro1;
    }
    public int getLibrosPrestados(){
        return librosPrestados;
    }
}