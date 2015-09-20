/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;

/**
 *
 * @author carlosmonterroso
 */
public class NodoBuses {
    
    bus dato; //objeto q resive la lista
    NodoBuses siguiente; //puntero Siguiente
    NodoBuses anterior;  //puntero anterior
    
    
    
    //Constructor cuando no hay ningun nodo
    
    public NodoBuses (bus o){
    this.dato=o;
    this.siguiente=null;
    //llamar al otro constructor
    //this(o,null,null);
    
    }
    
    
    //Constructor cuando ya hay nodos
    public NodoBuses (bus o, NodoBuses s, NodoBuses a){
    
        dato=o;//dato es el bus
        siguiente=s;// punteros siguiente enviados 
        anterior=a; // puntero anterior enviados 
}
    
    
}