using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProCulebrita.ClasesC.Listas
{
    class ClsCCircular
    {
        public int final;
        private static int MAX = 90000;
        protected int inicio;
        int tamano;

        protected Object[] listaCola;

       
        private int Siguiente(int n)
        {
            return (n + 1) % MAX;
        }

        public ClsCCircular()
        {
            inicio = 0;
            final = MAX - 1;
            listaCola = new Object[MAX];
        }

        public bool Cola_Vacia()
        {
            return inicio == Siguiente(final);
        }
        
        public bool Cola_Llena()
        {
            return final == Siguiente(Siguiente(final));
        }


      

        public void insertar(Object elemento)
        {
            if (!Cola_Llena())
            {
                final = Siguiente(final);
                listaCola[final] = elemento;
                tamano++;
            }
            else
            {
                throw new Exception("OVERFLOW");
            }
        }


        public Object Eliminar()
        {
            if (!Cola_Vacia())
            {
                Object tm = listaCola[inicio];
                inicio = Siguiente(inicio);
                tamano--;
                return tm;
            }
            else
            {
                throw new Exception("LA COLA ESTA VACIA");
            }
        }


        public void BorrarCola()
        {
            inicio = 0;
            final = MAX - 1;
            listaCola = new Object[MAX];
        }


        public Object frenteCola()
        {
            if (!Cola_Vacia())
            {
                return listaCola[inicio];
            }
            else
            {
                throw new Exception("LA COLA ESTA VACIA");
            }
        }

        public Object FinaColaCircular()
        {

            if (!Cola_Vacia())
            {
                return listaCola[final];
            }
            else
            {
                throw new Exception("LA COLA ESTA VACIA");
            }

        }

        public int Tam()
        {
            return tamano;
        }

        public bool Any(Point dato)
        {
            int i = 0, cont = 0;
            bool flag;
            while (i <= final)
            {
                Point a = (Point)listaCola[i];
                flag = ((a.X == dato.X) && (a.Y == dato.Y));
                int z = (flag == true) ? cont++ : cont + 0;
            }
            return (cont != 0) ? true : false;
        }

    }
}
