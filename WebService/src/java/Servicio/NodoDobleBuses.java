/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author carlosmonterroso
 */
public class NodoDobleBuses {
    
    bus dato; //objeto q resive la lista
    NodoDobleBuses siguiente; //puntero Siguiente
    NodoDobleBuses anterior;  //puntero anterior
    
    
    
    //Constructor cuando no hay ningun nodo
    
    public NodoDobleBuses (bus o){
    
    //llamar al otro constructor
    this(o,null,null);
    
    }
    
    
    //Constructor cuando ya hay nodos
    public NodoDobleBuses (bus o, NodoDobleBuses s, NodoDobleBuses a){
    
        dato=o;//dato es el bus
        siguiente=s;// punteros siguiente enviados 
        anterior=a; // puntero anterior enviados 
}
    
    
}