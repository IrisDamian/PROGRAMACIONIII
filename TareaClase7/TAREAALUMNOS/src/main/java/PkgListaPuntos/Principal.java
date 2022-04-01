/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgListaPuntos;

import java.util.PrimitiveIterator;

/**
 *
 * @author Iris Damian
 */
public class Principal {
    public static void main (String[] args){
         
        Nodo nodo = new Nodo();
        ClsAlumno al = new ClsAlumno();
        ClsLista al2 = new ClsLista();

        al.setCarnet(" 00001 ");
        al.setNombre(" Jose Ramos ");
        al.setPromedio(89.1);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 00002 ");
        al.setNombre(" Leonel Ramirez ");
        al.setPromedio(93.5);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 00003 ");
        al.setNombre("Alejandra Recinos ");
        al.setPromedio(99.5);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 00004 ");
        al.setNombre("Humberto Ramos ");
        al.setPromedio(67.9);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 00005 ");
        al.setNombre("Pedro Monzon ");
        al.setPromedio(58.6);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 00006 ");
        al.setNombre("Matias Lemus ");
        al.setPromedio(54.2);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 00007 ");
        al.setNombre("Jazmin Roca  ");
        al.setPromedio(70.1);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 00008 ");
        al.setNombre("Matilde Palacios ");
        al.setPromedio(80.7);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 00009 ");
        al.setNombre("Byron Vargas ");
        al.setPromedio(76.4);
        al2.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.setCarnet(" 000010 ");
        al.setNombre("Camila Garcia ");
        al.setPromedio(85.5);
        al2.insertarCabezaLista(al);

        System.out.println("LISTA DE ALUMNOS");
        al2.visualizar();
        System.out.println("\n");

        System.out.println("BUSCAR LISTA");
        nodo = new Nodo();
        nodo =al2.buscarLista(" 00001 ");
        System.out.println("EL ESTUDIANTE ES:");
        System.out.println(nodo.getDato());
        System.out.println("\n");

        System.out.println("INSERTAR LISTA");
        al = new ClsAlumno();
        al.setCarnet(" 000011 ");
        al.setNombre(" Paola lemus ");
        al.setPromedio(60.9);
        al2.insertarLista(" 000010 ", al);
        al2.visualizar();
        System.out.println("\n");

        System.out.println("BUSCAR POSICION");
        nodo = new Nodo();
        nodo = al2.buscarPosicion(4);
        System.out.println("EL ESTUDIANTE ES:");
        System.out.println(nodo.getDato());
        System.out.println("\n");

        System.out.println("BORRAR ALUMNO");
        nodo = new Nodo();
        String carnet = " 000011 ";
        nodo = al2.buscarLista(carnet);
        al2.eliminar(carnet);
        System.out.println("EL ALUMNO ES  \n" + nodo.getDato() + "\n");
        System.out.println("LISTA NUEVA");
        al2.visualizar();
        System.out.println("\n");

        System.out.println("INSERTAR ALUMNO DE ULTIMO");
        al = new ClsAlumno();
        al.setCarnet(" 000012 ");
        al.setNombre(" Edgar Perez ");
        al.setPromedio(70.5);
        al2.insertarUltimo(nodo.getEnlace().getEnlace(), al);
        al2.visualizar();
    }
}