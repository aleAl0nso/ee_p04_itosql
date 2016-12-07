package Graficos;

/**
 * Declaracion de la clase generica Atributos
 * @author Ingrid Paola Lopez Niño, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
public class Atributos<T> {
    private String nomAtributo;
    private T dato;
    /**
     * @param nom Es un parametro de tipo String donde le pasamos el nombre del atributo
     * @param da Es un parametro de tipo T donde le podemos pasar cualquier dato
     */
    public void Atributos(String nom, T da){
        nomAtributo = nom;
        dato = da;
    }
    /**
     * Este metodo nos devuelve un String que es el nombre del Atributo
     * @return nomAtributo 
     */
    public String getNomAtributo() {
        return nomAtributo;
    }
    /**
     * Este metodo no devuelve nada pero le pasamos un parametro
     * @param nomAtributo
     */
    public void setNomAtributo(String nomAtributo) {
        this.nomAtributo = nomAtributo;
    }
    /**
     * Este metodo nos devuelve un dato generico que es el dato
     * @return dato
     */
    public T getDato() {
        return dato;
    }
    /**
     * Este metodo no regresa nada pero nos pide un parametro
     * @param dato Es un parametro de tipo generico
     */
    public void setDato(T dato) {
        this.dato = dato;
    }
}
