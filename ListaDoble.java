package com.mycompany.listadobleenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author Yahir Bautista
 */
public class ListaDoble {
    private NodoDoble inicio, fin;
    public ListaDoble(){
        inicio=fin=null;
    }
   //Metodo para saber cuando la lista esta vacia
    public boolean estaVacia(){
     return inicio== null;   
    }
   //Metodo para agregar nodos al final
    public void agregarAlFinal(char el){
       if(!estaVacia()){
           fin= new NodoDoble(el, fin, fin);
           fin.anterior.siguiente= fin;
       }else{
           inicio= fin= new NodoDoble(el);
       }
    }
    //Metodo para agregar nodos al inicio 
     public void agregarAlInicio(char el){
       if(!estaVacia()){
           inicio= new NodoDoble(el, inicio, null);
           inicio.siguiente.anterior= inicio;
       }else{
           inicio= fin= new NodoDoble(el);
       }
    }
    //Metodo para mostrar la lista de Inicio a Fin
     public void mostrarListaInicioFin(){
         if(!estaVacia()){
             String datos="<=>";
             NodoDoble auxiliar= inicio;
             while(auxiliar!=null){
                 datos = datos + "["+auxiliar.dato+"]<=>";
                 auxiliar= auxiliar.siguiente;
             }
             JOptionPane.showMessageDialog(null, datos,
                     "Mostrando Lista del inicio a fin",
                     JOptionPane.INFORMATION_MESSAGE);
         }
     }
     //Metodo para mostrar la lista de Fin a Inicio
      public void mostrarListaFinInicio(){
         if(!estaVacia()){
             String datos="<=>";
             NodoDoble auxiliar= fin;
             while(auxiliar!=null){
                 datos = datos + "["+auxiliar.dato+"]<=>";
                 auxiliar= auxiliar.anterior;
             }
             JOptionPane.showMessageDialog(null, datos,
                     "Mostrando Lista del fin al inicio",
                     JOptionPane.INFORMATION_MESSAGE);
         }
     }
      
      //Metodo para eliminar del inicio
    public char eliminarDelInicio(char elemento) {
        elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }

    public char eliminarDelFinal(char elemento) {
        elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }
}
