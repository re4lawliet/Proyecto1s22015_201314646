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
public class NodoChofer {
    
    public int ingreso;//es la clave o ID
        
    public String NombreChofer;
    public String ApellidoChofer;
    public String Contraseña;
        
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
}
