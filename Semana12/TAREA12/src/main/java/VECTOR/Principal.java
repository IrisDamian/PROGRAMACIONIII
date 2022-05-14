/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VECTOR;

import LINEAL.ClsPilaLineal;
import LISTAENLAZADA.ClsLista;
import java.io.*;



/**
 *
 * @author Iris Damian
 */
public class Principal {
     
   static void arrayListPila() {
       
      ClsPilaLineal arrayList = new ClsPilaLineal();
      int numElementos;
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Escriba el numero de elementos:");
      try {
           numElementos = Integer.parseInt(entrada.readLine());
           for (int i = 1; i <= numElementos; i++) {
               System.out.println("Elemento No." + i + ": ");
               Double numValor;
               numValor = Double.valueOf(entrada.readLine());
               arrayList.insertarElemento(numValor);
            } 
            System.out.println("Elementos de la pila:");
            while (!arrayList.pilaVacia()) {
                Double numero;
                numero = (Double) arrayList.quitarCima();
                if (numero > 0.0) {
                System.out.println(numero);
                }
            }
        }
            catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    static void listaEnlazadaPila() {
        ClsLista pila;
        int numElementos;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("No. de elementos para usar(Termina con -1):");
        try {
            pila = new ClsLista();
            do {
                numElementos = Integer.parseInt(entrada.readLine());
                pila.insertar(numElementos);
            } while (numElementos != CLAVE);

            System.out.println("Elementos de la lista enlazada ");
            while (!pila.pilaVacia()) {
                numElementos = (Integer) (pila.quitar());
                System.out.println(numElementos + " ");
            }

        } 
            catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        System.out.println("Arraylist");
        arrayListPila();
        System.out.println("\nLista enlazada");
        listaEnlazadaPila();
    }
}
   
