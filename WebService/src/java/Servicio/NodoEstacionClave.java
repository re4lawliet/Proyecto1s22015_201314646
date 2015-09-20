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
public class NodoEstacionClave {
    public int ingreso;
        
    public String NombreEstacion;
    public String contraseña;
    
    public int NumeroDeUsuarios=0;
        
	int Fe;
        int Altura;
	NodoEstacionClave Derecho;
        NodoEstacionClave Izquierdo;
        
	NodoEstacionClave (int cod, String Nom, String nac){
		ingreso = cod;
		NombreEstacion= Nom;
		contraseña = nac;
		Fe = 0;
		NodoAdministrador Derecho=null;
		NodoAdministrador Izquierdo = null;
	}    
}
