
package com.mycompany.listadobleenlazada;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author Yahir Bautista
 */
public class ListaDobleEnlazada {

    public static void main(String[] args) {
    ListaDoble listita= new ListaDoble();
    int opcion= 0;
       Scanner sc = new Scanner (System.in);
    Scanner Teclado = new Scanner(System.in);
    
     System.out.println("Presione 1 para agregar al inicio\n, "
             + "Presione 2 para agregar al final\n" 
             + "Presione 3 mostrar del inicio al fin\n"
             + "Presione 4 para mostrar del fin al inicio\n"
             + "Presione 5 para eliminar desde el inicio\n"
             + "Presione 6 para eliminar desde el final\n");
    
    switch (opcion) {
       case 1: 
        System.out.print("Se ha creado un nuevo dato"+ listita.agregarAlInicio());
       break;
       
       case 2: 
        System.out.println("Se ha ingresado un elemento al final"+ listita.agregarAlFinal());
        break;
        
       case 3:
        System.out.println("Se muestra la lista de inicio a fin\n" + listita.mostrarListaInicioFin());
        break;
        
       case 4:
        System.out.println("Se muestra la lista de fin a inicio" + listita.mostrarListaFinInicio());
        break;
        
       case 5:
        System.out.prinln("Se esta eliminando desde el inicio" + listita.eliminarDelInicio());
        break;
        
       case 6:
        System.out.println("Se esta eliminando desde el final" + listita.eliminarDelFinal());
       break; 
       
       default:
           System.out.println("Opción no encontrada, error");
    }
    
    
    
    
    
    
    } 
}
    