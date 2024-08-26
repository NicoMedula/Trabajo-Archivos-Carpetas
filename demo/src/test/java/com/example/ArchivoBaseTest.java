package com.example;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArchivoBaseTest {

    @Test
    public void crear_un_archivo_Test() {
        Archivo a1 = new Archivo("Archivo.txt", 12);

        assertEquals("Archivo.txt", a1.getNombre());
        assertEquals(12, a1.getTamanio());
    }

    @Test
    public void crear_una_carpeta_Test() {
        Carpeta c1 = new Carpeta("Carpeta1");

        assertEquals("Carpeta1", c1.getNombre());
        assertEquals(64, c1.getTamanio());
    }

    @Test
    public void agregar_carpeta_y_archivos_Test() {
        Carpeta ucp = new Carpeta("UCP");
        Carpeta materias = new Carpeta("Materias");
        Carpeta paradigma2 = new Carpeta("Paradigmas2");

        Archivo calendario = new Archivo("Calendario.txt", 320);
        Archivo tp1 = new Archivo("TP1", 164);

        ucp.agregarCarpeta(materias);
        materias.agregarCarpeta(paradigma2);
        materias.agregarArchivo(calendario);
        paradigma2.agregarArchivo(tp1);

        assertEquals(676, ucp.getTamanioCarpetaTotal(), 0.01);
    }
}
