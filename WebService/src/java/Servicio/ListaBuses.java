
package Servicio;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosmonterroso
 */
public class ListaBuses {
    
    public NodoBuses inicio; //nodo iniciall
    public NodoBuses fin;    //nodo final
    
    int Tamaño=0;
    
        public ArrayList <String> LineasGrafico= new ArrayList <> ();
        
    //constructor por defecto
    public ListaBuses (){
        inicio = null; //inicio nulo
        fin = null;    //final nulo 
    }
    
    //metodo para saber si la lista esta vacia
    public boolean esVacia(){
        
       return inicio==null; //si inicio es nulo retorna verdadero SIno Falso
    }
    
    //metodo para agregar nodos al Final
    /**
    1-si la lista no esta vacia 
 fin = nuevo NodoDobleBuses(bus,nulo,fin) //siguiente va ser a nulo xq esta alfinal (su sig apunta a nulo)
 //puntero anterior a fin xq hay uno antes
 apuntar fin de anterior de siguiente a fin
    2-sino 
 Inicio = Fin = nuevo NodoDobleBuses (elemento) //para agregar desde 0
    */
    public void AgregarAlFinal (bus o){
    
        if (!esVacia()){ //si la lista no esta vacia (porlomenos tiene un nodo)
        //crear un nuevo nodo y asignar a Fin
            fin = new NodoBuses (o,null,fin); 
            //se usa el 2do xq si tiene un nodo (Objeto, siguiente=null, Anterior=finde la lista)
            fin.anterior.siguiente = fin; //fin de anterior de siguiente va apuntar a fin
  
         }else{ //de lo contrario si esta vacia tonces se crea un nodo nuevo
            inicio = fin = new NodoBuses (o); //inicio y fin apuntan al primer nodo q vamos a crear cn el primer const
            //cuando no hay nodos
        } 
        Tamaño++;    
    }
    
    //MEtodo Para Agregar Nodos al Final
    //¨*solo se invierte todo y fin -)cambia a  inicio 
    public void AgregarAlInicio (bus o){
    
        if (!esVacia()){ //si la lista no esta vacia (porlomenos tiene un nodo)
        //
            inicio = new NodoBuses (o,inicio,null); 
            //se usa el 2do xq si tiene un nodo (Objeto, siguiente=inicio, Anterior=nulo)
            inicio.siguiente.anterior = inicio; //inicio de siguiente de anterior va apuntar a inicio
  
         }else{ //de lo contrario si esta vacia tonces se crea un nodo nuevo
            inicio = fin = new NodoBuses (o); //inicio y fin apuntan al primer nodo q vamos a crear cn el primer const
            //cuando no hay nodos
        } 
            
    }
    
    //Metodo Para Mostrar La Lista
    //*tiene 2 enlaces se puede recorrer de inicio a fin Y de Fin a inicio
    // METODO DE INICIO A FIN:::::
    public void MostrarListaInicioFin (){
        if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="<-a-s->";
            NodoBuses auxiliar=inicio; //crea nodoDoble auxiliar y apunta al inicio
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            auxiliar = auxiliar.siguiente; //auxiliar vaser = a auxiliar de siguiente
             }
           // JOptionPane.showMessageDialog(null, datos,"Mostrando De inicio a fin",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // METODO DE FIN A INICIO:::::
    public void MostrarListaFinInicio (){
        if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="<-a-s->";
            NodoBuses auxiliar=fin; //crea nodoDoble auxiliar y apunta al final
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            auxiliar = auxiliar.anterior; //auxiliar va a recorrer a anterior
            
            
            }
            
            JOptionPane.showMessageDialog(null, datos,"Mostrando De Fin a fin",JOptionPane.INFORMATION_MESSAGE);
            
        }else {
            JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public boolean BusquedaBool (int p){
        
        NodoBuses auxiliar=inicio;
        NodoBuses auxiliarFinal = null;
        boolean retorno = false;
         if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
             //crea nodoDoble auxiliar y apunta al final
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
           
                if (auxiliar.dato.id==p){
                    auxiliarFinal=auxiliar;
                    retorno=true;
                }else{
                    retorno=false;
                }
                
                auxiliar = auxiliar.siguiente; //auxiliar va a recorrer a anterior
            }
            
            
        }else {
            JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
            retorno=false;
        }
        return retorno;
    }
    
    
    public NodoBuses Busqueda (String p){
        
        NodoBuses auxiliar=inicio;
        NodoBuses auxiliarFinal = null;
        bus retorno = null;
         if (inicio!=null){ //si no esta vacia porlomenos tiene un nodo
             //crea nodoDoble auxiliar y apunta al final
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
           
                if (auxiliar.dato.nombre.equals(p)){
                    auxiliarFinal=auxiliar;
                    retorno=auxiliarFinal.dato;
                }
                
                auxiliar = auxiliar.siguiente; //auxiliar va a recorrer a anterior
            }
            
            
        }else {
            JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
        }
        return auxiliarFinal;
    }
    
    //cusqueda REtornando el Objeto
    public bus Busqueda2 (String p){
        
        NodoBuses auxiliar=inicio;
        NodoBuses auxiliarFinal = null;
        bus retorno = null;
         if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
             //crea nodoDoble auxiliar y apunta al final
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
           
                if (auxiliar.dato.nombre.equals(p)){
                    auxiliarFinal=auxiliar;
                    retorno=auxiliarFinal.dato;
                }
                
                auxiliar = auxiliar.siguiente; //auxiliar va a recorrer a anterior
            }
            
            
        }else {
            JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
        }
        return retorno;
    }
    
    //Busqueda Retornando el Nodo
    public NodoBuses buscarEnLista(Object destino)
  //  destino: dato que se busca en la lista.
  {
    NodoBuses indice;
    for (indice = inicio; indice != null; indice = indice.siguiente)
      if (indice.dato.equals(destino))
      return indice;      
    return null;
  }
    
    public void EliminarObjeto (bus entrada){
        
        
        //Cola
        NodoBuses actual;  
        
        NodoBuses anterior;  
    boolean encontrado;

    actual = inicio;
    anterior = null;
    
    encontrado = false;
    // Bucle de búsqueda 
    while ((actual!= null) && !actual.dato.equals(entrada))
    {
      if (!actual.dato.equals(entrada))
      { 
        anterior = actual;
        actual = actual.siguiente;
      }
    }
       
    if (actual != null)  
    {
      // Se distingue entre que el nodo sea el cabecera 
      // o del resto de la lista
      if (actual == inicio)
      {
        inicio = actual.siguiente;
      }
      else
      {
        anterior.siguiente = actual.siguiente;
      }
      actual = null; 
        
    }
    }
    
     public void EliminarObjeto2 (bus entrada){
        
        NodoBuses actual;  
        NodoBuses siguiente;  
    boolean encontrado;

    actual = fin;
    siguiente = null;
    
    encontrado = false;
    // Bucle de búsqueda 
    while ((actual!= null) && !actual.dato.equals(entrada))
    {
      if (!actual.dato.equals(entrada))
      { 
        siguiente = actual;
        actual = actual.anterior;
      }
    }
       
    if (actual != null)  
    {
      // Se distingue entre que el nodo sea el cabecera 
      // o del resto de la lista
      if (actual == fin)
      {
        fin = actual.anterior;
      }
      else
      {
        siguiente.anterior = actual.anterior;
      }
      actual = null; 
        
    }
    }
     
     public void EliminarBicho (NodoBuses n){
         
         //Pila--------
         
     if (inicio!= null){
     NodoBuses aux = inicio;
     NodoBuses ant = null;
     while (aux != null){
     if (aux.equals(n) ){
     if (ant == null){
     inicio = inicio.siguiente;
     aux.siguiente=null;
     aux= inicio;                           
     }else {
    //ant.setSiguiente(aux.getSiguiente());
         //.anterior para la cola
     ant.siguiente=aux.siguiente;
     aux.siguiente=null;
     aux = ant.siguiente;
     }                                             
     }else{
     ant = aux;
     aux = aux.siguiente;
     
     }
     }
     }
         
     }
     
     public void remover (NodoBuses n){
         
     NodoBuses TemporalSiguiente=null;    
     NodoBuses TemporalAnterior=null;    
         
     if (n.anterior==null && n.siguiente!=null){//si es el primero nodo..
         //se elimina
         TemporalSiguiente=n.siguiente; //obtenemos el siguiente nodo (el segu)
         // liberamos el nodo "n" de la memoria y también
        // rompemos el enlace del siguiente nodo con él.  
         n=TemporalSiguiente.anterior = null;
     }else if (n.anterior!=null && n.siguiente==null){//es el ultimo 
         TemporalAnterior=n.anterior;//obtenemos el anterior nodo (penultimo)
         // liberamos el nodo "n" de la memoria y también
        // rompemos el enlace del nodo anterior con él.
         n=TemporalAnterior.siguiente=null;
     }else if (n.anterior!=null && n.siguiente!=null){//es un nodo Intermedio
         //obtenemos el siguiente y el anterior
         TemporalAnterior=n.anterior;
         TemporalSiguiente=n.siguiente;
         
         //el noto temporal siguiente sera ahora el temporal anterior y viceversa
         TemporalAnterior.siguiente=TemporalSiguiente;
         TemporalSiguiente.anterior=TemporalAnterior;
         
         //n=null;
                 
     }else {
     // El nodo estaba solo, es el único registro que había
      n = null;
     }
     }
     
      //::::::::::::::::::::GRAFICAR ARBOL ADMINISTRADOR::::::::::::::::::::::::::
        
         public void GraficaLista(NodoBuses Nodo) {
        //TODO write your implementation code here:
        if (Nodo == null)
			return;
		else{
                        try{
                        
                    
                            
                        LineasGrafico.add(""+Nodo.dato.nombre+"->"+Nodo.siguiente.dato.nombre+";\n");
                        LineasGrafico.add(""+Nodo.siguiente.dato.nombre+"->"+Nodo.dato.nombre+";\n");
			GraficaLista (Nodo.siguiente);                        
			
                            
                            
                        }catch (Exception e){
                            
                        }
                        
		}
        
    } 
           
          public void GraficarNodos(NodoBuses Nodo) {
        //TODO write your implementation code here:
        if (Nodo == null)
			return;
		else{
                        LineasGrafico.add(""+Nodo.dato.nombre+";\n");
			GraficarNodos (Nodo.siguiente);
			
			
		}
        
    } 
           
        public void EscribirArchivo1() {
            FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            //ESCRIBE EL FICHERO EN EL DIRECTORIO
            fichero = new FileWriter("/home/carlos/Documents/Graphviz/GraficarLista1.dot");
            pw = new PrintWriter(fichero);
            //--------------------------------------------------------------------------------------
            
            //Pinta lo Que deseamos en el Fichero---------------------------------------------------
            
            pw.println("digraph G {");//cabezera del Graphviz
            
            pw.println ("rankdir=LR;");//pone la Direccion de Izquierda a Derecha
            pw.println ("node [shape=record,width=.1,height=.1];");//pone el cuadro q simula el nodo
          
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

String fileInputPath = "/home/carlos/Documents/Graphviz/GraficarLista1.dot";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

String fileOutputPath = "/home/carlos/NetBeansProjects/Transmetro1.5/web/Lista1.jpg";

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
  
        
     
     
}
