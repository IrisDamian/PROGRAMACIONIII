using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProCulebrita.ClasesC.Nodos
{
    class Nodo
    {
        public Object elemento;
        public Nodo siguiente;

        public Nodo(Object dato)
        {
            elemento = dato;
            siguiente = null;
        }
    }
}
