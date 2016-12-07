/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 * Declaracion de la clase Objeto
 * @author Ingrid Paola Lopez Niño, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
import java.io.*;
import java.util.*;
public class Objeto {
    String  nombre;
    ArrayList<String> atributos = new ArrayList<String>();
    
    public Objeto(){
        
    }
    /**
     * Constructor de la clase Objeto
     * @param objeto
     * @param tipos
     */
    public Objeto(String objeto,ArrayList<String> tipos)
    {
        nombre=objeto;
        atributos=tipos;
    }
    /**
     * Metodo que devuelve un String
     * @return va
     */
    public String getRegistro(){
        String va="";
    for(int x=0;x<atributos.size();x++)
        va+=atributos.get(x);
    return va;
    }
    /**
     * Metodo que regresa el nombre del Objeto
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que no devuelve nada y tiene un parametro
     * @param nombre Es un parametro de tipo cadena
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que regresa el ArrayList de los atributos 
     * @return atributos
     */
    public ArrayList<String> getAtributos() {
        return atributos;
    }
    /**
     * Metodo que no regresa nada y tiene un parametro
     * @param atributos Es un parametro de ArrayList de tipo String
     */
    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    
    
    /*public int compararNodos(Nodo co)
    {
        int compa = 0;
        Nodo temporal = atributos.getInicio();
        
  
        while (temporal != null)
        {
            if(temporal.compareTo(co) == 0)
            {
                compa = 0;
                break;
            }
            temporal = temporal.getSiguiente();
        }
        
        if (temporal == null)
        {
            compa = 1;
        }
        
        return compa;
    }
     
    
     
    public void salidaDatosObjeto(PrintWriter out)
    {
        Nodo temporal = atributo.getInicio();
        String s="|   ";
        
        while (temporal != null){
           String mo = ""+temporal.getDato();
           s += String.format("%-12s",mo);
           temporal = temporal.getSiguiente();
        }
        
        s += "   |";
        
        out.println(s);
    }*/
    /**
     * Metodo que regresa en un String los datos de la clase
     * @return s
     */
    public String toString ()
    {
        String s="";
        for(int x=0;x<atributos.size();x++){
        s += atributos.get(x);
        }
        return s;
    }
}
