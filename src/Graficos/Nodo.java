/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 * Declaracion de la clase generica Nodo
 * @author Ingrid Paola Lopez Niño, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
import java.util.*;
public class Nodo<T> {
    
    private String dato1;
    private String nombreTabla;
    ArrayList<String> valores;
    private Integer dato2;
    private Tabla tablita;
    private Objeto objeto;
    private Nodo siguiente;
    private int indice;
      public Nodo ()
    {
        
    }
    /**
     * Constructor de la clase Nodo
     * @param dato Es un parametro entero 
     */
    public Nodo (int dato)
    {
        this.dato2 = dato;
        siguiente = null;
    }
    /**
     * Es otro constructor de la clase Nodo
     * @param dato Es un parametro de tipo cadena
     */    
    public Nodo (String dato)
    {
        this.dato1 = dato;
        siguiente = null;
    }
    /**
     * Es otro constructor de la clase Nodo
     * @param tabla Es un parametro de tipo Tabla
     */
    public Nodo (Tabla tabla)
    {
        tablita = tabla;
    }
    /**
     * Es otro constructor de la clase Nodo
     * @param nombreTabla Es un parametro de tipo cadena
     * @param valores Es un parametro de ArrayList de tipo String
     */
    public Nodo(String nombreTabla, ArrayList<String> valores){
        
        this.nombreTabla = nombreTabla;
        this.valores = valores;
    }
    /**
     * Metodo que nos devuelve el nombre de la tabla
     * @return nombreTabla
     */
    public String getNombreTabla() {
        return nombreTabla;
    }
    /**
     * Metodo que no regresa nada
     * @param nombreTabla Es un parametro de tipo cadena
     */
    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }
    /**
     * Metodo que nos devuelve un String
     * @return dat
     */
    public String getValores() {
        String dat="";
        for(int i=0; i<valores.size();i++){
             dat+=valores.get(i);
        }
        return dat;
    }
    /**
     * Metodo que nos regresa el nombre de una tabla
     * @return nombreTabla
     */
    public String getNombreTabla1(){
        return  nombreTabla;
        
    }
    /**
     * Metodo que no devuelve nada
     * @param valores Es un parametro de tipo ArrayList de String
     */
    public void setValores(ArrayList<String> valores) {
        this.valores = valores;
    }
    /**
     * Metodo que nos regresa la tabla
     * @return tablita
     */
    public Tabla getTabla()
    {
        return tablita;
    }
    /**
     * Metodo que nos regresa un Objeto
     * @return objeto
     */
    public Objeto getObjeto()
    {
        return objeto;
    }
    /**
     * Constructor de la clase Nodo
     * @param objeto Es un parametro de tipo Objeto
     */
    public Nodo (Objeto objeto)
    {
        this.objeto = objeto;
    }
    /**
     * Metodo que nos devuelve un objeto 
     * @return objeto
     */
    public Object getDato()
    {
        if (dato1 != null){
            return dato1;
        }else if(dato2 != null) {
            return dato2;
        }else if (tablita != null){
            return tablita;
        }else {
            return objeto;
        }
    }
    /**
     * Metodo que no devuelve nada
     * @param dato
     */
    public void setDato(Object dato)
    { 
        if (dato instanceof String){
            dato1 = (String)dato;
        }else {
            dato2 = (Integer)dato;
        }
    }
    /**
     * Metodo que devuelve un Nodo
     * @return siguiente
     */
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    /**
     * Metodo que no devuelve nada
     * @param s Es un parametro de tipo Nodo
     */
    public void setSiguiente(Nodo s)
    {
        siguiente = s;
    }
    /**
     * Metodo para comparar
     * @param no Es un parametro de tipo Nodo
     */
    public int compareTo (Nodo no)
    {
        int i= 0;
        
        if (this.getDato() instanceof String && no.getDato() instanceof String)
        {
            String dato = (String)this.getDato();
            String siguiente = (String) no.getDato();
            i =  dato.compareTo(siguiente);
        }else if(this.getDato() instanceof Integer && no.getDato() instanceof Integer){
            Integer dato = (Integer) this.getDato();
            Integer siguiente = (Integer) no.getDato();
            i = dato.compareTo(siguiente);
        }
       
       return i;
    }
}
