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
public class ClsAlumno {
    public String carnet;
    public String nombre;
    double promedio;
    
     public ClsAlumno() {
    }

    public ClsAlumno(String nombre, String carnet, double promedio) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.promedio = promedio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "  Carnet:" + carnet + " Promedio:" + promedio;
    }
}
