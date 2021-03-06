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
public class ArbolAdministradores {
  String impresor="";
  public static String rotaciones="";
  private boolean boleano=false;      
  
  public boolean AlturaC=false;
        
	public NodoAdministrador A;
        public NodoAdministrador Busqueda=null;
        public NodoAdministrador EncontradoParaModificar=null;
                
	boolean Hh;
        //para Graficar Arbol
        public ArrayList <String> LineasGrafico= new ArrayList <> ();
        
    //Inserta un elemento en el arbol
	public void InsercionAutor (String Nombre , String naci){
		if ((!Miembro(Nombre,A))){
		NodoAdministrador info = new NodoAdministrador(0,Nombre,naci);
		A=InsertarBalanceado(A,info);
                System.out.println("Se inserto autor "+ info.ingreso);
		}
		else
		System.out.println("Error autor repetido");
	}
        
        NodoAdministrador InsertarBalanceado(NodoAdministrador R, NodoAdministrador Nodo){
            
            NodoAdministrador N1;
            NodoAdministrador info=Nodo;
            
            if (ArbolVacio(R)){
			R= info;
			System.out.println("Se inserto autor "+ info.ingreso);
			Hh=true;
		}else{
                
                     if (ComparacionNombre(R.correo,Nodo.correo) == false){
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
                                rotaciones=rotaciones+"Rotacion Izquierda Izquierda\nArgumentos: "+ R.ingreso +" " +R.correo+" y " + N1.contraseña+"\n"+"-------------------"+"\n";
				R = RotacionIzquierdaIzquierda(R,N1);
                                System.out.println("FE despues de Rotar:-|"+R.Fe);
                                }else{      
                                System.out.println("FE Antes Rotar:-|"+R.Fe);    
				rotaciones=rotaciones+"Rotacion Izquierda Derecha\nArgumentos: "+ R.ingreso +" " +R.correo+" y " + N1.contraseña+"\n"+"-------------------"+"\n";
				R = RotacionIzquierdaDerecha(R,N1);
                                System.out.println("FE despues de Rotar:-|"+R.Fe);
                                }
                                 Hh = false;
			        break;  
                             }
                         }      
                     }else if(ComparacionNombre(R.correo,Nodo.correo) == true){
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
					rotaciones=rotaciones+"Rotacion Derecha Derecha\nArgumentos: "+ R.ingreso +" " +R.correo+" y " + N1.contraseña+"\n"+"-------------------"+"\n";
					R = RotacionDerechaDerecha(R,N1);
                                        System.out.println("FE despues de Rotar:-|"+R.Fe);
                                        
						}
				     else{
					System.out.println("FE Antes Rotar:-|"+R.Fe);		
					rotaciones=rotaciones+"Rotacion Derecha Izquierda\nArgumentos: "+ R.ingreso +" " +R.correo+" y " + N1.contraseña+"\n"+"-------------------"+"\n";
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
        
        boolean ArbolVacio(NodoAdministrador R){
		return (R == null);
	}
        //Para verificar si esta el autor
	private boolean Miembro(String Codau, NodoAdministrador R){
		NodoAdministrador Aux = R;
		boolean miembro = false;
		while (Aux != null){
			if (Codau==Aux.correo){
				miembro = true;
				Aux = null;
			}
			else{
				if (ComparacionNombre(R.correo,Aux.correo) == true)
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
	NodoAdministrador RotacionDerechaDerecha(NodoAdministrador N, NodoAdministrador N1){
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
	NodoAdministrador RotacionDerechaIzquierda(NodoAdministrador N, NodoAdministrador N1){
		NodoAdministrador N2;
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
	NodoAdministrador RotacionIzquierdaIzquierda(NodoAdministrador N, NodoAdministrador N1){
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
	NodoAdministrador RotacionIzquierdaDerecha(NodoAdministrador N, NodoAdministrador N1){
		NodoAdministrador N2;
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
        int CantidadNodosAVL(NodoAdministrador A){
		int cont = 0;
		if (A == null) 
			cont = cont;
		else{
			cont = cont + 1 + CantidadNodosAVL(A.Izquierdo) + CantidadNodosAVL(A.Derecho);
		}
		return cont;
	}
	//altura	
	public int Altura(NodoAdministrador raiz){
		if (raiz == null)
		return 0;
		else
		return	1 + Math.max(Altura(raiz.Izquierdo), Altura(raiz.Derecho));
	}
        
        public int altura2do (NodoAdministrador n) {
	return (n == null) ? -1 : n.Altura;
    }
        	//Despliega la informacion en Postorden
	public void PostOrdenAVL (NodoAdministrador Nodo){
		if (Nodo == null)
			return;
		else{
			PostOrdenAVL (Nodo.Izquierdo);
			PostOrdenAVL (Nodo.Derecho);
			impresor=impresor+"Autor: "+Nodo.ingreso+ "\n    "+" Nombre: " + Nodo.correo+ "\n    "+ " Nacionalidad: "+ Nodo.contraseña+ "\n---------------------\n";
                        System.out.println(""+impresor);
		}
	}
        
        public void PreOrden (NodoAdministrador Nodo){
            if (Nodo == null)
			return;
		else{
                        
			PostOrdenAVL (Nodo.Izquierdo);
			PostOrdenAVL (Nodo.Derecho);
			
		}
        }
        
	//Despliega la informacion en Inorden
	public void InordenAVL (NodoAdministrador Nodo){
		if (Nodo == null)
			return;
		else{
			InordenAVL (Nodo.Izquierdo);
			impresor=impresor+"Autor: "+Nodo.ingreso+ "\n    "+" Nombre: " + Nodo.contraseña+ "\n    "+ " Nacionalidad: "+ Nodo.contraseña+ "\n---------------------\n";
			InordenAVL (Nodo.Derecho);
                        System.out.println(""+impresor);
		}
	}
        
        public String imprimir(NodoAdministrador Nodo){
            String i="";
          if (Nodo == null){
			
              }else{
			InordenAVL (Nodo.Izquierdo);
			impresor=impresor+"Autor: "+Nodo.ingreso+ "\n    "+" Nombre: " + Nodo.contraseña+ "\n    "+ " Nacionalidad: "+ Nodo.contraseña+ "\n---------------------\n";
                        i=i+Nodo.ingreso+"-";
			InordenAVL (Nodo.Derecho);
                        System.out.println(""+impresor);
		}
          return i;
        }
        
        public void otroimprimir (NodoAdministrador nodo){
            if ( nodo != null ){
            otroimprimir(nodo.Derecho);
            System.out.println("["+ nodo.ingreso + "]");
            otroimprimir(nodo.Izquierdo);
        }
        }
        
        //------------------BUSQUEDA-------------------------------------------------
        
        public NodoAdministrador BuscarPorDato (NodoAdministrador R, int dato){
            
            
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
          NodoAdministrador sinDato=new NodoAdministrador (-555,"nada","nada");
          Busqueda=sinDato; //Retorna Un Objeto Sin Nada :v 
          //return Busqueda;
    }    
            return Busqueda;
    
    
    }
        
    public NodoAdministrador BuscarPorCorreo (NodoAdministrador R,String correo){
        
        if(BuscarAux(R,correo)==true){
        System.out.println ("Si se Encontro");    
        }else{
        System.out.println ("No Existe el Dato");
        NodoAdministrador sinDato=new NodoAdministrador (-555,"nada","nada");
        Busqueda=sinDato;   
        }  
    return Busqueda;     
                        
    }
        
        
    private boolean BuscarAux (NodoAdministrador R, String correo){
             
    if(R!=null){
          BuscarAux(R.Izquierdo,correo);
          BuscarAux(R.Derecho,correo);
          if(R.correo.equals(correo)){
              this.Busqueda=R;
              boleano=true;
          }         
    }  
            return boleano;   
    }
        
        //----------------------FinBusqueda------------------------------------------
        
        //--------------------Modificar---------------------------------------------
        //ES una busqueda pero insertando los parametros nuevos al objeto encontrado
        public String ModificarArbol(NodoAdministrador R, String CorreoBusqueda,String CorreoNuevo, String Contra){
            String text="";
            if (BuscarPorCorreo(R,CorreoBusqueda).ingreso==-555){
            text="No SE Modifico Xq No Existe Ese DAto";
            }else{
               BuscarPorCorreo(R,CorreoBusqueda).correo=CorreoNuevo;
               BuscarPorCorreo(R,CorreoBusqueda).contraseña=Contra;
               text="SE MODIFICO A: "+BuscarPorCorreo(R,CorreoBusqueda).correo+" Contraseña: "+BuscarPorCorreo(R,CorreoBusqueda).contraseña+"";
            }
            return text;
        }
        
        //--------------------Fin---------------------------------------------------
        
        
        //--------------------Eliminar---------------------------------------------
        //Este esta de la Gran puta
        public NodoAdministrador Eliminar(NodoAdministrador R, String correo){
        NodoAdministrador i= null;
        if(correo==null){
         //nada   
        }else{
        

            if(R!=null){
            if(R.correo.equals(correo)){
                if(R.Derecho==null&&R.Izquierdo==null){
                    
                     i=null;
                    
                }else if (R.Derecho!=null && R.Izquierdo==null){
                
                     i=R.Derecho;
                
                 }else if (R.Derecho==null && R.Izquierdo!=null){
                
                     i=R.Izquierdo;
                
                 }else if (R.Derecho!=null && R.Izquierdo!=null){//--------------ESte Da vergueo
                     
                     
                     NodoAdministrador auxiliar=hijomasDerecho(R.Izquierdo,R);//=Hijo mas a la derecha(R, HijoIzquierda)
                     NodoAdministrador auxiliar2=R; //=Raiz
                     auxiliar.Izquierdo=R.Izquierdo;
                     auxiliar.Derecho=R.Derecho;
                     i=auxiliar;
                 }
            }else{
                if(ComparacionNombre(R.correo,correo) == false){//comparacion de caminos
                    if(R.Izquierdo!=null){
                        R.Izquierdo=Eliminar(R.Izquierdo,correo);
                        i=R;
                    }else{
                        i=R;
                    }
                }else{
                    if(R.Derecho!=null){
                        R.Derecho=Eliminar(R.Derecho,correo);
                        i=R;
                    }else{
                        i=R;
                    }
                    
                }
                
                
            }
            
        }
        }
        return i;
        }
        
        public NodoAdministrador hijomasDerecho (NodoAdministrador R, NodoAdministrador padre){
            NodoAdministrador h=null;
            
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
        
        public NodoAdministrador EquilibrarDespuesDeEliminar(NodoAdministrador R, String correo){
            NodoAdministrador R1=null;
            if (R!=null){
                //---------------------------------
                int hijoI=Altura(R.Izquierdo)+1;
                int hijoD=Altura(R.Derecho)+1;
                //---------------------------------
                if(hijoI-hijoD==2){
                    String dato=correo;
                    String datoI=R.Izquierdo.correo;
                    R1=R.Izquierdo;
                    if(ComparacionNombre(R.correo,datoI) == false){
                        R=RotacionIzquierdaIzquierda(R,R1);//--------
                    }else{
                        R=RotacionIzquierdaDerecha(R,R1);   
                    }
                }if(-hijoI+hijoD==2){
                    String dato=correo;
                    String datoD=R.Derecho.correo;
                    R1=R.Derecho;
                    if(ComparacionNombre(R.correo,datoD) == true){
                        R=RotacionDerechaDerecha(R,R1);
                    }else{
                         R=RotacionDerechaIzquierda(R,R1);  
                    }
                }
                if(R.correo.equals(correo)){
                    //nodo ya Existente
                }else{
                    if(ComparacionNombre(R.correo,correo) == false){
                        if(R.Izquierdo!=null){
                            R.Izquierdo=EquilibrarDespuesDeEliminar(R.Izquierdo,correo);
                        }
                        
                    }else{
                        if(R.Derecho!=null){
                            R.Derecho=EquilibrarDespuesDeEliminar(R.Derecho,correo);
                        }
                    }
                }
                
            }
            
            return R;
        }
        
        
 
        //--------------------Fin---------------------------------------------------  
        
        
        //::::::::::::::::::::GRAFICAR ARBOL ADMINISTRADOR::::::::::::::::::::::::::
        
         public void GraficaLineasArbol1(NodoAdministrador Nodo) {
        //TODO write your implementation code here:
        if (Nodo == null)
			return;
		else{
                        try{
                        
                            if (Nodo.Derecho==null && Nodo.Izquierdo!=null){
                             LineasGrafico.add("\""+Nodo.correo+"\""+"->"+"\""+Nodo.Izquierdo.correo+"\""+";\n");    
                            }else if (Nodo.Derecho!=null && Nodo.Izquierdo==null){
                            LineasGrafico.add("\""+Nodo.correo+"\""+"->"+"\""+Nodo.Derecho.correo+"\""+";\n");    
                            }else{
                            
                        LineasGrafico.add("\""+Nodo.correo+"\""+"->"+"\""+Nodo.Izquierdo.correo+"\""+";\n");
                        LineasGrafico.add("\""+Nodo.correo+"\""+"->"+"\""+Nodo.Derecho.correo+"\""+";\n");
			GraficaLineasArbol1 (Nodo.Izquierdo);                        
			GraficaLineasArbol1 (Nodo.Derecho);
                            }
                            
                        }catch (Exception e){
                            
                        }
                        
		}
        
    } 
           
          public void GraficarNodos(NodoAdministrador Nodo) {
        //TODO write your implementation code here:
        if (Nodo == null)
			return;
		else{
                        LineasGrafico.add("\""+Nodo.correo+"\""+";\n");
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
            fichero = new FileWriter("/home/carlos/Documents/Graphviz/GraficarArbol1.dot");
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

String fileInputPath = "/home/carlos/Documents/Graphviz/GraficarArbol1.dot";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

String fileOutputPath = "/home/carlos/NetBeansProjects/Transmetro1.5/web/Arbol1.jpg";

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
        
        
public boolean ComparacionNombre(String raiz, String Nuevo){
    boolean validar=false;
    if(raiz.length()>Nuevo.length()){
        
        for(int i=0; i <Nuevo.length(); i++){
            
            if(raiz.codePointAt(i)>Nuevo.codePointAt(i)){
                validar=false;
                break;
            }else if (raiz.codePointAt(i)<Nuevo.codePointAt(i)){
                validar= true;
                break;
            }else{
                //No hace NAda Xq No Deberian LLegar Iguales:
            }
        }
        
        
    }else if(raiz==Nuevo){
        
    }else{
       for(int i=0; i<raiz.length(); i++){
            
            if(raiz.codePointAt(i)>Nuevo.codePointAt(i)){
                validar= false;
                break;
            }else if (raiz.codePointAt(i)<Nuevo.codePointAt(i)){
                validar= true;
                break;
            }else{
                //no HAce Nada xq No Deveria Incertar Iguales
            }
        } 
    }
    
    return validar;
}        
        
        
//::::::::::::::::::::FIN:::::::::::::::::::::::::::::::::::::::::::::::::::::::

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//-----------------------------ELIMINAR-----------------------------------------
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        
public void EliminarDelArbol(String valor){

AlturaC=false;    

A=borrar(A,valor);    
    
}

public NodoAdministrador borrar(NodoAdministrador R, String valor){
    
    if (R==null){
    //NULOOO
    }else if (R.correo.equals(valor)){//------------------------------Nodo Encontrado: 
       NodoAdministrador nodo;
       nodo=R; //nodo a quitar
       if(nodo.Izquierdo==null){
           R=nodo.Derecho;
           AlturaC=true;
       }else if(nodo.Derecho==null){
           R=nodo.Izquierdo;
           AlturaC=true;
       }else{//tiene los dos hijos:V
           NodoAdministrador iz=reemplazar(R,R.Izquierdo);
           R.Izquierdo=iz;
           if(AlturaC==true){
               R=balancear1(R);
           }
       }
       nodo=null;
    }else if(ComparacionNombre(R.correo,valor) == false){
        NodoAdministrador Izquierda=borrar(R.Izquierdo,valor);
        R.Izquierdo=Izquierda;
        if(AlturaC==true){
            R=balancear1(R);
        }
        
    }else if (ComparacionNombre(R.correo,valor) == true){
        NodoAdministrador Derecha =borrar(R.Derecho,valor);
        R.Derecho=Derecha;
        if(AlturaC==true){
            R=balancear2(R);
        }
    }
    return R;
}




public NodoAdministrador balancear1(NodoAdministrador R){
  
     NodoAdministrador N1;
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
    
  public NodoAdministrador balancear2(NodoAdministrador R){
      NodoAdministrador N1;
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
  
  public NodoAdministrador reemplazar(NodoAdministrador n,NodoAdministrador act){
      
      if(act.Derecho!=null){
          NodoAdministrador d;
          d=reemplazar (n,act.Derecho);
          act.Derecho=d;
          if(AlturaC==true){
              act=balancear2(act);
          }
      }else{
          n.correo=act.correo;
          n=act;
          act=act.Izquierdo;
          n=null;
          AlturaC=true;
          
      }
      return act;
  }
        
}
