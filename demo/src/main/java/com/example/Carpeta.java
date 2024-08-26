
package com.example;

import java.util.ArrayList;

public class Carpeta extends ArchivoBase {

    private ArrayList<ArchivoBase> carpetas = new ArrayList<>();
    

    public Carpeta(String nombre) {
        super(nombre,64);
    }

    @Override
    public int getTamanio(){

        int tamanioTotal = super.getTamanio();

        for(ArchivoBase archivoBase:carpetas){
            tamanioTotal += archivoBase.getTamanio();
        }
        
        return tamanioTotal;
    }

    public void agregarArchivo(Archivo archivo) {

        carpetas.add(archivo);
        
    }

    public void agregarCarpeta(Carpeta carpeta) {

        carpetas.add(carpeta);
        
    }

    public int getTamanioCarpetaTotal() {
        return getTamanio();
    }
    

    
    

}
