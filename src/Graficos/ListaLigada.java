/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 * Declaracion de la clase generica ListaLigada
 * @author Ingrid Paola Lopez Niño, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
import java.io.*;
public class ListaLigada<T> {
    public Nodo<T> inicio;
    public Tabla tab;
    /**
     * Metodo que regresa el inicio de la lista
     * @return inicio
     */
    public Nodo getInicio()
    {
        return inicio;
    }
    /**
     * Metodo que no regresa nada y tiene un parametro
     * @param nuevo Es un parametro de tipo Nodo
     */
    public void setInicio(Nodo nuevo)
    {
        inicio = nuevo;
    }
    /**
     * Metodo que devuelve una tabla
     * @return tab
     */
    public Tabla getTab() {
        return tab;
    }
    /**
     * Metodo que no regresa nada
     * @param tab Es un parametro de tipo Tabla
     */
    public void setTab(Tabla tab) {
        this.tab = tab;
    }
    /**
     * Metodo que no devuelve nada y tiene un parametro
     * @param raiz Es un parametro de tipo Nodo
     */
    public void setRaiz(Nodo raiz){
        this.inicio = inicio;
    }
    /**
     * Metodo para insertar un nodo a la lista
     * @param nuevo Es un parametro de tipo Nodo
     */
    public void insertar(Nodo<T> nuevo)
    {
        Nodo aux = nuevo;
        Nodo temporal;
        temporal = inicio;
        
        if(inicio == null){
            inicio = aux;
        }else{
            while (temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();
            }
            
            temporal.setSiguiente(aux);
        }
    }
    /**
     * Metodo para vaciar la lista
     * @version 06/12/2016
     */
    public void vaciarLista()
    {
        inicio = null;
    }
    /**
     * Metodo que nos da el tamaño de la lista
     * @version 06/12/2016
     */
    public int tamaño()
    {
        int i = 0;
        Nodo temporal;
        temporal = inicio;
        
        while (temporal != null){
           i++;
           temporal = temporal.getSiguiente();
        }
        
        return i;
    }
    /**
     * Metodo que nos regresa en un String los datos
     * @version 06/12/2016
     */
    public String toString()
    {
        String salida = "";
        Nodo temporal;
        temporal = inicio;
        
        while (temporal != null){
           salida +="\n" +temporal.getDato();
           temporal = temporal.getSiguiente();
        }
        
        return salida;
    }
    /**
     * Metodo que no regresa nada y tiene un parametro
     * @param out Es un parametro de PrintWriter
     */
    public void salidaCliente(PrintWriter out)
    {
        Nodo temporal = inicio;
        String s="--- ";
        
        while (temporal != null){
           s += String.format("%-12s",(String)temporal.getDato());
           temporal = temporal.getSiguiente();
        }
        
        s += " ---";
        out.println(s);
    }
    
    /**
     * Metodo para eliminar de la lista
     * @param nombre Es una cadena que le pasamos como parametro
     */
    public void eliminar(String nombre)
    {
       Nodo temporal = inicio, anterior=null;
       Nodo eliminado= null;
       
        while (!temporal.getTabla().getNombre().equalsIgnoreCase(nombre) && temporal != null){
           anterior = temporal;
           temporal = temporal.getSiguiente();
        }
        
        if (temporal != null){
           
          if (temporal.getSiguiente() != null){
            anterior.setSiguiente(temporal.getSiguiente());  
            eliminado = temporal; 
          }else {
             eliminado = anterior.getSiguiente();
             anterior.setSiguiente(null);
          }
       }
       
       
        
    }
   
    /**
     * Metodo que nos retorna un nodo
     * @param dato Es un parametro de tipo tabla
     */
     public Nodo eliminarTabla( Tabla dato ){
    	if( inicio == null ){
    		return null;
    	}
    	
    	Nodo temporal = inicio;
    	Nodo anterior = null;
    	
    	while( !temporal.getDato().equals(dato) ){
    		anterior = temporal;
    		temporal = temporal.getSiguiente();
    	}
    	if( anterior != null ){
    		anterior.setSiguiente( temporal.getSiguiente() );
        	temporal.setSiguiente( null );
        	return temporal;
        }else if (temporal == inicio){
            if (temporal.getSiguiente() == null){
            inicio =null;
            }else {
                inicio = temporal.getSiguiente();
            }
            return temporal;
        }else{
    		return temporal;
    	}
    	
}
    /**
     * Metodo para buscar y nos devuelve una Tabla
     * @param nombre Es un parametro de tipo String
     */
    public Tabla buscarTabla (String nombre)
    {
        Nodo temporal = inicio;
        
        while (temporal  != null && !temporal.getTabla().getNombre().equalsIgnoreCase(nombre)  ){
           temporal = temporal.getSiguiente();
        }
        
        if (temporal != null)
        return temporal.getTabla();
        else return null;
    }
    /**
     * Metodo que recorre la lista ligada
     * @param inicio Es un parametro de tipo Nodo
     */
    public void recorrer( Nodo inicio)
    {
        if( inicio != null )
        {
                System.out.println("valores "+ inicio.getValores() + " nombre tabla "+ inicio.getNombreTabla1() );
                 recorrer( inicio.getSiguiente());   
        }    
    }
    /**
     * Metodo que recorre la lista enlazada
     * @param inicio Es un parametro de tipo Nodo
     */
   public String recorrer2( Nodo inicio)
    {
        String va="";
        if( inicio != null )
        {
                va+= ("valores "+ inicio.getValores() + " nombre tabla "+ inicio.getNombreTabla1() );
                 recorrer2( inicio.getSiguiente());   
        } 
        return va;
    }
}
