/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carlosmonterroso
 */
@WebService(serviceName = "SerivicioWeb")
public class SerivicioWeb {
    
    public ListaDobleBuses Lista = new ListaDobleBuses ();
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Volumen")
    public int Volumen(@WebParam(name = "radio") int radio) {
        return radio*5;
    }

    /**
     * Web service operation
     * @param nombre
     * @return 
     */
    @WebMethod(operationName = "Agregar")
    public String Agregar() {
        //TODO write your implementation code here:
        
        bus x ;
        Lista.AgregarAlFinal(new bus());       
        
        String Concat="";
  String datos="<-a-s->";
                if (!Lista.esVacia()){ //si no esta vacia porlomenos tiene un nodo
            
            NodoDobleBuses auxiliar=Lista.inicio; //crea nodoDoble auxiliar y apunta al inicio
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            String lol = auxiliar.dato.nombre;
            int lol2=auxiliar.dato.id;
            auxiliar = auxiliar.siguiente; //auxiliar vaser = a auxiliar de siguiente
            
             }
            
        }else {
             System.out.println("VACIO");
         }
        
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Borrar")
    public String Borrar(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        
        NodoDobleBuses x =Lista.Busqueda(nombre);
        
        Lista.EliminarBicho(x);
        
        return x.dato.id+"";
    }


    
    
}
