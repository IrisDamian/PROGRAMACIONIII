/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgListaPuntos;

/**
 *
 * @author Iris Damian
 */
public class Nodo {
    ClsAlumno dato;
    Nodo enlace;

    public Nodo() {
    }

    public Nodo(ClsAlumno dato) {
        this.dato = dato;
    }

    public Nodo(ClsAlumno dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

    public ClsAlumno getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

}