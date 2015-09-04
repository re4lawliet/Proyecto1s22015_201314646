
package Servicio;

/**
 *
 * @author carlos
 */
public class NodoAvlAdmin {
    
    public int clave; //El Factor Que Entra 
    public int FE; //Factor De Equilibrio del Nodo
    
    NodoAvlAdmin izquierda; //Apuntador ala izquierda
    NodoAvlAdmin Derecha;  //Apuntador ala Derecha
    
    //Atributos del Administrador----------------------------------------------|
    
    public String CorreoAdmin;
    public String ContraseñaAdmin;
    public int IdAdmin;
    
    public static int contador=0;
    //constructor con parametros (la clave, Lo q le Quiera ingresar)
    public NodoAvlAdmin(int c, String cor, String contra){
    //setea la ID del Admin---------------------------------------------------
    this.IdAdmin = contador;    
    contador ++;
    //-------------------------------------------------------------------------
    
    this.clave=c;// clave la que recive en el Constructor
    this.FE = 0 ;// Factor de Equilibrio al Crear el nodo Es = 0;  
    this.CorreoAdmin=cor;
    this.ContraseñaAdmin=contra;
    
    //inicializa los Punteros como nullos 
    this.Derecha = null;
    this.izquierda=null;
    
    }
    
    
}
