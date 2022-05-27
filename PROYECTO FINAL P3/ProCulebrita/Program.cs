using ProCulebrita.ClasesC.Culebritas;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProCulebrita
{
    class Program
    {

        static void Menu()
        {
            int Opc;
            Console.WriteLine("Elige una opcion para jugar\n\n");

            Console.WriteLine("Escribe 0 para jugar Circular");
            Console.WriteLine("Escribe 1 para jugar Lineal");
            Console.WriteLine("Escribe 2 para jugar Lista");
            Console.WriteLine("Escribe 3 para jugar Lista Enlazada");
            Opc = int.Parse(Console.ReadLine());

            switch (Opc)
            {
                
                case 0: opc1(); break;
                case 1: opc2(); break;
                case 2: opc3(); break;
                case 3: opc4(); break;
                case 4: return;
            }
        }

        static void opc1()
        {
            Console.BackgroundColor = ConsoleColor.Red;
            opc11();
        }

       
        static void opc2()
        {
            Console.BackgroundColor = ConsoleColor.White;
            opc22();
        }

     
        static void opc3()
        {
            Console.BackgroundColor = ConsoleColor.White;
            opc33();
        }

       
        static void opc4()
        {
            Console.BackgroundColor = ConsoleColor.Red;
            opc44();
        }

        static void opc11()
        {
            Circular jugar = new Circular();
            jugar.jugarculebrita();
        }

        static void opc22()
        {
            Lineal jugar = new Lineal();
            jugar.jugarculebrita();

        }
        static void opc33()
        {
            Lista jugar = new Lista();
            jugar.jugarculebrita();

        }
        static void opc44()
        {
            ListaEnlazada jugar = new ListaEnlazada();
            jugar.jugarculebrita();
        }

        static void Main()
        {
            Menu();
        }

    }
}
