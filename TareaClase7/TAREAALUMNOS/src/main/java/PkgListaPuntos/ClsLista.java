/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgListaPuntos;

import java.util.Scanner;

/**
 *
 * @author Iris Damian
 */
public class ClsLista {
    public Nodo primero;
    
    public ClsLista(){
        primero = null;
    }
    
    private int leerEntero(){
    System.out.println("Ingresa valor, -1 para terminar");
    return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    
    public ClsLista crearLista(){
        ClsAlumno al = new ClsAlumno();
        primero = null;
        int x;
        do {
            x = leerEntero();
            if (x != -1) {
                primero = new Nodo(al, primero);
            }
        } while (x != -1);
        return this;
    }
    
    public ClsLista insertarCabezaLista(ClsAlumno entrada){
        Nodo nuevo;
        nuevo= new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    
    public void visualizar(){
        Nodo n;
        int k = 0;
        n = primero;
        while (n !=null){
            System.out.println(n.dato+"");
            n = n.enlace;
            k++;
            System.out.print((k%15 !=0 ? " ": "\n"));
          
        }
                
    }
    
    public ClsLista insertarUltimo(Nodo ultimo, ClsAlumno entrada){
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return this;
    }
    
    public Nodo buscarLista(String carnet){
        Nodo indice;
        for (indice = primero; indice !=null; indice= indice.enlace){
            if ((carnet.equals(indice.dato.getCarnet()))) {
                return indice;
            }
        }
        return null;
  
    }
    
    public ClsLista insertarLista(String carnetIl, ClsAlumno entrada){
        Nodo nuevo, anterior;
        anterior = buscarLista(carnetIl);
        if (anterior !=null){
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
        
    }
    
    public Nodo buscarPosicion(int posicion){
        Nodo indice;
        int i;
        if(posicion < 0){
            return null;
        }
        indice= primero;
        for (i=1; (i<posicion)&&(indice !=null);i++){
            indice = indice.enlace;
        }
        return indice;
    }
    
    
    public void eliminar (String carnet){
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        
        while ((actual !=null)&&(!encontrado)){
            encontrado = (actual.dato.getCarnet().equals(carnet));
            if (!encontrado){
                anterior = actual;
                actual = actual.enlace;
            }
        }
            
            if (actual != null) {
            if (actual == primero){
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
}


 


         
            
            
            
        
    

