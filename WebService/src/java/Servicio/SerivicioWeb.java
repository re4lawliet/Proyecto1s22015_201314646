/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    
    
    public ArbolAvlAdmin Arbol1=new ArbolAvlAdmin ();
    
    //INSTANCIA DE ARBOLES EN WEB SERVICE
    public ListaBuses Lista = new ListaBuses();
    public ArbolAdministradores arbol1 = new ArbolAdministradores ();
    public ArbolEstacionClave arbol2=new ArbolEstacionClave();
    public ArbolEstacionGeneral arbol3=new ArbolEstacionGeneral();
    public ArbolChoferes arbol4 = new ArbolChoferes();
    
    
    //-------------------------------------------------------
    public ArrayList <Ruta> ListaRutas= new ArrayList <> ();
    public ArrayList <String> NombreRutas= new ArrayList <> ();
    public ArrayList <Integer> NumeroPorEstacion= new ArrayList <> ();
    public ArrayList <Integer> NumeroPorEstacion2= new ArrayList <> ();
    public ArrayList <String> NumeroPorChofer= new ArrayList <> ();
    public ArrayList <NodoEstacionClave> NodoPorEstacionClave= new ArrayList <> ();
    public ArrayList <NodoEstacionGeneral> NodoPorEstacionGeneral= new ArrayList <> ();
    //______________________________________________________________________
    
    public String impresor="";
    public ArrayList <String> ListaAdmins= new ArrayList <> ();
    public ArrayList <String> ListaEstacionesClaveNombre= new ArrayList <> ();
    public ArrayList <String> ListaEstacionesGeneralesNombre= new ArrayList <> ();
    public boolean ValidarOperacion=false;//ESta ES PARA VER SI IMPRime solo nombres o imprime todo los datos del nodo
    public boolean ValidarOperacion2=false;
    public boolean ValidarOperacion3=false;
    public boolean ValidarOperacion4=false;
    public boolean ValidarOperacion5=false;//chofer
    public static int loginChofer;
    public static int loginEstacionClave;
    public static int loginEstacionGeneral;
   
    
    
    //-------------------------------csv------------------------------------}
    File f;
    FileReader lectorArchivo;
    FileWriter escritorArchivo;
    
    
    public SerivicioWeb(){
        arbol1.InsercionAutor( "fish", "123");
        arbol1.InsercionAutor( "carlos", "1234");
        arbol1.InsercionAutor( "josue", "12345");
        arbol1.InsercionAutor( "Juande", "contra");
        arbol1.InsercionAutor( "batres", "contra");
    }
    
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
        Lista.AgregarAlFinal(new bus(5));       
        
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
        
//        arbol1.InsercionAutor( "hola", "contra");
//        arbol1.InsercionAutor( "mundo", "contra");
//        arbol1.InsercionAutor( "francis", "contra");
//        arbol1.InsercionAutor( "asdf", "contra");
//        arbol1.InsercionAutor( "wilson", "contra");
        
        
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
            loginEstacionClave=id;
                    
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
            loginEstacionGeneral=id;
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
            loginChofer=id;
            }else{//de lo contrario o la contra esta mala o cualquierdato 
            validar=false;
            }
            
        }else{
            //no Existe
            validar=false;     
        }
        
        
        return validar;
    }

    
    //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI INICIAN ADmins-----------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ExisteAdmin")
    public boolean ExisteAdmin(@WebParam(name = "clave") String clave) {
        //TODO write your implementation code here:
        boolean validar=false;
        NodoAdministrador nodoObtenido=arbol1.BuscarPorCorreo(arbol1.A, clave);
        
        if(nodoObtenido.correo.equals(clave)){
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
        
        arbol1.InsercionAutor(correo, contraseña);
        
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

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    
    //:::::::::::::::::::::::::Modificar el Arbol Administradores::::::::::::::::::::

    /**
     * Web service operation
     * @param nodo
     */
    @WebMethod(operationName = "ModificarAdmin")
    public String ModificarAdmin(String correoBusqueda,String correoNuevo, String contra) {
        //TODO write your implementation code here:
        String validar="MSJ";
        
        if(arbol1!=null){  
            //Modifica
            validar=arbol1.ModificarArbol(arbol1.A, correoBusqueda, correoNuevo, contra);
        }else{
            //No Hay DATOS
            validar="No Hay DAtos";
        }
        
        return validar;
    }
    
    public String EliminarAdmin(String Correo){
        String mensaje="Elimino: "+Correo;
        
        if("...".equals(Correo)){
        mensaje="...";
        }else{
         arbol1.EliminarDelArbol(Correo);
        //arbol1.EquilibrarDespuesDeEliminar(arbol1.A, Correo);   
        }
        
        return mensaje;
    }
    
    
    //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI INICIAN Estaciones Clave------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
    
    
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
//------------IMPRIMIR Estaciones Clave--------------------
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ImprimirEstacionesClave")
    public void ImprimirEstacionesClave(NodoEstacionClave nodo) {
        //TODO write your implementation code here:
        String ad;
        String retorno;
        if ( nodo != null ){
            ImprimirEstacionesClave(nodo.Derecho);
            
            if(ValidarOperacion4==false){
            ad="["+ nodo.ingreso + "]"+"-----------"+nodo.NombreEstacion+"-----------"+nodo.contraseña+"||";
            }else{
            ad=""+nodo.ingreso;    
            }
            
            ListaAdmins.add(ad);
            
            ImprimirEstacionesClave(nodo.Izquierdo);
        }
            
        
    }
    
    
     @WebMethod(operationName = "ImprimirEstacionesClave2")
    public void ImprimirEstacionesClave2(NodoEstacionClave nodo) {
        //TODO write your implementation code here:
        String ad;
        String retorno;
        if ( nodo != null ){
            ImprimirEstacionesClave2(nodo.Derecho);
            
            if(ValidarOperacion3==false){
            ad="["+ nodo.ingreso + "]"+"-----------"+nodo.NombreEstacion+"-----------||";
            }else{
            ad=""+nodo.ingreso;    
            }
            
            ListaEstacionesClaveNombre.add(ad);
            ImprimirEstacionesClave2(nodo.Izquierdo);
        }
            
        
    }
    

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ImprimirEstacionClaveRetorno")
    public ArrayList ImprimirEstacionClaveRetorno() {
        //TODO write your implementation code here:
        ListaAdmins.clear();//limpia la anterior
        ImprimirEstacionesClave(arbol2.A);
        
        return ListaAdmins;
    }
    
        @WebMethod(operationName = "ImprimirEstacionClaveRetorno2")
    public ArrayList ImprimirEstacionClaveRetorno2() {
        //TODO write your implementation code here:
        ListaEstacionesClaveNombre.clear();//limpia la anterior
        ImprimirEstacionesClave2(arbol2.A);
        
        return ListaEstacionesClaveNombre;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEstacionClave")
    public String getEstacionClave(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
        ValidarOperacion4=false;
        String lol =ListaAdmins.get(iteracion);
        
       return lol;       
    }
    
        @WebMethod(operationName = "getEstacionClave2")
    public String getEstacionClave2(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
        ValidarOperacion3=false;
        String lol =ListaEstacionesClaveNombre.get(iteracion);
        
       return lol;       
    }
        /**
     * Web service operation
     */
    @WebMethod(operationName = "getEstacionClaveNombre")
    public String getEstacionClaveNombre(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
       ValidarOperacion4=true; 
       String lol =ListaAdmins.get(iteracion);         
       return lol;  
       
    }
        @WebMethod(operationName = "getEstacionClaveNombre2")
    public String getEstacionClaveNombre2(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
       ValidarOperacion3=true; 
       String lol =ListaEstacionesClaveNombre.get(iteracion);         
       return lol;  
       
    }
    
        public String EliminarEstacionClave(int Correo){
        String mensaje="Elimino: "+Correo;
        
        if("...".equals(Correo)){
        mensaje="...";
        }else{
         arbol2.EliminarDelArbol(Correo);
        //arbol1.EquilibrarDespuesDeEliminar(arbol1.A, Correo);   
        }
        
        return mensaje;
    }
//---------------------------------------------------------
  
    //::::::::::::::::::GRAFICAR ARBOL EstacionesClave ::::::::::::::::::::::::::::::::    
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraficarArbolEstacionClave")
    public boolean GraficarArbolEstacionesClave() {
    boolean validar=false;
        if(arbol2.A!=null){
    arbol2.GraficarNodos(arbol2.A);
    arbol2.GraficaLineasArbol1(arbol2.A);
    arbol2.EscribirArchivo1();
    arbol2.Graficar1();
        validar=true;
        }else{
        validar=false;    
        }
    
     return validar;   
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        //:::::::::::::::::::::::::Modificar el Arbol Estacion Clave::::::::::::::::::::

    /**
     * Web service operation
     * @param nodo
     */
    @WebMethod(operationName = "ModificarEstacionClave")
    public String ModificarEstacionClave(int correoBusqueda,String correoNuevo, String contra) {
        //TODO write your implementation code here:
        String validar="MSJ";
        
        if(arbol2!=null){  
            //Modifica
            validar=arbol2.ModificarArbol(arbol2.A, correoBusqueda, correoNuevo, contra);
        }else{
            //No Hay DATOS
            validar="No Hay DAtos";
        }
        
        return validar;
    }
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   
//:::::::::::::::::::::::::::::INSERTAR ARBOL ESTACION CLAVE::::::::::::::::::::::::::::::::
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ExisteEstacionClave")
    public boolean ExisteEstatcionClave(@WebParam(name = "clave") int clave) {
        //TODO write your implementation code here:
        boolean validar=false;
        NodoEstacionClave nodoObtenido=arbol2.BuscarPorDato(arbol2.A, clave);
        NodoEstacionGeneral nodo=arbol3.BuscarPorDato(arbol3.A, clave);
        
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
    @WebMethod(operationName = "InsertarEstacionClave")
    public String InsertarEstacionClave(@WebParam(name = "clave") int clave, @WebParam(name = "correo") String nombreEC, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        boolean validar=false;
        
        arbol2.InsercionAutor(clave, nombreEC, contraseña);
        
        return "Se Inserto id: "+clave+" Correo: "+nombreEC+" Con Exito: "+contraseña;
    }
   
    //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI INICIAN LAS GENERALES------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
    
    
    //------------IMPRIMIR Estaciones Generales--------------------
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ImprimirEstaGeneral")
    public void ImprimirEstacionGeneral(NodoEstacionGeneral nodo) {
        //TODO write your implementation code here:
        String ad;
        String retorno;
        if ( nodo != null ){
            ImprimirEstacionGeneral(nodo.Derecho);
            
            if(ValidarOperacion==false){
            ad="["+ nodo.ingreso + "]"+"-----------"+nodo.NombreEstacion+"-----------"+nodo.contraseña+"||";
            }else{
            ad=""+nodo.ingreso;    
            }
            
            ListaAdmins.add(ad);
            ImprimirEstacionGeneral(nodo.Izquierdo);
        }
              
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ImprimirEstaGeREtorno")
    public ArrayList ImprimirEstacionGeneralRetorno() {
        //TODO write your implementation code here:
        ListaAdmins.clear();//limpia la anterior
        ImprimirEstacionGeneral(arbol3.A);
        
        return ListaAdmins;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEstacionGeneral")
    public String getEstacionGeneral(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
        ValidarOperacion=false;
        String lol =ListaAdmins.get(iteracion);
        
       return lol;       
    }
        /**
     * Web service operation
     */
    @WebMethod(operationName = "getEstacionGeneralNombre")
    public String getEstacionGeneralNombre(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
       ValidarOperacion=true; 
       String lol =ListaAdmins.get(iteracion);         
       return lol;  
       
    }
    
    //..............Impresion Nombre Estacion General O las 2
        @WebMethod(operationName = "ImprimirEstaGeneral2")
    public void ImprimirEstacionGeneral2(NodoEstacionGeneral nodo) {
        //TODO write your implementation code here:
        String ad;
        String retorno;
        if ( nodo != null ){
            ImprimirEstacionGeneral2(nodo.Derecho);
            
            if(ValidarOperacion2==false){
            ad="["+ nodo.ingreso + "]"+"-----------"+nodo.NombreEstacion+"-----------+||";
            }else{
            ad=""+nodo.ingreso;    
            }
            
            ListaEstacionesGeneralesNombre.add(ad);
            ImprimirEstacionGeneral2(nodo.Izquierdo);
        }
              
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ImprimirEstaGeREtorno2")
    public ArrayList ImprimirEstacionGeneralRetorno2() {
        //TODO write your implementation code here:
        ListaEstacionesGeneralesNombre.clear();//limpia la anterior
        ImprimirEstacionGeneral2(arbol3.A);
        
        return ListaEstacionesGeneralesNombre;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEstacionGeneral2")
    public String getEstacionGeneral2(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
        ValidarOperacion2=false;
        String lol =ListaEstacionesGeneralesNombre.get(iteracion);
        
       return lol;       
    }
        /**
     * Web service operation
     */
    @WebMethod(operationName = "getEstacionGeneralNombre2")
    public String getEstacionGeneralNombre2(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
       ValidarOperacion2=true; 
       String lol =ListaEstacionesGeneralesNombre.get(iteracion);         
       return lol;  
       
    }
//---------------------------------------
        public String EliminarEstacionGeneral(int Correo){
        String mensaje="Elimino: "+Correo;
        
        if("...".equals(Correo)){
        mensaje="...";
        }else{
         arbol3.EliminarDelArbol(Correo);
        //arbol1.EquilibrarDespuesDeEliminar(arbol1.A, Correo);   
        }
        
        return mensaje;
    }
    
    
    //::::::::::::::::::GRAFICAR ARBOL EstacionesGeneral ::::::::::::::::::::::::::::::::    
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraficarArbolEstacionGeneral")
    public boolean GraficarArbolEstacionGeneral() {
    boolean validar=false;
        if(arbol3.A!=null){
    arbol3.GraficarNodos(arbol3.A);
    arbol3.GraficaLineasArbol1(arbol3.A);
    arbol3.EscribirArchivo1();
    arbol3.Graficar1();
        validar=true;
        }else{
        validar=false;    
        }
    
     return validar;   
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        //:::::::::::::::::::::::::Modificar el Arbol EstacionGeneral::::::::::::::::::::

    /**
     * Web service operation
     * @param correoBusqueda     */
    @WebMethod(operationName = "ModificarEstacionGeneral")
    public String ModificarEstacionGeneral(int correoBusqueda,String correoNuevo, String contra) {
        //TODO write your implementation code here:
        String validar="MSJ";
        
        if(arbol3!=null){  
            //Modifica
            validar=arbol3.ModificarArbol(arbol3.A, correoBusqueda, correoNuevo, contra);
        }else{
            //No Hay DATOS
            validar="No Hay DAtos";
        }
        
        return validar;
    }
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   
//:::::::::::::::::::::::::::::INSERTAR ARBOL ESTACION CLAVE::::::::::::::::::::::::::::::::
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ExisteEstacionGeneral")
    public boolean ExisteEstacionGeneral(@WebParam(name = "clave") int clave) {
        //TODO write your implementation code here:
        boolean validar=false;
        NodoEstacionGeneral nodoObtenido=arbol3.BuscarPorDato(arbol3.A, clave);
        
        NodoEstacionClave nodo=arbol2.BuscarPorDato(arbol2.A, clave);
        
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
    @WebMethod(operationName = "InsertarEstacionGeneral")
    public String InsertarEstacionGeneral(@WebParam(name = "clave") int clave, @WebParam(name = "correo") String nombreEC, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        boolean validar=false;
        
        arbol3.InsercionAutor(clave, nombreEC, contraseña);
        
        return "Se Inserto id: "+clave+" Correo: "+nombreEC+" Con Exito: "+contraseña;
    }
    

    //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI INICIAN Los Choferes------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
    
    
    //------------IMPRIMIR Estaciones Generales--------------------
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ImprimirChofer")
    public void ImprimirChofer(NodoChofer nodo) {
        //TODO write your implementation code here:
        String ad;
        String retorno;
        if ( nodo != null ){
            ImprimirChofer(nodo.Derecho);
            
            if(ValidarOperacion==false){
            ad="["+ nodo.ingreso + "]"+"-----------"+nodo.NombreChofer+"-----------"+nodo.ApellidoChofer+"-----------"+nodo.Contraseña+"||";
            }else{
            ad=""+nodo.ingreso;    
            }
            
            ListaAdmins.add(ad);
            ImprimirChofer(nodo.Izquierdo);
        }
              
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ImprimirChoferREtorno")
    public ArrayList ImprimirChoferRetorno() {
        //TODO write your implementation code here:
        ListaAdmins.clear();//limpia la anterior
        ImprimirChofer(arbol4.A);
        
        return ListaAdmins;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getChofer")
    public String getChofer(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
        ValidarOperacion=false;
        String lol =ListaAdmins.get(iteracion);
        
       return lol;       
    }
        /**
     * Web service operation
     */
    @WebMethod(operationName = "getChoferNombre")
    public String getChoferNombre(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
       ValidarOperacion=true; 
       String lol =ListaAdmins.get(iteracion);         
       return lol;  
       
    }
    
        @WebMethod(operationName = "ImprimirChofer2")
    public void ImprimirChofer2(NodoChofer nodo) {
        //TODO write your implementation code here:
        String ad;
        String retorno;
        if ( nodo != null ){
            ImprimirChofer2(nodo.Derecho);
            
            if(ValidarOperacion5==false){
            ad="["+ nodo.ingreso + "]"+"-----------"+nodo.NombreChofer+"--"+nodo.ApellidoChofer+"-----------||";
            }else{
            ad=""+nodo.ingreso;    
            }
            
            NumeroPorChofer.add(ad);
            ImprimirChofer2(nodo.Izquierdo);
        }
              
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ImprimirChoferREtorno2")
    public ArrayList ImprimirChoferRetorno2() {
        //TODO write your implementation code here:
        NumeroPorChofer.clear();//limpia la anterior
        ImprimirChofer2(arbol4.A);
        
        return NumeroPorChofer;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getChofer2")
    public String getChofer2(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
        ValidarOperacion5=false;
        String lol =NumeroPorChofer.get(iteracion);
        
       return lol;       
    }
        /**
     * Web service operation
     */
    @WebMethod(operationName = "getChoferNombre2")
    public String getChoferNombre2(@WebParam(name = "iteracion") int iteracion) {
        //TODO write your implementation code here:
       ValidarOperacion5=true; 
       String lol =NumeroPorChofer.get(iteracion);         
       return lol;  
       
    }
    
    
        public String EliminarChofer(int Correo){
        String mensaje="Elimino: "+Correo;
        
        if("...".equals(Correo)){
        mensaje="...";
        }else{
         arbol4.EliminarDelArbol(Correo);
        //arbol1.EquilibrarDespuesDeEliminar(arbol1.A, Correo);   
        }
        
        return mensaje;
    }
    
//---------------------------------------
    
    //::::::::::::::::::GRAFICAR ARBOL EstacionesGeneral ::::::::::::::::::::::::::::::::    
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraficarArbolChofer")
    public boolean GraficarArbolChofer() {
    boolean validar=false;
        if(arbol4.A!=null){
    arbol4.GraficarNodos(arbol4.A);
    arbol4.GraficaLineasArbol1(arbol4.A);
    arbol4.EscribirArchivo1();
    arbol4.Graficar1();
        validar=true;
        }else{
        validar=false;    
        }
    
     return validar;   
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        //:::::::::::::::::::::::::Modificar el Arbol EstacionGeneral::::::::::::::::::::

    /**
     * Web service operation
     * @param correoBusqueda     */
    @WebMethod(operationName = "ModificarChofer")
    public String ModificarChofer(int claveBusqueda,String NombreNuevo, String ApellidoNuevo, String ContraNueva) {
        //TODO write your implementation code here:
        String validar="MSJ";
        
        if(arbol4!=null){  
            //Modifica
            validar=arbol4.ModificarArbol(arbol4.A, claveBusqueda, NombreNuevo, ApellidoNuevo,ContraNueva);
        }else{
            //No Hay DATOS
            validar="No Hay DAtos";
        }
        
        return validar;
    }
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   
//:::::::::::::::::::::::::::::INSERTAR ARBOL ESTACION CLAVE::::::::::::::::::::::::::::::::
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ExisteChofer")
    public boolean ExisteChofer(@WebParam(name = "clave") int clave) {
        //TODO write your implementation code here:
        boolean validar=false;
        NodoChofer nodoObtenido=arbol4.BuscarPorDato(arbol4.A, clave);
        
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
    @WebMethod(operationName = "InsertarChofer")
    public String InsertarChofer(@WebParam(name = "clave") int clave, @WebParam(name = "correo") String nombrechofer,  String apellido, String contraseña) {
        //TODO write your implementation code here:
        boolean validar=false;
        
        arbol4.InsercionAutor(clave, nombrechofer, apellido, contraseña);
        
        return "Se Inserto id: "+clave+" Correo: "+nombrechofer+" "+apellido+" Con Exito: "+contraseña;
    }
    
    //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI BUSES------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
    
    
        /**
     * Web service operation
     * @param nombre
     * @return 
     */
    @WebMethod(operationName = "AgregarBus")
    public String AgregarBus(int id) {
        //TODO write your implementation code here:
        
        bus x ;
        Lista.AgregarAlFinal(new bus(id));       
        
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
    
     @WebMethod(operationName = "ExisteBus")
    public boolean ExisteBus(int id) {
        //Si el bus existe REtorna True De Lo Contrario False
         boolean validar=false;
        NodoBuses auxiliar=Lista.inicio;
        NodoBuses auxiliarFinal = null;
        boolean retorno = false;
        
         if (Lista.inicio!=null){ //si no esta vacia porlomenos tiene un nodo
             //crea nodoDoble auxiliar y apunta al final
            
                while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
           
                if (auxiliar.dato.id==id){
                    //auxiliarFinal=auxiliar;
                    retorno=true;
                }else{
//nada
                }
                
                auxiliar = auxiliar.siguiente; //auxiliar va a recorrer a anterior
            }
            
            
        }else {
            //JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
            retorno=false;
        }
                
      return retorno;
    }
     
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ImprimirListaBuses")
    public String ImprimirLista() {
        //TODO write your implementation code here:
        String validar="";
        
        
        if (!Lista.esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="";
            int contador=0;
            NodoBuses auxiliar=Lista.inicio; //crea nodoDoble auxiliar y apunta al inicio
           
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos+"-"+contador+")----"+"["+auxiliar.dato.id+"]---"+auxiliar.dato.nombre+"<br>"; //mostrar de esta forma
            auxiliar = auxiliar.siguiente; //auxiliar vaser = a auxiliar de siguiente
            contador++;
            }
            
            validar=datos;
           // JOptionPane.showMessageDialog(null, datos,"Mostrando De inicio a fin",JOptionPane.nombre.INFORMATION_MESSAGE);
        }else{
            validar="NO ESISTEN DATOS EN LISTA----------";
        }
        
        return validar;
    }
    
        @WebMethod(operationName = "ImprimirListaBusesParaAsignar")
    public String ImprimirListaBusesParaAsignar() {
        //TODO write your implementation code here:
        String validar="";
        
        
        if (!Lista.esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="";
            int contador=0;
            NodoBuses auxiliar=Lista.inicio; //crea nodoDoble auxiliar y apunta al inicio
           
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos+"<option value=\""+auxiliar.dato.id+"\">"+auxiliar.dato.nombre+"</option>"+"<br>"; //mostrar de esta forma
            auxiliar = auxiliar.siguiente; //auxiliar vaser = a auxiliar de siguiente
            contador++;
            }
            
            validar=datos;
           // JOptionPane.showMessageDialog(null, datos,"Mostrando De inicio a fin",JOptionPane.nombre.INFORMATION_MESSAGE);
        }else{
            validar="NO ESISTEN DATOS EN LISTA----------";
        }
        
        return validar;
    }
    
    
    //------------------Graficar Lista de Buses---------------------------------
    
    @WebMethod(operationName = "GraficarListaBuses")
    public boolean GraficarListaBuses() {
    boolean validar=false;
    
        if(Lista.inicio!=null){
    Lista.GraficarNodos(Lista.inicio);
    Lista.GraficaLista(Lista.inicio);
    Lista.EscribirArchivo1();
    Lista.Graficar1();
        validar=true;
        }else{
        validar=false;    
        }
    
     return validar;   
    }
    //---------------------------------------------------------------------------
    
    //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI Lista De Rutas-------------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CrearRuta")
    public void CrearRuta(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:       
        ListaRutas.add(new Ruta(nombre,NombreRutas,NumeroPorEstacion,NumeroPorEstacion2));     
        NombreRutas.clear();
        NumeroPorEstacion.clear();
        NumeroPorEstacion2.clear();
        NodoPorEstacionClave.clear();
        NodoPorEstacionGeneral.clear();
    }
    
    @WebMethod(operationName = "ExisteRuta")
     public boolean ExisteRuta(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        boolean retorno=false;
        int y=ListaRutas.size();
        if(ListaRutas.isEmpty()){
        for (int i=y-1; i>=0;i--){ 
          if(ListaRutas.get(i).nombre.equals(nombre)){
              retorno=true;
          }else{
              retorno=false;
          }  
        }   
        }else{
            retorno=false;
        }
        
        return retorno;   
        
    }
    
    
    @WebMethod(operationName = "AgregarNombreRuta")
     public void AgregarNombreRuta(@WebParam(name = "nombre") String nombre) {
       
     NombreRutas.add(nombre);
              
    }
    
    public void AgregarNumeroExtacion(@WebParam(name = "nombre") int n) {
       
     NumeroPorEstacion.add(n);
              
    }
    
     public void AgregarNumeroExtacion2(@WebParam(name = "nombre") int n) {
       
     NumeroPorEstacion2.add(n);
              
    }
    
     
    @WebMethod(operationName = "Imprimir Rutas")
     public void ImprimirRutas(@WebParam(name = "nombre") String nombre) {
           
}

    public int RetornarListaRutas() {
     return ListaRutas.size();      
}  
    
    public int RetornarListaDeNombresDeEstaciones(int i) {
     return ListaRutas.get(i).ListaEstaciones.size();      
}   
     
   public String RetornarNombresDeRutas(int i) {
       String retorno=ListaRutas.get(i).nombre;      
       return retorno;      
}    
    
      public String RetornarNombresDeRutasEstaciones(int i, int j) {
       String retorno=ListaRutas.get(i).ListaEstaciones.get(j);      
       return retorno;      
}    
    
    //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI ASIGANACIONES -------------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
      
       public String AsignacionDeBuses(int bus, String ruta, int chofer, String horainicio, String horafinal, String fecha) {
       String mensaje="";
           
       //Aqui Encuentra el chofer al que se le dara la Asignacion    
       String nombreChofer=arbol4.BuscarPorDato(arbol4.A, chofer).NombreChofer;
       int idChofer=arbol4.BuscarPorDato(arbol4.A, chofer).ingreso;    
           
       NodoBuses objetoBus = BuscarObjetoEnListaBuses(bus); //Buscar en Lista de Buses
       Ruta objetoRuta=BuscarObjetoEnListaRutas(ruta); //Buscar en Lista Rutas
       
       String x=objetoBus.dato.nombre;
       String y=objetoRuta.nombre;
       
       //crea el Objeto Asignacion
       Asignaciones as = new Asignaciones (objetoBus,objetoRuta,nombreChofer,idChofer,horainicio,horafinal,fecha);
       
      arbol4.BuscarPorDato(arbol4.A, chofer).ListaDeAsiganaciones.add(as);
      arbol4.BuscarPorDato(arbol4.A, chofer).AsignarBusEnUnDiaEspecifico(as); //Asigna La Asignacion en Un Dia Especifico
      
      //Poner Al Bus la asignacion
      
      Lista.BusquedaID(bus).dato.ListaDeAsiganaciones.add(new Asignaciones (objetoBus,objetoRuta,nombreChofer,idChofer,horainicio,horafinal,fecha));
      
      String mensaje2="mensajeVergueo";
      mensaje="Se Asigno al Chofer:"+nombreChofer+" La Asignacion Numero: "+arbol4.BuscarPorDato(arbol4.A, chofer).ListaDeAsiganaciones.get(0).id
              +"-El Bus: "+objetoBus.dato.nombre+"|"
              +"-La Ruta: "+objetoRuta.nombre+"|"
              +"-Hora Inicio: "+horainicio+"|"
              +"-Hora Fin: "+horafinal+"|"
              +"-Fecha: "+fecha+"|"
              +"Completado!!!!"
              ;
      
      return mensaje;        
}     
       
     public NodoBuses BuscarObjetoEnListaBuses (int idbus){
         bus b;
          //Si el bus existe REtorna True De Lo Contrario False
        NodoBuses auxiliar=Lista.inicio;
        NodoBuses auxiliarFinal = null;
        boolean retorno = false;
        
         if (Lista.inicio!=null){ //si no esta vacia porlomenos tiene un nodo
             //crea nodoDoble auxiliar y apunta al final
            
                while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
           
                if (auxiliar.dato.id==idbus){
                    auxiliarFinal=auxiliar;
                    retorno=true;
                }else{
//nada
                }
                
                auxiliar = auxiliar.siguiente; //auxiliar va a recorrer a anterior
            }
            
            
        }else {
            //JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
            retorno=false;
        }
         
         return auxiliarFinal;
     }  
     
     public Ruta BuscarObjetoEnListaRutas (String nombre){
        
        boolean retorno=false;
        Ruta temp = null;
        int y=ListaRutas.size();
        if(ListaRutas.isEmpty()){
         
        }else{
         for (int i=y-1; i>=0;i--){ 
          if(ListaRutas.get(i).nombre.equals(nombre)){
              temp=ListaRutas.get(i);
              retorno=true;
          }else{
              retorno=false;
          }  
        } 
        }
        
        return temp;  
         
     }
 
     
     //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI Archivo CSV -------------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
     
     //------------------LEECTURA --------------------------
    public String leerhoteles (String nombre){
   
try{
    f = new File(nombre);
    lectorArchivo = new FileReader(f);
    BufferedReader br = new BufferedReader(lectorArchivo);
    
String l="Archivo Leido y Asignado Cn Exito";
String aux="";//lee la linea 
String atributos[] = null;    
    aux=br.readLine();//mete en aux la primera linea
    while(aux!=null){
    atributos=aux.split(",");
    //instanciar hoteles desde q carga el archivo
    
    //l=l+":-"+atributos[0]+","+atributos[1]+"";
    
    int bus=Integer.parseInt(atributos[0]);
    String ruta=atributos[1]; 
    int chofer=Integer.parseInt(atributos[2]);
    String horainicio =atributos[3];
    String horafinal=atributos[4]; 
    String fecha=atributos[5];
    
    if (ValidacionesArchivo(bus,ruta,chofer,horainicio,horafinal,fecha)==true){
        
    String a=AsignacionDeBuses(bus,ruta,chofer,horainicio,horafinal,fecha);
        
    }else{
        l="Fin Proceso De Analisis";
    }
    
    //crearhotel.listahoteles.add(new hotel (atributos[0], atributos[1]));
    
    //-------------------------------------
    aux=br.readLine();
    
    }//si la auxiliar no es nulla      
    
    br.close();
    lectorArchivo.close();
    return l;//retorna la linea 

    
    
    
}catch(IOException e){
System.out.println("Error:"+e.getMessage());
}
return null;
    }
    
    
    
    public boolean ValidacionesArchivo(int bus, String ruta, int chofer, String horainicio, String horafinal, String fecha){
    boolean val=false;
    
    boolean v1 = ExisteBus(bus);//Verifica si hay bus
    boolean v2=ExisteRuta(ruta);//verivica si hay ruta
    boolean v3=ExisteChofer(chofer);//verifica si hay chofer
        
    if (v1==true && v2==true && v3==true){//si bus ruta y chofer existe
        val=true;
    }else if(v1==false && v2==false && v3==false){//si bus no existe y el chofer tampoco los Crea
        
        AgregarBus(bus);
        InsertarChofer(chofer,"Chofer","ApellidoChofer","chofer");
        val=true;
        
    }else{
        val=false;
    }
    
        return val;
    }
     
    //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------AQUI LO DE RESUMENes -------------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
     public String ResumenBus(@WebParam(name = "nombre") int id) {
        //TODO write your implementation code here:
        boolean validar=false;
        NodoBuses auxiliar=Lista.inicio;
        NodoBuses auxiliarFinal = null;
        boolean retorno = false;
        String Texto="";
        
         if (Lista.inicio!=null){ //si no esta vacia porlomenos tiene un nodo
             //crea nodoDoble auxiliar y apunta al final
            
                while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
           
                if (auxiliar.dato.id==id){
                    //auxiliarFinal=auxiliar;
                    Texto="Nombre: "+auxiliar.dato.nombre+"<br>"+
                          "ID: "+auxiliar.dato.id+"<br>"+
                          "**************************************<br>"
                          ;
                    
                    int a=auxiliar.dato.ListaDeAsiganaciones.size();
                    
                    for (int i=a-1; i>=0;i--){
                    String nombrechofer;
                    nombrechofer=auxiliar.dato.ListaDeAsiganaciones.get(i).NombreChofer;
                    String nombreruta;
                    nombreruta=auxiliar.dato.ListaDeAsiganaciones.get(i).NombreRuta;
                    String horaentrada;
                    horaentrada=auxiliar.dato.ListaDeAsiganaciones.get(i).HoraEntrada;
                    String horasalida;
                    horasalida=auxiliar.dato.ListaDeAsiganaciones.get(i).HoraSalida;
                    String fecha;
                    fecha=auxiliar.dato.ListaDeAsiganaciones.get(i).Fecha;
                    
                    Texto=Texto+
                          "NombreChofer: "+nombrechofer+"<br>"+
                          "NombreRuta: "+nombreruta+"<br>"+
                          "HorarioEntrada: "+horaentrada+"<br>"+
                          "HorarioSalida: "+horasalida+"<br>"+
                          "FechaAsignada: "+fecha+"<br>"+
                          "---------------------------------------<br>"  ;  
                    }
                    
                    retorno=true;
                }else{
//nada
                }
                
                auxiliar = auxiliar.siguiente; //auxiliar va a recorrer a anterior
            }
            
            
        }else {
            //JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
            retorno=false;
        }
                
      return Texto;
        
    }
    
    public String ResumenChofer(int id){
        String Texto="";
        NodoChofer nodoObtenido=arbol4.BuscarPorDato(arbol4.A, id);
        
        if(nodoObtenido.ingreso==id){
           
            Texto="Nombre: "+nodoObtenido.NombreChofer+"<br>"+
                  "Apellido: "+nodoObtenido.ApellidoChofer+"<br>"+
                  "ID: "+nodoObtenido.ingreso+"<br>"+
                  "Contraseña: "+nodoObtenido.Contraseña+"<br>"+
                  "*********************Asignaciones Totales*****************************<br>"
                  ;
            
            int a=nodoObtenido.ListaDeAsiganaciones.size();
                if(a!=0){   
                for (int i=a-1; i>=0;i--){
                    String busasignado;
                    busasignado="Bus_"+nodoObtenido.ListaDeAsiganaciones.get(i).IdBus;
                    String nombreruta;
                    nombreruta=nodoObtenido.ListaDeAsiganaciones.get(i).NombreRuta;
                    String horaentrada;
                    horaentrada=nodoObtenido.ListaDeAsiganaciones.get(i).HoraEntrada;
                    String horasalida;
                    horasalida=nodoObtenido.ListaDeAsiganaciones.get(i).HoraSalida;
                    String fecha;
                    fecha=nodoObtenido.ListaDeAsiganaciones.get(i).Fecha;  
                    
                   Texto=Texto+
                          "BusDesignado: "+busasignado+"<br>"+
                          "RutaDesignada: "+nombreruta+"<br>"+
                          "HorarioEntrada: "+horaentrada+"<br>"+
                          "HorarioSalida: "+horasalida+"<br>"+
                          "FechaAsignada: "+fecha+"<br>"+
                          "---------------------------------------------------------------<br>";                   
                }
                }
                
                Texto=Texto+         
                "+++++++++++++++++++++++++++ASIGNACIONES EN DIA ESPECIFICO´+++++++++++++++++++<br>";
                int b=nodoObtenido.ListaDia.size();
                
                if(b!=0){
                for (int i=b-1; i>=0;i--){
                    
                   String Fecha = nodoObtenido.ListaDia.get(i).Fecha;
                   Texto=Texto+
                           "Fecha: "+Fecha+" -ESTA ES DEL OBJETO DIA<br>"+
                           ":::::::::::::::::::::::::::::::::<br>"
                          ;
                   
                   int c = nodoObtenido.ListaDia.get(i).ListaDeBusesEnUnDia.size();
                   
                   if(c!=0){
                   for (int j=c-1; j>=0;j--){
                    String busasignado;
                    busasignado="Bus_"+nodoObtenido.ListaDia.get(i).ListaDeBusesEnUnDia.get(j).IdBus;
                    String nombreruta;
                    nombreruta=nodoObtenido.ListaDia.get(i).ListaDeBusesEnUnDia.get(j).NombreRuta;
                    String horaentrada;
                    horaentrada=nodoObtenido.ListaDia.get(i).ListaDeBusesEnUnDia.get(j).HoraEntrada;
                    String horasalida;
                    horasalida=nodoObtenido.ListaDia.get(i).ListaDeBusesEnUnDia.get(j).HoraSalida;
                    Texto=Texto+
                          "BusDesignado: "+busasignado+"<br>"+
                          "RutaDesignada: "+nombreruta+"<br>"+
                          "HorarioEntrada: "+horaentrada+"<br>"+
                          "HorarioSalida: "+horasalida+"<br>"+
                          "======================================================<br>";
                   }
                   }       
                                      
                }
                }
            
        }else{
            //nada :v REtorna nada
        }
        
        return Texto;
    }
    
        //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------OTRAS GRAFICAS -------------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
    public boolean GraficarListaDeBusesAunChofer (int id){
        boolean val =false;
        
        if (arbol4.A!=null){
            val=true;
            arbol4.Nodos2(id);
            arbol4.Enlaces(id);
            arbol4.EscribirArchivoBuses();
            arbol4.GraficarArchivoBuses();
            
            
        }else{
            val=false;
        }
        
        
        return val;
    }
    
            //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------OTRAS Chivas -------------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
    public int ChoferLogeado(){
        int x=loginChofer;   
        return x;
        
    }
    
    public void getEstacionClaveNodo(int id){ 
        
        NodoEstacionClave lo = arbol2.BuscarPorDato(arbol2.A, id);
        
     NodoPorEstacionClave.add(lo);      
    }
    
    public void getEstacionGeneralNodo(int id){       
     NodoPorEstacionGeneral.add(arbol3.BuscarPorDato(arbol3.A, id));      
    }
    
         public String BuscarRuta(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
             String cadena ="hola Wroskiano <br><br><br>"+
                     "********************************************************************************<br>"
                     + " <form name=\"boton2\" action=\"MoverBuses.jsp\" method=\"POST\"> ";
             
        //boolean retorno=false;
        int y1=ListaRutas.size();
        if(!ListaRutas.isEmpty()){
        for (int i=y1-1; i>=0;i--){ 
          if(ListaRutas.get(i).nombre.equals(nombre)){
              
              int a=ListaRutas.get(i).ListaNumeroDeEstaciones.size();//----------------MAlFormer Exprecion
              if(a!=0){
                  for(int j=a-1; j>=0;j--){
                  int busk=ListaRutas.get(i).ListaNumeroDeEstaciones.get(j);
                  cadena =cadena +
                          "Estacion Clave: "+arbol2.BuscarPorDato(arbol2.A, busk).NombreEstacion+"<br>"+
                          "<input type=\"submit\" value=\"siguiente\" /><br>"+
                          "*****************************************************************************<br>";
                  }
              }
              
              int b=ListaRutas.get(i).ListaNumeroDeEstaciones2.size();
              if(b!=0){
                  for(int j=a-1; j>=0;j--){
                       int busk=ListaRutas.get(i).ListaNumeroDeEstaciones2.get(j);
                  cadena =cadena +
                          "Estacion General: "+arbol3.BuscarPorDato(arbol3.A, busk).NombreEstacion+"<br>"+
                           "<input type=\"submit\" value=\"siguiente\" /><br>"+
                          "*****************************************************************************<br>";
                  }
              }
              
              
              //retorno=true;
          }else{
              //retorno=false;
          }  
        }   
        }else{
            //retorno=false;
        }
        
        cadena =cadena+"</form>";
        return cadena;   
        
    }
         
     //,!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
    //-----------------------OTRAS EstacionClave PAGINA -------------------------------------
    //ññññ1111111111111111111111111111111111111111111111111111111111llllllllllllllllll
    
}