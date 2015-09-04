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
public class ArbolEstacionClave {
  String impresor="";
  String rotaciones="";
  private boolean boleano=false;      
        
	public NodoEstacionClave A;
        public NodoEstacionClave Busqueda=null;
        public NodoEstacionClave EncontradoParaModificar=null;
                
	boolean Hh;
    //Inserta un elemento en el arbol
	public void InsercionAutor (int Codau, String Nombre , String naci){
		if ((!Miembro(Codau,A))){
		NodoEstacionClave info = new NodoEstacionClave(Codau,Nombre,naci);
		A=InsertarBalanceado(A,info);
                System.out.println("Se inserto autor "+ info.ingreso);
		}
		else
		System.out.println("Error autor repetido");
	}
        
        NodoEstacionClave InsertarBalanceado(NodoEstacionClave R, NodoEstacionClave Nodo){
            
            NodoEstacionClave N1;
            NodoEstacionClave info=Nodo;
            
            if (ArbolVacio(R)){
			R= info;
			System.out.println("Se inserto autor "+ info.ingreso);
			Hh=true;
		}else{
                
                     if (Nodo.ingreso < R.ingreso){
                         R.Izquierdo=InsertarBalanceado(R.Izquierdo,Nodo);
                         if (Hh){
                                System.out.println("FE Antes Switch Izquierda:-|"+R.Fe);
                                switch(R.Fe){
                                    
				case 1:
				R.Fe= 0;
                                System.out.println("FE:-|"+R.Fe);
			        Hh=false;	
				break;
				case 0:
                                System.out.println("FE:-|"+R.Fe);
				R.Fe= -1; 
				break;
                                //se reestructura ya que pasaria a valer-2 y se desequilibra a la izq
			        case -1:
                                System.out.println("FE case rotar:-|"+R.Fe);    
                                N1=R.Izquierdo;
				if (N1.Fe== -1){   
                                System.out.println("FE Antes Rotar:-|"+R.Fe);    
                                rotaciones=rotaciones+"Rotacion Izquierda Izquierda\nArgumentos: "+ R.ingreso +" " +R.NombreEstacion+" y " + N1.contraseña+"\n"+"-------------------"+"\n";
				R = RotacionIzquierdaIzquierda(R,N1);
                                System.out.println("FE despues de Rotar:-|"+R.Fe);
                                }else{      
                                System.out.println("FE Antes Rotar:-|"+R.Fe);    
				rotaciones=rotaciones+"Rotacion Izquierda Derecha\nArgumentos: "+ R.ingreso +" " +R.NombreEstacion+" y " + N1.contraseña+"\n"+"-------------------"+"\n";
				R = RotacionIzquierdaDerecha(R,N1);
                                System.out.println("FE despues de Rotar:-|"+R.Fe);
                                }
                                 Hh = false;
			        break;  
                             }
                         }      
                     }else if(Nodo.ingreso > R.ingreso){
                         R.Derecho=InsertarBalanceado(R.Derecho,Nodo);
                         if (Hh){
                             System.out.println("FE Antes Switch Derecha:-|"+R.Fe);
                             switch(R.Fe){
                                case -1:
                                System.out.println("FE:-|"+R.Fe);
				R.Fe= 0;
			        Hh=false;	
				break;
                                    
				case 0:
                                System.out.println("FE:-|"+R.Fe);    
				R.Fe= 1; 
				break;
                                    
                                //se reestructura ya que pasaria a valer-2 y se desequilibra a la derecha
                                
                                case 1:
				N1=R.Derecho;
                                System.out.println("FE case rotar:-"+R.Fe);
				     if (N1.Fe==1){
					System.out.println("FE Antes Rotar:-|"+R.Fe);		
					rotaciones=rotaciones+"Rotacion Derecha Derecha\nArgumentos: "+ R.ingreso +" " +R.NombreEstacion+" y " + N1.contraseña+"\n"+"-------------------"+"\n";
					R = RotacionDerechaDerecha(R,N1);
                                        System.out.println("FE despues de Rotar:-|"+R.Fe);
                                        
						}
				     else{
					System.out.println("FE Antes Rotar:-|"+R.Fe);		
					rotaciones=rotaciones+"Rotacion Derecha Izquierda\nArgumentos: "+ R.ingreso +" " +R.NombreEstacion+" y " + N1.contraseña+"\n"+"-------------------"+"\n";
					R = RotacionDerechaIzquierda(R,N1);
                                        System.out.println("FE despues de Rotar:-|"+R.Fe);
                                        
						}
						Hh = false;
					
				break;    
                             }
                         }
                         
                     }else{  //fin elseif
				System.out.println("Error: No se pueden numeros iguales");
				Hh = false;
			} 
                         
            }
            
          return R;  //Retorna El Nodo raiz del trabajado            
        }
        
        boolean ArbolVacio(NodoEstacionClave R){
		return (R == null);
	}
        //Para verificar si esta el autor
	private boolean Miembro(int Codau, NodoEstacionClave R){
		NodoEstacionClave Aux = R;
		boolean miembro = false;
		while (Aux != null){
			if (Codau==Aux.ingreso){
				miembro = true;
				Aux = null;
			}
			else{
				if (Codau>Aux.ingreso)
					Aux = Aux.Derecho;
				else{
					Aux = Aux.Izquierdo;
					if (Aux == null)
						miembro = false;
				}
			}
		}
		return miembro;
	}
        
        //ROTACIONES ------------------------------------------------------------------------------------------
        //rota a la derecha
	NodoEstacionClave RotacionDerechaDerecha(NodoEstacionClave N, NodoEstacionClave N1){
		N.Derecho = N1.Izquierdo;
		N1.Izquierdo = N;
		if (N1.Fe==1) {
			N.Fe=0;
			N1.Fe=0;
		}
		else{
			N.Fe = 1;
			N1.Fe = -1;
		}
		N= N1;
		return N;
	}
	//rotacion derecha Izquierda o Doble Derecha
	NodoEstacionClave RotacionDerechaIzquierda(NodoEstacionClave N, NodoEstacionClave N1){
		NodoEstacionClave N2;
		N2 = N1.Izquierdo;
		N.Derecho = N2.Izquierdo;
		N2.Izquierdo=N;
		N1.Izquierdo=N2.Derecho;
		N2.Derecho=N1;
		if (N2.Fe==1){
			N.Fe=-1;
		}
		else{
			N.Fe=0;
		}
		if (N2.Fe==-1)
			N1.Fe=1;
		else
			N1.Fe=0;
		N2.Fe=0;
		N=N2;
		return N;
	}
	//Rotacion Simple Izquierda o Izquierda izquierda
	NodoEstacionClave RotacionIzquierdaIzquierda(NodoEstacionClave N, NodoEstacionClave N1){
		N.Izquierdo = N1.Derecho;
		N1.Derecho = N;
		if (N1.Fe==-1){
			N.Fe=0;
			N1.Fe=0;
		}
		else{
			N.Fe=-1;
			N1.Fe=1;
		}
		N=N1;
		return N;
	}
	//rotacion Izquierda Derecha o Doble Izquierda
	NodoEstacionClave RotacionIzquierdaDerecha(NodoEstacionClave N, NodoEstacionClave N1){
		NodoEstacionClave N2;
		N2=N1.Derecho;
		N.Izquierdo=N2.Derecho;
		N2.Derecho=N;
		N1.Derecho=N2.Izquierdo;
		N2.Izquierdo=N1;
		if (N2.Fe==1)
			N1.Fe=-1;
		else
			N1.Fe=0;
		if (N2.Fe==-1)
			N.Fe=1;
		else
			N.Fe=0;
		N2.Fe=0;
		N=N2;
		return N;
	}
        
//-----------------------FIN ROTACIONES _----------------------------------------------------------------
        
        
        
 //-----------------------OTROS----------------------------------------------------------------
              
        //Nodos Totales
        int CantidadNodosAVL(NodoEstacionClave A){
		int cont = 0;
		if (A == null) 
			cont = cont;
		else{
			cont = cont + 1 + CantidadNodosAVL(A.Izquierdo) + CantidadNodosAVL(A.Derecho);
		}
		return cont;
	}
	//altura	
	public int Altura(NodoEstacionClave raiz){
		if (raiz == null)
		return 0;
		else
		return	1 + Math.max(Altura(raiz.Izquierdo), Altura(raiz.Derecho));
	}
        
        public int altura2do (NodoEstacionClave n) {
	return (n == null) ? -1 : n.Altura;
    }
        	//Despliega la informacion en Postorden
	public void PostOrdenAVL (NodoEstacionClave Nodo){
		if (Nodo == null)
			return;
		else{
			PostOrdenAVL (Nodo.Izquierdo);
			PostOrdenAVL (Nodo.Derecho);
			impresor=impresor+"Autor: "+Nodo.ingreso+ "\n    "+" Nombre: " + Nodo.NombreEstacion+ "\n    "+ " Nacionalidad: "+ Nodo.contraseña+ "\n---------------------\n";
                        System.out.println(""+impresor);
		}
	}
	//Despliega la informacion en Inorden
	public void InordenAVL (NodoEstacionClave Nodo){
		if (Nodo == null)
			return;
		else{
			InordenAVL (Nodo.Izquierdo);
			impresor=impresor+"Autor: "+Nodo.ingreso+ "\n    "+" Nombre: " + Nodo.contraseña+ "\n    "+ " Nacionalidad: "+ Nodo.contraseña+ "\n---------------------\n";
			InordenAVL (Nodo.Derecho);
                        System.out.println(""+impresor);
		}
	}
        
        //------------------BUSQUEDA-------------------------------------------------
        
        public NodoEstacionClave BuscarPorDato (NodoEstacionClave R, int dato){
            
            
    if(R!=null){
      if(dato<R.ingreso){
          BuscarPorDato(R.Izquierdo,dato);       
      }else{
          if(dato>R.ingreso){
            BuscarPorDato(R.Derecho,dato);
          }
          else{
              this.Busqueda=R;
           }
      }
    }else{
          System.out.println ("No Existe el Dato");
          NodoEstacionClave sinDato=new NodoEstacionClave (-555,"nada","nada");
          Busqueda=sinDato; //Retorna Un Objeto Sin Nada :v 
          //return Busqueda;
    }    
            return Busqueda;
    
    
    }
        
    public NodoEstacionClave BuscarPorCorreo (NodoEstacionClave R,String correo){
        
        if(BuscarAux(R,correo)==true){
        System.out.println ("Si se Encontro");    
        }else{
        System.out.println ("No Existe el Dato");
        NodoEstacionClave sinDato=new NodoEstacionClave (-555,"nada","nada");
        Busqueda=sinDato;   
        }  
    return Busqueda;     
                        
    }
        
        
    private boolean BuscarAux (NodoEstacionClave R, String correo){
             
    if(R!=null){
          BuscarAux(R.Izquierdo,correo);
          BuscarAux(R.Derecho,correo);
          if(R.NombreEstacion.equals(correo)){
              this.Busqueda=R;
              boleano=true;
          }         
    }  
            return boleano;   
    }
        
        //----------------------FinBusqueda------------------------------------------
        
        //--------------------Modificar---------------------------------------------
        //ES una busqueda pero insertando los parametros nuevos al objeto encontrado
        public void Modificar(NodoEstacionClave R){
            
        }
        
        //--------------------Fin---------------------------------------------------
        
        
        //--------------------Eliminar---------------------------------------------
        //Este esta de la Gran puta
        public void Eliminar(NodoEstacionClave R){
            
        }
        
        //--------------------Fin---------------------------------------------------     
}
