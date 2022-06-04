/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafosPkg;

/**
 *
 * @author Ruldin Ayala
 * Preguntas:
 * Para qué sirve la implementación Comparable?
 * y porqué es de tipo Nodo
 */



//implementamos la comparacion y damos los parametros
public class Nodo implements Comparable<Nodo> {
    char id;
    int  distancia   = Integer.MAX_VALUE;
    Nodo procedencia = null;
    
    public Nodo(char x, int d, Nodo p) { 
        id=x; distancia=d; procedencia=p; 
    }
    
    //hacemos referencia a nuestro objeto actual
    public Nodo(char x) { 
        this(x, 0, null); 
    }
    
    //este metodo nos ayuda para comparar entre cadenas
    // y asi nos indicara que cadena es mayor que otra
    public int compareTo(Nodo tmp) { 
        return this.distancia-tmp.distancia; 
    }
    
    //comparamos si los objetos son equivalentes en su mismo tipo de datos
    //retornando si lo fueran o no
    public boolean equals(Object o) {
        Nodo tmp = (Nodo) o;
        if(tmp.id==this.id) return true;
        return false;
    }
}
