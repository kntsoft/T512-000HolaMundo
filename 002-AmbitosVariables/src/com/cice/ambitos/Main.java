/*
 * Mostramos el funcionamiento de los ambitos de uso de las variables.
 */
package com.cice.ambitos;

/**
 * Clase Principal...
 * @author iagov
 */
public class Main {
    //variable local de la clase
    int numeroClase;
    
    /**
     * Metodo Main
     * @param args 
     */
    public static void main(String[] args){
        
        // Variable local del metodo
        int numero = 0;
        
        numero = 2;
        
        if (numero == 0) {
            numero = 3;
        }
        
        Main principal = new Main();
        principal.metodoPrueba();
    }
    /**
     * Metodo de prueba (Ojo no es un metodo static)
     */
    public void  metodoPrueba(){
        numeroClase = 76;
        int numero = 3;        
        
        System.out.println(numeroClase);
    }
}
