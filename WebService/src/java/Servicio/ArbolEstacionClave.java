/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class ArbolEstacionClave {
  String impresor="";
  String rotaciones="";
  private boolean boleano=false;      
  public boolean AlturaC=false;      
	public NodoEstacionClave A;
        public NodoEstacionClave Busqueda=null;
        public NodoEstacionClave EncontradoParaModificar=null;
                
	boolean Hh;
        public ArrayList <String> LineasGrafico= new ArrayList <> ();
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
        public String ModificarArbol(NodoEstacionClave R, int NombreBusqueda,String NombreNuevo, String Contra){
            String text="";
            if (BuscarPorDato(R,NombreBusqueda).ingreso==-555){
            text="No SE Modifico Xq No Existe Ese DAto";
            }else{
               BuscarPorDato(R,NombreBusqueda).NombreEstacion=NombreNuevo;
               BuscarPorDato(R,NombreBusqueda).contraseña=Contra;
               text="SE MODIFICO A: "+BuscarPorDato(R,NombreBusqueda).NombreEstacion+" Contraseña: "+BuscarPorDato(R,NombreBusqueda).contraseña+"";
            }
            return text;
        }
        
        //--------------------Fin---------------------------------------------------
        
        
        //--------------------Eliminar---------------------------------------------
                //Este esta de la Gran puta
        public NodoEstacionClave Eliminar(NodoEstacionClave R, int x){
        NodoEstacionClave i= null;
        
        if(R!=null){
            if(R.ingreso==x){
                if(R.Derecho==null&&R.Izquierdo==null){
                    
                     i=null;
                    
                }else if (R.Derecho!=null && R.Izquierdo==null){
                
                     i=R.Derecho;
                
                 }else if (R.Derecho==null && R.Izquierdo!=null){
                
                     i=R.Izquierdo;
                
                 }else if (R.Derecho!=null && R.Izquierdo!=null){
                     NodoEstacionClave auxiliar=hijomasDerecho(R.Izquierdo,R);//=Hijo mas a la derecha(R, HijoIzquierda)
                     NodoEstacionClave auxiliar2=R; //=Raiz
                     auxiliar.Izquierdo=R.Izquierdo;
                     auxiliar.Derecho=R.Derecho;
                     i=auxiliar;
                 }
            }else{
                if(x < R.ingreso){
                    if(R.Izquierdo!=null){
                        R.Izquierdo=Eliminar(R.Izquierdo,x);
                        i=R;
                    }else{
                        i=R;
                    }
                }else{
                    if(R.Derecho!=null){
                        R.Derecho=Eliminar(R.Derecho,x);
                        i=R;
                    }else{
                        i=R;
                    }
                    
                }
                
                
            }
            
        }
        return i;
        }
        
        public NodoEstacionClave hijomasDerecho (NodoEstacionClave R, NodoEstacionClave padre){
            NodoEstacionClave h=null;
            if(R.Derecho==null){
                if(R.Izquierdo!=null && padre.Izquierdo!=R){
                    padre.Derecho=R.Izquierdo;
                    R.Izquierdo=null;
                }else if (R.Izquierdo==null){
                    padre.Derecho=null;
                }else if (R.Izquierdo!=null && padre.Izquierdo==R){
                    padre.Izquierdo=R.Izquierdo;
                    R.Izquierdo=null;
                }
                h=R;      
            }else{
                h=hijomasDerecho(R.Derecho,R);
            }
            
            return h;
        }
        
        public NodoEstacionClave EquilibrarDespuesDeEliminar(NodoEstacionClave R, int x){
            NodoEstacionClave R1=null;
            if (R!=null){
                int hijoI=Altura(R.Izquierdo)+1;
                int hijoD=Altura(R.Derecho)+1;
                if(hijoI-hijoD==2){
                    int dato=x;
                    int datoI=R.Izquierdo.ingreso;
                    R1=R.Izquierdo;
                    if(x < R.ingreso){
                        R=RotacionIzquierdaIzquierda(R,R1);//--------
                    }else{
                        R=RotacionIzquierdaDerecha(R,R1);   
                    }
                }if(-hijoI+hijoD==2){
                    int dato=x;
                    int datoD=R.Derecho.ingreso;
                    R1=R.Derecho;
                    if(x>R.ingreso){
                        R=RotacionDerechaDerecha(R,R1);
                    }else{
                         R=RotacionDerechaIzquierda(R,R1);  
                    }
                }
                if(R.ingreso==x){
                    //nodo ya Existente
                }else{
                    if(x < R.ingreso){
                        if(R.Izquierdo!=null){
                            R.Izquierdo=EquilibrarDespuesDeEliminar(R.Izquierdo,x);
                        }
                        
                    }else{
                        if(R.Derecho!=null){
                            R.Derecho=EquilibrarDespuesDeEliminar(R.Derecho,x);
                        }
                    }
                }
                
            }
            
            return R;
        }
        
        //--------------------Fin---------------------------------------------------  
        
        
        //::::::::::::::::::::GRAFICAR ARBOL ADMINISTRADOR::::::::::::::::::::::::::
        
         public void GraficaLineasArbol1(NodoEstacionClave Nodo) {
        //TODO write your implementation code here:
        if (Nodo == null)
			return;
		else{
                        try{
                        
                            if (Nodo.Derecho==null && Nodo.Izquierdo!=null){
                             LineasGrafico.add(""+Nodo.NombreEstacion+""+Nodo.ingreso+"->"+Nodo.Izquierdo.NombreEstacion+""+Nodo.Izquierdo.ingreso+";\n");    
                            }else if (Nodo.Derecho!=null && Nodo.Izquierdo==null){
                            LineasGrafico.add(""+Nodo.NombreEstacion+""+Nodo.ingreso+"->"+Nodo.Derecho.NombreEstacion+""+Nodo.Derecho.ingreso+";\n");    
                            }else{
                            
                        LineasGrafico.add(""+Nodo.NombreEstacion+""+Nodo.ingreso+"->"+Nodo.Izquierdo.NombreEstacion+""+Nodo.Izquierdo.ingreso+";\n");
                        LineasGrafico.add(""+Nodo.NombreEstacion+""+Nodo.ingreso+"->"+Nodo.Derecho.NombreEstacion+""+Nodo.Derecho.ingreso+";\n");
			GraficaLineasArbol1 (Nodo.Izquierdo);                        
			GraficaLineasArbol1 (Nodo.Derecho);
                            }
                            
                        }catch (Exception e){
                            
                        }
                        
		}
        
    } 
           
          public void GraficarNodos(NodoEstacionClave Nodo) {
        //TODO write your implementation code here:
        if (Nodo == null)
			return;
		else{
                        LineasGrafico.add(""+Nodo.NombreEstacion+""+Nodo.ingreso+";\n");
			GraficarNodos (Nodo.Izquierdo);
			GraficarNodos(Nodo.Derecho);
			
		}
        
    } 
           
        public void EscribirArchivo1() {
            FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            //ESCRIBE EL FICHERO EN EL DIRECTORIO
            fichero = new FileWriter("/home/carlos/Documents/Graphviz/GraficarArbol2.dot");
            pw = new PrintWriter(fichero);
            //--------------------------------------------------------------------------------------
            
            //Pinta lo Que deseamos en el Fichero---------------------------------------------------
            
            pw.println("digraph G {");//cabezera del Graphviz
            
            //pw.println ("rankdir=LR;");//pone la Direccion de Izquierda a Derecha
            //pw.println ("node [shape=record,width=.1,height=.1];");//pone el cuadro q simula el nodo
          
            for (int i=0; i< LineasGrafico.size(); i++){
                pw.print(""+LineasGrafico.get(i).toString());
                System.out.println(""+LineasGrafico.get(i));
            }
            
            pw.println("}"); //Fin del GraphViz 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    
        
    }

        public  void Graficar1() {
        //Limpiar Array
        LineasGrafico.clear();
        try {

//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz

String dotPath = "dot";

//path del archivo creado con el codigo del graphviz que queremos

String fileInputPath = "/home/carlos/Documents/Graphviz/GraficarArbol2.dot";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

String fileOutputPath = "/home/carlos/NetBeansProjects/Transmetro1.5/web/Arbol2.jpg";

//tipo de imagen de salida, en este caso es jpg

String tParam = "-Tjpg";

String tOParam = "-o";

//concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas

//recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:

String[] cmd = new String[5];
cmd[0] = dotPath;
cmd[1] = tParam;
cmd[2] = fileInputPath;
cmd[3] = tOParam;
cmd[4] = fileOutputPath;

//Invocamos nuestra clase 

Runtime rt = Runtime.getRuntime();

//Ahora ejecutamos como lo hacemos en consola

rt.exec( cmd );

//Grafica Generada

} catch (Exception ex) {
ex.printStackTrace();
}  finally {
}
    }
        
//::::::::::::::::::::FIN:::::::::::::::::::::::::::::::::::::::::::::::::::::::
  
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//-----------------------------ELIMINAR-----------------------------------------
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        
public void EliminarDelArbol(int valor){

AlturaC=false;    

A=borrar(A,valor);    
    
}

public NodoEstacionClave  borrar(NodoEstacionClave R, int valor){
    
    if (R==null){
    //NULOOO
    }else if (R.ingreso==valor){//------------------------------Nodo Encontrado: 
       NodoEstacionClave nodo;
       nodo=R; //nodo a quitar
       if(nodo.Izquierdo==null){
           R=nodo.Derecho;
           AlturaC=true;
       }else if(nodo.Derecho==null){
           R=nodo.Izquierdo;
           AlturaC=true;
       }else{//tiene los dos hijos:V
           NodoEstacionClave iz=reemplazar(R,R.Izquierdo);
           R.Izquierdo=iz;
           if(AlturaC==true){
               R=balancear1(R);
           }
       }
       nodo=null;
    }else if(valor < R.ingreso){
        NodoEstacionClave Izquierda=borrar(R.Izquierdo,valor);
        R.Izquierdo=Izquierda;
        if(AlturaC==true){
            R=balancear1(R);
        }
        
    }else if (valor > R.ingreso){
        NodoEstacionClave Derecha =borrar(R.Derecho,valor);
        R.Derecho=Derecha;
        if(AlturaC==true){
            R=balancear2(R);
        }
    }
    return R;
}




public NodoEstacionClave balancear1(NodoEstacionClave R){
  
     NodoEstacionClave N1;
     switch(R.Fe){
                                case -1:
                                System.out.println("FE:-|"+R.Fe);
				R.Fe= 0;
			        Hh=false;	
				break;
                                    
				case 0:
                                System.out.println("FE:-|"+R.Fe);    
				R.Fe= 1; 
                                AlturaC=false;
				break;
                                    
                                //se reestructura ya que pasaria a valer-2 y se desequilibra a la derecha
                                
                                case 1:
				N1=R.Derecho;
                                System.out.println("FE case rotar:-"+R.Fe);
				     if (N1.Fe >= 0){
                                         if(N1.Fe==0){
                                         AlturaC=false;    
                                         }
					R = RotacionDerechaDerecha(R,N1);
                                        //---------------------------------------
			             }
				     else{
					R = RotacionDerechaIzquierda(R,N1);
                                        
				         }
                                break;
                                        
                             }
     return R;
    
}
    
  public NodoEstacionClave balancear2(NodoEstacionClave R){
      NodoEstacionClave N1;
      switch(R.Fe){
                                    
				case 1:
				R.Fe= 0;
			        Hh=false;	
				break;
				case 0:
                                
				R.Fe= -1;
                                AlturaC=false;//---------------------------------------
				break;
                                //se reestructura ya que pasaria a valer-2 y se desequilibra a la izq
			        case -1:
                                
                                N1=R.Izquierdo;
				if (N1.Fe<= 0){   
                                    if(N1.Fe==0){
                                    AlturaC=false;
                                    }    
                                R = RotacionIzquierdaIzquierda(R,N1);
                                
                                }else{      
                                R = RotacionIzquierdaDerecha(R,N1);
                                
                                }
                                 
			        break;  
                             }
      return R;
      
  }         
  
  public NodoEstacionClave reemplazar(NodoEstacionClave n,NodoEstacionClave act){
      
      if(act.Derecho!=null){
          NodoEstacionClave d;
          d=reemplazar (n,act.Derecho);
          act.Derecho=d;
          if(AlturaC==true){
              act=balancear2(act);
          }
      }else{
          n.ingreso=act.ingreso;
          n=act;
          act=act.Izquierdo;
          n=null;
          AlturaC=true;
          
      }
      return act;
  }
   
}
