/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author carlos
 */
public class ListaBusesEnlazada {
    NodoBuses inicio;
    int size;
    
    public ListaBusesEnlazada (){
inicio=null;
size=0;
}
    
//insertar
 public void add(bus obj){
       NodoBuses nuevo=new NodoBuses(obj);
       nuevo.siguiente=inicio;
       inicio=nuevo;
       size++;
   }
 //tamaño
  public int size(){
            
                int j=0;
                NodoBuses i;
                i=inicio;
                while(i!=null){
                    j++;
                    i=i.siguiente;
                }
                
        return j;
        }
   //obtener
   public bus get(int posicion){
            NodoBuses ini;
            ini=inicio;
            bus datos = null;
            int j=-1;
            if(posicion<size()){
                while(ini!=null && posicion>j){
                    datos=ini.dato;
                    ini=ini.siguiente;
                    j++;
                }
            }
                
            return datos;  

        }
    
   
   public void asignar(int posicion,bus num){
            NodoBuses ini;
            ini=inicio;
            int j=-1;
            if(posicion<size()){
                while(ini!=null){
                    j++;
                    if(posicion==j){
                    ini.dato=num;
                    }
                    ini=ini.siguiente;
                    
                }
            }
                
            

        }

   public boolean isEmpty() {

    return (size == 0);
  }
}
