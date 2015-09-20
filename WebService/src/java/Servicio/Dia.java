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
public class Dia {
    String Fecha;
    
    public ArrayList <Asignaciones> ListaDeBusesEnUnDia= new ArrayList <> ();
    
    public Dia (Asignaciones a){    
        this.Fecha=a.Fecha;
    }
    
    
    
}
