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
public class ArbolAvlAdmin {
    
    public NodoAvlAdmin raizArbol;

public boolean esVacia(){
        
       return raizArbol==null; //si inicio es nulo retorna verdadero SIno Falso
    }

public void RotacionII(NodoAvlAdmin n, NodoAvlAdmin n1){
    
    n.izquierda=n1.Derecha;// el hijo de la izquierda = al de la Derecha
    n1.Derecha= n; // el hijo derecho es igual al izquierdo
    
    //Validar El Factor de Equilibrio
    if (n1.FE==-1){ //Si el nodo derecho tiene factor de equilibrio -1
        n.FE=0;//el derecho =0 
        n1.FE=0;//el izquierdo = 0
    }else{ //de lo Contrario
        n.FE=-1;//el izquierdo = -1
        n1.FE=1;//el derecho = 1
    }
    
    n=n1; //derecho = izquierdo
    
}    

public void RotacionDD(NodoAvlAdmin n, NodoAvlAdmin n1){
    
    n.Derecha=n1.izquierda;// el hijo de la izquierda = al de la Derecha
    n1.izquierda= n; // el hijo derecho es igual al izquierdo
    
    //Validar El Factor de Equilibrio
    if (n1.FE==1){ //Si el nodo derecho tiene factor de equilibrio -1
        n.FE=0;//el derecho =0 
        n1.FE=0;//el izquierdo = 0
    }else{ //de lo Contrario
        n.FE=1;//el izquierdo = -1
        n1.FE=-1;//el derecho = 1
    }
    
    n=n1; //derecho = izquierdo
}   

public void RotacionID(NodoAvlAdmin n, NodoAvlAdmin n1){
    
    NodoAvlAdmin n2;
    
    n2=n1.Derecha;
    n.izquierda=n2.Derecha;
    n2.Derecha=n;
    n1.Derecha=n2.izquierda;
    n2.izquierda=n1;
    
    if(n2.FE==1){
        n1.FE=-1;
    }else{
        n1.FE=0;
    }
    
    if (n2.FE==-1){
        n.FE=1;
    }else{
        n.FE=0;
    }
    
    n2.FE=0;
    n=n2;
}   

public void RotacionDI(NodoAvlAdmin n, NodoAvlAdmin n1){
    
    NodoAvlAdmin n2;
    
    n2=n1.izquierda;
    n.Derecha=n2.izquierda;
    n2.izquierda=n;
    n1.izquierda=n2.Derecha;
    n2.Derecha=n1;
    
    if(n2.FE==1){
        n.FE=-1;
    }else{
        n.FE=0;
    }
    
    if (n2.FE==-1){
        n1.FE=1;
    }else{
        n1.FE=0;
    }
    
    n2.FE=0;
    n=n2;
}   

public int altura (NodoAvlAdmin raiz){
    int retorno=-1;
    if(raiz!=null){
        retorno=0;
    }else{
        int izq=altura(raiz.izquierda); 
        int der=altura(raiz.Derecha);
        
        if (izq>der){
            retorno=izq+1;
        }else{
            retorno=der+1;
        }
        
    }
    
    return retorno;
}

public void InsertarAVL(NodoAvlAdmin raiz, int clave, String correo, String contraseña){
  
    if (raizArbol==null){
        
        raizArbol = new NodoAvlAdmin (clave,correo,contraseña) ;
        
    }else{
        if(raizArbol.clave>clave){//a la izquierda 
            if(raizArbol.izquierda==null){
              raizArbol.izquierda = new NodoAvlAdmin (clave,correo,contraseña);  
            }else{
             InsertarAVL(raizArbol.izquierda,clave,correo,contraseña);  
            }
        }else if(raizArbol.clave<clave){//a la Derecha
            if(raizArbol.Derecha==null){
                raizArbol.Derecha = new NodoAvlAdmin (clave,correo,contraseña); 
            }else{
                InsertarAVL(raizArbol.Derecha,clave,correo,contraseña); 
            }    
        }else{  //claves Iguales
            //no hace Nada Retorna Falso
        }
        
    }
    
    raizArbol.FE = (altura(raizArbol.Derecha)-altura(raizArbol.izquierda));
    if(raizArbol.FE==-2){
        if(raizArbol.izquierda.FE==1){
            RotacionID(raizArbol,raizArbol.izquierda);
        }else if (raizArbol.izquierda.FE==-1){
            RotacionII(raizArbol,raizArbol.izquierda);
        }
    }else if (raizArbol.FE==2){
        if(raizArbol.Derecha.FE==1){
            RotacionDD(raizArbol, raizArbol.Derecha);
        }else if (raizArbol.Derecha.FE==-1){
            RotacionDI(raizArbol,raizArbol.Derecha);
        }
    }
    
    //Fin Todo 
    //Retornar TRue
} 

public void Eliminar (NodoAvlAdmin raiz, int clave){
    
    if (raiz==null){
        // nada :v
        
    }else{
        if (clave < raizArbol.clave){//hacia la izquierda 
            Eliminar(raizArbol.izquierda,clave);
        }else if (clave > raizArbol.clave){
            Eliminar(raizArbol.Derecha,clave);
        }else{
            NodoAvlAdmin q;
            q=raizArbol;
            
            if (q.izquierda==null){
                raizArbol=q.Derecha;
            }else if(q.Derecha==null){
                raizArbol=q.izquierda;
            }else{
                //NAda
            }
        }
        
        
    }
        
}

public void Remplazar (NodoAvlAdmin n,NodoAvlAdmin act ){
//    if(act.Derecha){
//        Remplazar(n, act.Derecha);
//        //Equilibrar
//    }
//    else{
//        (*n)->clave=(*act)->clave;
//        (*n)=*act;
//        (*act)=(*act)->left;
//        (*act)->fe=1;
//    }
}

public void Modificar(NodoAvlAdmin raiz, int id, String correo, String contraseña){
    if (raizArbol==null){
       
    }else{
        if (raizArbol.clave>id) {
            Modificar(raizArbol.izquierda, id, correo, contraseña);
        }else if (raizArbol.clave<id){
            Modificar(raizArbol.Derecha, id, correo, contraseña);
        }else if(raizArbol.clave==id){

            raizArbol.IdAdmin=id;
            raizArbol.CorreoAdmin=correo;
            raizArbol.ContraseñaAdmin=contraseña; 
        }
    }
}

public NodoAvlAdmin Buscar(NodoAvlAdmin x, int id){
 if(raizArbol==null){
        return null;
    }else {
        if (raizArbol.clave== id) {
            return raizArbol;
        }else if (raizArbol.clave>id){
           return Buscar(raizArbol.izquierda, id);
        }else if(raizArbol.clave<id){
            return Buscar(raizArbol.Derecha, id);
        }
    }
    return null;   
}

public void Imprimir(NodoAvlAdmin raiz){
    if(raiz!=null){
        System.out.println("Clave:  "+raiz.clave);
        System.out.println("Altura: "+ raiz.FE);
        
        Imprimir(raiz.izquierda);
        Imprimir(raiz.Derecha);
    }
}

}
