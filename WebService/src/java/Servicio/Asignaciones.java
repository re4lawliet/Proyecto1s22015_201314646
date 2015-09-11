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
public class Asignaciones {
    
    //Objetos ............. 
    public NodoBuses ObjetoBus;
    public Ruta ObjetoRuta;
    //Valores String............
    public String NombreBus;
    public String NombreRuta;
    public String NombreChofer;
    
    //--
    public int IdBus;
    public int IdChofer;
    
    String HoraEntrada;
    String HoraSalida;       
    String Fecha;
    
    
    int id;
    public static int contador=0;
    //.....................
    public Asignaciones(NodoBuses o, Ruta r, String nombrechofer, int idchofer, String horaE,String HoraS, String fecha){
    id=contador;
    contador++;
    
    this.ObjetoBus=o;
    this.ObjetoRuta=r;
    this.NombreChofer=nombrechofer;
    this.IdChofer=idchofer;
    this.HoraEntrada=horaE;
    this.HoraSalida=HoraS;
    this.Fecha=fecha;
    
    this.IdBus=o.dato.id;
    this.NombreRuta=r.nombre;
       
    }
    
    public Asignaciones(){
        this.Fecha="Mierda";
    }
    
}
