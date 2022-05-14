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
public class Nodo {
    Object elemento;
    Nodo siguiente;

    Nodo(Object element) {
        elemento = element;
        siguiente = null;
    }
}
