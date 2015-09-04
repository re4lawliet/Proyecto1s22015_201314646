/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carlosmonterroso
 */
@WebService(serviceName = "SerivicioWeb")
public class SerivicioWeb {
    
    public ListaBuses Lista = new ListaBuses ();
    public ArbolAvlAdmin Arbol1=new ArbolAvlAdmin ();
    
    //INSTANCIA DE ARBOLES EN WEB SERVICE
    public ArbolAdministradores arbol1 = new ArbolAdministradores ();
    public ArbolEstacionClave arbol2=new ArbolEstacionClave();
    public ArbolEstacionGeneral arbol3=new ArbolEstacionGeneral();
    public ArbolChoferes arbol4 = new ArbolChoferes();
    //______________________________________________________________________
    
    public String impresor="";
    public ArrayList <String> ListaAdmins= new ArrayList <> ();
    public boolean ValidarOperacion=false;//ESta ES PARA VER SI IMPRime solo nombres o imprime todo los datos del nodo
    
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
            
            NodoBuses auxiliar=Lista.inicio; //crea nodoDoble auxiliar y apunta al inicio
            
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
        
        NodoBuses x =Lista.Busqueda(nombre);
        
        Lista.EliminarBicho(x);
        
        return x.dato.id+"";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarAvlAdmin")
    public void AgregarAvlAdmin(@WebParam(name = "parameter") int parameter) {
        //TODO write your implementation code here:
        
        Arbol1.InsertarAVL(Arbol1.raizArbol, parameter, "correo", "contra");
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ImprimirAvlAdmin")
    public void ImprimirAvlAdmin() {
        //TODO write your implementation code here:
    Arbol1.Imprimir(Arbol1.raizArbol);
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LogearAdmin")
    public boolean LogearAdmin(@WebParam(name = "correo") String correo, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        arbol1.InsercionAutor(14, "fish", "123");
        arbol1.InsercionAutor(6, "carlos", "1234");
        arbol1.InsercionAutor(24, "josue", "12345");
        arbol1.InsercionAutor(35, "correo", "contra");
        arbol1.InsercionAutor(59, "correo", "contra");
        
        boolean validar=false;//si es verdadero Logear Sino Contra O correo Malo
        NodoAdministrador nodoObtenido=arbol1.BuscarPorCorreo(arbol1.A, correo);
        if(nodoObtenido.ingreso!=-555){
            //Existe
            //y si Existe el correo y la contra tienen q ser iguales a las del nodo obtenido en la busqueda
            if(nodoObtenido.correo.equals(correo) && nodoObtenido.contraseña.equals(contraseña)){
            validar=true;    
            }else{//de lo contrario o la contra esta mala
            validar=false;
            }
            
        }else{
            //no Existe
            validar=false;     
        }
        
        
        return validar;
    }

    /**
     * Web service operation
     * @param id
     * @param nombreEstacion
     */
    @WebMethod(operationName = "LogearEstaciones")
    public boolean LogearEstacionesClaves(@WebParam(name = "id") int id, @WebParam(name = "nombreEstacion") String nombreEstacion, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        
        arbol2.InsercionAutor(14, "estacion1", "123");
        arbol2.InsercionAutor(6, "estacion2", "1234");
        arbol2.InsercionAutor(24, "estacion3", "12345");
        arbol2.InsercionAutor(35, "estacion4", "contra");
        arbol2.InsercionAutor(59, "estacion5", "contra");
        
   
        boolean validar=false;//si es verdadero Logear Sino Contra O correo Malo
        NodoEstacionClave nodoObtenido=arbol2.BuscarPorDato(arbol2.A, id);
        if(nodoObtenido.ingreso!=-555){
            //Existe
            //y si Existe el correo y la contra tienen q ser iguales a las del nodo obtenido en la busqueda
            if(nodoObtenido.contraseña.equals(contraseña) && nodoObtenido.ingreso==id &&nodoObtenido.NombreEstacion.equals(nombreEstacion) ){
            validar=true;    
            }else{//de lo contrario o la contra esta mala o cualquierdato 
            validar=false;
            }
            
        }else{
            //no Existe
            validar=false;     
        }
        
        
        return validar;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LogearEstacionesGenerales")
    public boolean LogearEstacionesGenerales(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "contra") String contra) {
        //TODO write your implementation code here:
        arbol3.InsercionAutor(20, "esta1", "123");
        arbol3.InsercionAutor(22, "esta2", "1234");
        arbol3.InsercionAutor(19, "esta3", "12345");
        arbol3.InsercionAutor(35, "esta4", "contra");
        arbol3.InsercionAutor(59, "esta5", "contra");
        
        boolean validar=false;//si es verdadero Logear Sino Contra O correo Malo
        NodoEstacionGeneral nodoObtenido=arbol3.BuscarPorDato(arbol3.A, id);
        if(nodoObtenido.ingreso!=-555){
            //Existe
            //y si Existe el correo y la contra tienen q ser iguales a las del nodo obtenido en la busqueda
            if(nodoObtenido.contraseña.equals(contra) && nodoObtenido.ingreso==id &&nodoObtenido.NombreEstacion.equals(nombre) ){
            validar=true;    
            }else{//de lo contrario o la contra esta mala o cualquierdato 
            validar=false;
            }
            
        }else{
            //no Existe
            validar=false;     
        }
        
        
        return validar;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LogearChofer")
    public boolean LogearChofer(@WebParam(name = "id") int id, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        arbol4.InsercionAutor(14, "chofer","apellido1", "123");
        arbol4.InsercionAutor(6, "chofer1","apellido2",  "123");
        arbol4.InsercionAutor(24, "chofer2","apellido3",  "12345");
        arbol4.InsercionAutor(35, "chofer3","apellido4",  "contra");
        arbol4.InsercionAutor(59, "chofer4", "apellido5", "contra");
        
        boolean validar=false;//si es verdadero Logear Sino Contra O correo Malo
        NodoChofer nodoObtenido=arbol4.BuscarPorDato(arbol4.A, id);
        if(nodoObtenido.ingreso!=-555){
            //Existe
            //y si Existe el correo y la contra tienen q ser iguales a las del nodo obtenido en la busqueda
            if(nodoObtenido.ingreso==id && nodoObtenido.Contraseña.equals(contraseña) ){
            validar=true;    
            }else{//de lo contrario o la contra esta mala o cualquierdato 
            validar=false;
            }
            
        }else{
            //no Existe
            validar=false;     
        }
        
        
        return validar;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ExisteAdmin")
    public boolean ExisteAdmin(@WebParam(name = "clave") int clave) {
        //TODO write your implementation code here:
        boolean validar=false;
        NodoAdministrador nodoObtenido=arbol1.BuscarPorDato(arbol1.A, clave);
        
        if(nodoObtenido.ingreso==clave){
        validar=true;    
        }else{
        validar=false;    
        }
        
        return validar;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertarAdmin")
    public String InsertarAdmin(@WebParam(name = "clave") int clave, @WebParam(name = "correo") String correo, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        boolean validar=false;
        
        arbol1.InsercionAutor(clave, correo, contraseña);
        
        return "Se Inserto id: "+clave+" Correo: "+correo+" Con Exito: "+contraseña;
    }

    //------------IMPRIMIR ADMINISTRADORES--------------------
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ImprimirAdmins")
    public void ImprimirAdmins(NodoAdministrador nodo) {
        //TODO write your implementation code here:
        String ad;
        String retorno;
        if ( nodo != null ){
            ImprimirAdmins(nodo.Derecho);
            
            if(ValidarOperacion==false){
            ad="["+ nodo.ingreso + "]"+"-----------"+nodo.correo+"-----------"+nodo.contraseña+"||";
            }else{
            ad=nodo.correo;    
            }
            
            ListaAdmins.add(ad);
            ImprimirAdmins(nodo.Izquierdo);
        }
        
        
        
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ImprimirAdminRetorno")
    public ArrayList ImprimirAdminRetorno() {
        //TODO write your implementation code here:
        ListaAdmins.clear();//limpia la anterior
        ImprimirAdmins(arbol1.A);
        
        return ListaAdmins;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAdmin")
    public String getAdmin(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
        ValidarOperacion=false;
        String lol =ListaAdmins.get(iteracion);
        
       return lol;       
    }
        /**
     * Web service operation
     */
    @WebMethod(operationName = "getAdminNombre")
    public String getAdminNombre(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
       ValidarOperacion=true; 
       String lol =ListaAdmins.get(iteracion);         
       return lol;  
       
    }
//---------------------------------------------------------

    
//::::::::::::::::::GRAFICAR ARBOL ADMINISTRADOR ::::::::::::::::::::::::::::::::    
    


//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraficarArbolAdministrador")
    public boolean GraficarArbolAdministrador() {
    boolean validar=false;
        if(arbol1.A!=null){
    arbol1.GraficarNodos(arbol1.A);
    arbol1.GraficaLineasArbol1(arbol1.A);
    arbol1.EscribirArchivo1();
    arbol1.Graficar1();
        validar=true;
        }else{
        validar=false;    
        }
    
     return validar;   
    }

    

    
    
}
