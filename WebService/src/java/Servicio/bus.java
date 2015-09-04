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
//OBJETO SERA DE TIPO BUS
public class bus {
    public String nombre;
    public int id;
    
    public static int contador=0;
    
    public bus(){
        this.id = contador;
        this.nombre="Bus_"+contador;
        contador = contador+1;
             
    }
    
    
}
