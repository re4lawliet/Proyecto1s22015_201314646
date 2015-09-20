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
public class NodoChofer {
    
    public int ingreso;//es la clave o ID
        
    public String NombreChofer;
    public String ApellidoChofer;
    public String Contraseña;
    
     public ArrayList <Asignaciones> ListaDeAsiganaciones= new ArrayList <> ();
     
     public ArrayList <Dia> ListaDia= new ArrayList <> ();
        
        
	int Fe;
        int Altura;
	NodoChofer Derecho;
        NodoChofer Izquierdo;
        
	NodoChofer (int cod, String Nom, String nac, String Contraseña){
		ingreso = cod;
		NombreChofer= Nom;
		ApellidoChofer = nac;
                this.Contraseña=Contraseña;
		Fe = 0;
		NodoAdministrador Derecho=null;
		NodoAdministrador Izquierdo = null;
	}  
        
        
        public void AsignarBusEnUnDiaEspecifico(Asignaciones a){
        
        int y=ListaDia.size();
        
        if(ListaDia.isEmpty()){//si la lista de Dias Esta Vacia
        Dia o=new Dia(a); 
        ListaDia.add(o);    
        }else{//si ESta LLENA CON AS DE ALGUN DIA
        
        for (int i=y-1; i>=0;i--){//RECORRE LA LISTA DE DIAS
            
            if(ListaDia.get(i).Fecha.equals(a.Fecha)){//si la fecha de la lista de Dias=al objeto q entra:::
               ListaDia.get(i).ListaDeBusesEnUnDia.add(a);                
            }else{//Sino Existe La Fecha Tonces Crearla
                Dia o1=new Dia(a);
                ListaDia.add(o1);
            }        
            
        }          
        }
                
        
        
        }
        
}
