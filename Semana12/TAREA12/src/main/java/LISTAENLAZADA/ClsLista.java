/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISTAENLAZADA;

/**
 *
 * @author Iris Damian
 */
public class ClsLista {
     private Nodo cima;

    public ClsLista() {
        cima = null;
    }

    public boolean pilaVacia() {
        return cima == null;
    }

    public void insertar(Object elemento) {
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Object quitar() throws Exception {
        if (pilaVacia()) {
            throw new Exception("La pila esta vacia");
        }
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("No se puede leer");
        }
        return cima.elemento;
    }

    public void limpiarPila() {
        Nodo t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
}
