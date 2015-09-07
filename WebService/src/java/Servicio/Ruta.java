/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Ruta {
    public String nombre;
    
    public ArrayList <String> ListaEstaciones=new ArrayList();
    
    public ArrayList <String> ListaNumeroDeEstaciones=new ArrayList();
    
    public int id;
    public static int contador=0;
    
    public Ruta(String nombre,ArrayList <String> x,ArrayList <Integer> x1){
        this.id=contador;
        contador++;
        
        int y=x.size();
        for (int j=y-1; j>=0;j--){
            this.ListaEstaciones.add(x.get(j));
            //this.ListaEstaciones.add("holaXD"+j);
        }
        int y1=x1.size();
        for (int i=y1-1; i>=0;i--){
            this.ListaNumeroDeEstaciones.add(x.get(i));
            //this.ListaEstaciones.add("holaXD"+j);
        }
        
        
        this.nombre=nombre;    
    }
    
    public void AgregarEstacion(String ruta){
        
        ListaEstaciones.add(ruta);
        
    }
    
    
}
