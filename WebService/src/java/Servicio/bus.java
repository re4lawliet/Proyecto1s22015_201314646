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
//OBJETO SERA DE TIPO BUS
public class bus {
    public String nombre;
    public int id;
    
    
    public ArrayList <Asignaciones> ListaDeAsiganaciones= new ArrayList <> ();
    
    public static int contador=0;
    
    public bus(int id){
        this.id = id;
        this.nombre="Bus_"+id;
        contador = contador+1;
             
    }
    
    
}
