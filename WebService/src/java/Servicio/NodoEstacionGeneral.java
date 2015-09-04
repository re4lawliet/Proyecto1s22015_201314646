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
public class NodoEstacionGeneral {
    
    public int ingreso;
        
    public String NombreEstacion;
    public String contraseña;
        
	int Fe;
        int Altura;
	NodoEstacionGeneral Derecho;
        NodoEstacionGeneral Izquierdo;
        
	NodoEstacionGeneral (int cod, String Nom, String nac){
		ingreso = cod;
		NombreEstacion= Nom;
		contraseña = nac;
		Fe = 0;
		NodoEstacionGeneral Derecho=null;
		NodoEstacionGeneral Izquierdo = null;
	} 
    
}
