/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 * Declaracion de la clase generica Tabla
 * @author Ingrid Paola Lopez Niño, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
import java.io.*;
import java.util.*;
public class Tabla<T> {
    private String nombre;
    
   
   Objeto registro = new Objeto();
    ListaLigada<Objeto> registros;
   public Tabla (String nombre){
       this.nombre = nombre;
       registros= new ListaLigada<Objeto>();   
   }
    /**
     * Metodo que regresa una Lista Ligada
     * @return registros
     */
    public ListaLigada<Objeto> getRegistros() {
        return registros;
    }
    /**
     * Metodo que no regresa nada y tiene un parametro
     * @param registros Es un parametro de Lista Ligada de tipo Objeto
     */
    public void setRegistros(ListaLigada<Objeto> registros) {
        this.registros = registros;
    }
    /**
     * Metodo que no devuelve nada y tiene un parametro
     * @param registro Es un parametro de tipo Objeto
     */
   public void agregarRegistro(Objeto registro){
       Nodo re = new Nodo( registro);
       registros.insertar(re);
   }

    

   /**
    * Constructor de la clase Tabla
    * @param nombre
    * @param ob1
    */
   public Tabla (String nombre, Objeto ob1){
       this.nombre = nombre;
       ob1 = ob1;
       
       //registro.insertar(null);
       //titulos = separarDatos(datos);
       //asignarIndiceTabla();
   
   }
   
   /*public ListaLigada separarDatos( ArrayList<String>  datos){
       ListaLigada auxi=new ListaLigada();
       
       for (int i=2; i<datos.length;i++)
       {
            String [] aux = datos[i].split(":");
            tipos [i-2] = aux[1] ;
            auxi.insertar(new Nodo(aux[0]));
       }
       return auxi;
   }*porque no se usa*/

    /**
     * Metodo que regresa un Objeto
     * @return registro
     */
    public Objeto getRegistro() {
        return registro;
    }
    /**
     * Metodo que no regresa nada y tiene un parametro
     * @param registro Es un parametro de tipo Objeto
     */
    public void setRegistro(Objeto registro) {
        this.registro = registro;
    }
   /**
    * Metodo que regresa el nombre de a tabla
    * @return nombre
    */   
   public String getNombre()
   {
       return nombre;
   }
   
   /*public void insertarDato(String objeto)
   {
       objetos.insertar(new Nodo (new Objeto(objeto,tipos)));
   }
   
   public String getDatosObjeto(){
       return  objetos.toString();
   }
   
   
   
   public String toString()
   {
       String  salida;
       Nodo temporal = objetos.getInicio();
       Nodo temporal2 = titulos.getInicio();  
       salida = titulos.toString();
       return salida;
   }
   
   public void getIdices(PrintWriter out){
       Nodo temporal = titulos.getInicio();
       
       out.println("--- Indices ---");
       while (temporal != null)
       {
           out.println(temporal.getIndice() + "._ " + temporal.getDato());
           temporal = temporal.getSiguiente();
       }
   }
   
   public Nodo [] buscarNodos(int indice){
      Nodo temporal = objetos.getInicio();
      Nodo [] nodos = new Nodo[objetos.tamaño()];
      int i=0;
       
      while (temporal != null)
       {
           nodos[i] = temporal.getObjeto().buscarAtributo(indice);
           i++;
           temporal = temporal.getSiguiente();
      }
      
      return nodos;
   }
   */
   /**
    * Metodo que no regresa nada y acciona en los datos ordenados
    * @param array Es un arreglo de Nodo
    * @param out Es un parametro de la clase PrintWriter
    */
   public void datosOrdenados(Nodo [] array,PrintWriter out )
   {
       Nodo [] arrays = array;
       
       System.out.println("---- Datos ordenados ----");
       
       for(Nodo no : array)
       {
           String aux = "| "+no.getDato();
           String finalS = String.format("%-12s%s",aux," |");
           out.println(finalS);
       }
   }
    
}
