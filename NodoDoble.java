
package com.mycompany.listadobleenlazada;

/**
 *
 * @author Yahir Bautista
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente,anterior;
    //Constructor cuando aun no hay nodos
    public NodoDoble(char el){
        this(el, null, null);
    }
  //Constructor para cuando ya hay nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a ){
        dato= el;
        siguiente = s;
        anterior = a;
    }
   
}
