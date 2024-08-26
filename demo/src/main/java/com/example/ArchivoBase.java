package com.example;

public class ArchivoBase {

    private String nombre;
    private int tamanio;

    public ArchivoBase(String nombre,int tamanio){
        this.nombre=nombre;
        this.tamanio=tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamanio() {
        return tamanio;
    }
}
