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
    
    public ArrayList <Integer> ListaNumeroDeEstaciones=new ArrayList();
    public ArrayList  <Integer> ListaNumeroDeEstaciones2=new ArrayList();
    
    public ArrayList <NodoEstacionClave> ListaEstacionesClave=new ArrayList();
    public ArrayList <NodoEstacionGeneral> ListaEstacionesGenerales=new ArrayList();
    
    public int id;
    public static int contador=0;
    
    public Ruta(String nombre,ArrayList <String> x,ArrayList <Integer> x1, ArrayList <Integer> x11){
        this.id=contador;
        contador++;
        
//        this.ListaEstacionesClave=x2;
//        this.ListaEstacionesGenerales=x3;
        
        int y=x.size();
        for (int j=y-1; j>=0;j--){
            this.ListaEstaciones.add(x.get(j));
            //this.ListaEstaciones.add("holaXD"+j);
        }
        int y1=x1.size();
        for (int i=y1-1; i>=0;i--){
            this.ListaNumeroDeEstaciones.add(x1.get(i)); //modifique x.get/(i)
            //this.ListaEstaciones.add("holaXD"+j);
        }
        int y11=x11.size();
        for (int i=y11-1; i>=0;i--){
            this.ListaNumeroDeEstaciones2.add(x11.get(i));
            //this.ListaEstaciones.add("holaXD"+j);
        }
        
//          this.ListaNumeroDeEstaciones=x1;
//          this.ListaNumeroDeEstaciones2=x11;
          
//        int y2=x2.size();
//        for (int i=y2-1; i>=0;i--){
//            this.ListaEstacionesClave.add(x2.get(i));
//            //this.ListaEstaciones.add("holaXD"+j);
//        }
//        
//        int y3=x3.size();
//        for (int i=y3-1; i>=0;i--){
//            this.ListaEstacionesGenerales.add(x3.get(i));
//            //this.ListaEstaciones.add("holaXD"+j);
//        }
        
        
        this.nombre=nombre;    
    }
    
    public void AgregarEstacion(String ruta){
        
        ListaEstaciones.add(ruta);
        
    }
    
    
}
