/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 * Declaracion de la clase Ordenamiento
 * @author Ingrid Paola Lopez Niño, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
public class Ordenamiento {
    /**
     * Metodo que regresa un arreglo de nodo
     * @param metodo Es un parametro de tipo cadena
     * @param array Es un parametro de tipo Arreglo de nodo
     */
    public Nodo [] eleccion (String metodo, Nodo [] array)
    {
        Nodo [] nfinal;
        if (metodo.equalsIgnoreCase("burbuja")){
            nfinal = metodoBurbuja(array);
        }else if (metodo.equalsIgnoreCase("burbuja_con_señal")){
            nfinal = burubujaConSeñal(array);
        }else if (metodo.equalsIgnoreCase("baraja")){
            nfinal = baraja(array);
        }else if (metodo.equalsIgnoreCase("baraja_con_bb")){
            nfinal = barajaConBusquedaBinaria(array);
        }else if (metodo.equalsIgnoreCase("shaker")){
            nfinal = shaker(array);
        }else if (metodo.equalsIgnoreCase("seleccion_directa")){
            nfinal = seleccionDirecta(array);
        }else if (metodo.equalsIgnoreCase("shell")){
            nfinal = shell(array);
        }else {
            nfinal = quickSort(array);
        }   
        return nfinal;
    }
    /**
     * Metodo de la burbuja que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    public Nodo [] metodoBurbuja (Nodo [] array)
    {        
        Nodo aux; 

        for (int i = 1; i < array.length; i++)
        {
            for (int j = array.length-1; j >= i; j-- )
            {
                if (array [j-1].compareTo(array[j]) > 0){
                    aux = array[j-1];
                    array[j-1] = array[j];
                    array[j]=aux;
                }
            }
        }

        return array; 
    }
    /**
     * Metodo de la burbuja con señal que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    public Nodo [] burubujaConSeñal (Nodo [] array)
    {
        Nodo aux; 
        int i=0;
        boolean band = false;

        while (i < array.length-1 && band == false){
            band = true;
            for (int j = 0; j<array.length-i-1; j++ )
            {
                if (array [j].compareTo(array [j+1]) > 0){
                    aux = array [j];
                    array[j] = array [j+1];
                    array [j+1] = aux;
                    band = false;
                }
            }
            i++;
        }

        return array;
    }  
    /**
     * Metodo de la baraja que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    public Nodo [] baraja(Nodo [] array){
        int i,k;
        Nodo aux;

        for (i = 1; i<array.length; i++){
            aux = array [i];
            k = i-1;
            while ((aux.compareTo(array[k]) < 0) && k>0)
            {
                array[k+1]=array[k];
                k = k-1;
            }
            if ((array [k].compareTo(aux))<0 || (array [k].compareTo(aux)) == 0){
                array [k+1]=aux;
            }else {
                array [k+1] = array[k];
                array [k] = aux;
            }
        }
        return array;
    }
    /**
     * Metodo de la baraha con busqueda binaria que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    public Nodo [] barajaConBusquedaBinaria(Nodo [] array){
        int i, izq, der, m,j;
        Nodo aux;

        for (i = 1; i<array.length; i++)
        {
            aux = array[i];
            izq = 0;
            der = i -1;
            while (izq <= der)
            {
                m = (izq+der)/2;
                if (aux.compareTo(array[m])<0){
                    der = m-1;
                }else {
                    izq = m +1;
                }
            }
            j = i -1;
            while (j>= izq){
                array[j+1] = array[j];
                j = j-1;
            }
            array [izq]=aux;
        }

        return array;
    } 
    /**
     * Metodo shell que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    public Nodo [] shell( Nodo [] array)
    {
        int inta , i;
        boolean band;
        Nodo aux;
        inta = array.length;

        while (inta > 0)
        {
            inta = inta/2;
            band = true;

            while (band)
            {
                band = false;
                i = 0;
                while ((i + inta) <= array.length-1){
                    if (array[i].compareTo(array[i + inta])>0)
                    {
                        aux = array [i];
                        array[i] = array [i + inta];
                        array [i + inta] = aux;
                        band = true;
                    }
                    i = i+1;
                }
            }
        }   
        return array;
    }
    /**
     * Metodo shaker que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    public Nodo [] shaker (Nodo [] array) {
        int i, izq, der, k;
        Nodo aux;
        izq = 1;
        der = array.length -1;
        k = array.length -1;

        while (izq <= der)
        {
            for (i = der; i >= izq; i--){
                if (array[i-1].compareTo(array [i])>0){
                    aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    k = i;
                }
            }

            izq = k+1;

            for (i = izq; i<=der; i++){
                if (array[i-1].compareTo(array [i])>0){
                    aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    k = i;
                }
            }

            der = k-1;
        }
        return array;
    }
    /**
     * Metodo seleccion directa que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    public Nodo [] seleccionDirecta(Nodo [] array){
        int i,k,j;
        Nodo menor;
        for (i = 0; i<array.length-1;i++){
            menor = array [i];
            k=i;
            for (j=i+1; j<array.length; j++){
                if ((array[j].compareTo(menor))<0){
                    menor = array[j];
                    k = j;
                }
            }
            array [k]=array[i];
            array [i]=menor;

        }

        return array;
    }
    /**
     * Metodo quicksort que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    private Nodo [] _quickSort(Nodo [] array,int ini, int fin){
        int izq, der, pos;
        Nodo aux;
        boolean band;
        
        izq = ini;
        der = fin;
        pos = ini;
        band = true;
        
        while(band){
            band = false;
            while((array[pos].compareTo(array [der])<0) || (array[pos].compareTo(array [der])==0) && (pos != der)){
                der = der-1;
            }
            if (pos != der){
                aux = array[pos];
                array [pos] = array[der];
                array [der]=aux;
                pos = der;
                while((array[pos].compareTo(array [izq])>0) || (array[pos].compareTo(array [izq])==0) && (pos != izq)){
                    izq = izq +1;
                }
                if (pos != izq)
                {
                    band = true;
                    aux = array[pos];
                    array[pos]= array[izq];
                    array [izq] = aux;
                    pos = izq;
                }
            }
        }
        if ((pos-1)>ini)
        {
            _quickSort(array,ini,pos-1);
        }
        if (fin > (pos+1)){
             _quickSort(array,pos+1,fin);
        }
              
        return array;
    }
    /**
     * Metodo recursivo quicksort que regresa un arreglo de nodo
     * @param array Es un parametro de arreglo de nodo
     */
    public Nodo [] quickSort(Nodo [] array){
    
        _quickSort(array,0,array.length-1);
        return array;
    }
}


