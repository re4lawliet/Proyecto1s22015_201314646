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
public class NodoAdministrador {
    public int ingreso;
        
    public String correo;
    public String contraseña;
        
	int Fe;
        int Altura;
	NodoAdministrador Derecho;
        NodoAdministrador Izquierdo;
        
	NodoAdministrador (int cod, String Nom, String nac){
		ingreso = cod;
		correo= Nom;
		contraseña = nac;
		Fe = 0;
		NodoAdministrador Derecho=null;
		NodoAdministrador Izquierdo = null;
	}    
}
