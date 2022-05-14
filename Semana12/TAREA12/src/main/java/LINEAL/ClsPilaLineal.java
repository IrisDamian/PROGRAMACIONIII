/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LINEAL;

import java.util.ArrayList;

/**
 *
 * @author Iris Damian
 */
public class ClsPilaLineal {
    private static final int INICIAL = 19;
    private int cima;
    private ArrayList arraylistapila;

    public ClsPilaLineal() {
        cima = -1;
        arraylistapila = new ArrayList();
    }

    public void insertarElemento(Object elemento) throws Exception {
        cima++;
        arraylistapila.add(elemento);
    }

    public Object quitarCima() throws Exception {
        Object auxiliar;
        if (pilaVacia()) {
            throw new Exception("La pila esta vacia");
        }
        auxiliar = arraylistapila.get(cima);
        arraylistapila.remove(cima);
        cima--;
        return auxiliar;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("La pila esta Vacia");
        }
        return arraylistapila.get(cima);
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitarCima();
        }

    }
}
