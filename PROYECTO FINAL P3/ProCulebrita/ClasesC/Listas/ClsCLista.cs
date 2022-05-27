using ProCulebrita.ClasesC.Nodos;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProCulebrita.ClasesC.Listas
{
    class ClsCLista
    {
        public Nodo primero;
        public Nodo ultimo;
        int tam;

       
        public ClsCLista()
        {
            primero = ultimo = null;
        }

        public bool ColaVacia()
        {
            return (primero == null);
        }

        
        public void Insertar(Object elemento)
        {
            Nodo nuevo;
            nuevo = new Nodo(elemento);

            if (ColaVacia())
            {
                primero = nuevo;
            }
            else
            {
                ultimo.siguiente = nuevo;
            }
            ultimo = nuevo;
            tam++;
        }

        public Object Eliminar()
        {
            Object aux;
            if (!ColaVacia())
            {
                aux = primero.elemento;
                primero = primero.siguiente;
                tam--;
            }
            else
            {
                throw new Exception("LA COLA SE ENCUENTRA VACIA");
            }
            return aux;
        }

        public void ElimCola()
        {
            for (; primero != null;)
            {
                primero = primero.siguiente;
            }
        }

        
        public Object InCola()
        {
            if (ColaVacia())
            {
                throw new Exception("LA COLA SE ENCUENTRA VACIA");
            }
            return (primero.elemento);
        }

        public Object FinalCola()
        {
            if (ColaVacia())
            {
                throw new Exception("LA COLA SE ENCUENTRA VACIA");
            }
            return (ultimo.elemento);
        }

        public Object FinalColaLista()
        {
            if (!ColaVacia())
            {
                return (ultimo.elemento);
            }
            else
            {
                throw new Exception("LA COLA SE ENCUENTRA VACIA");
            }
        }

        public int ElementosLista()
        {
            int n;
            Nodo a = primero;

            if (ColaVacia())
            {
                n = 0;
            }
            else
            {
                n = 1;
                while (a != ultimo)
                {
                    n++;
                    a = a.siguiente;
                }
            }
            return n;
        }

        public bool Any(Point dato)
        {
            int i = 0, cont = 0;

            Nodo aux = primero;
            bool flag;
            while (aux != null)
            {
                Point a = (Point)aux.elemento;
                flag = ((a.X == dato.X) && (a.Y == dato.Y));
                int z = (flag == true) ? cont++ : cont + 0;
                i++;
                aux = aux.siguiente;
            }
            return (cont != 0) ? true : false;
        }
    }
}
