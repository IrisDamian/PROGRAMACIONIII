using ProCulebrita.ClasesC.Listas;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ProCulebrita.ClasesC.Culebritas
{
    class Lista
    {
        internal enum Direction
        {
            Abajo, Izquierda, Derecha, Arriba
        }

        private static void DibujaPantalla(Size size)
        {
            Console.Title = "BIENVENIDO AL JUEGO SNAKE";
            Console.WindowHeight = size.Height + 2;
            Console.WindowWidth = size.Width + 2;
            Console.BufferHeight = Console.WindowHeight;
            Console.BufferWidth = Console.WindowWidth;
            Console.CursorVisible = false;
            Console.BackgroundColor = ConsoleColor.Yellow;
            Console.Clear();
            Console.BackgroundColor = ConsoleColor.Black;
            for (int row = 0; row < size.Height; row++)
            {
                for (int col = 0; col < size.Width; col++)
                {
                    Console.SetCursorPosition(col + 1, row + 1);
                    Console.Write(" ");
                }
            }
        }

        private static void MuestraPunteo(int punteo)
        {
            Console.BackgroundColor = ConsoleColor.White;
            Console.ForegroundColor = ConsoleColor.Black;
            Console.SetCursorPosition(1, 0);
            Console.Write($"PUNTUACION {punteo.ToString("00000000")}");
        }

        private static Direction ObtieneDireccion(Direction direccionAcutal)
        {
            if (!Console.KeyAvailable) return direccionAcutal;

            var tecla = Console.ReadKey(true).Key;
            switch (tecla)
            {
                case ConsoleKey.DownArrow:
                    if (direccionAcutal != Direction.Arriba)
                        direccionAcutal = Direction.Abajo;
                    break;
                case ConsoleKey.LeftArrow:
                    if (direccionAcutal != Direction.Derecha)
                        direccionAcutal = Direction.Izquierda;
                    break;
                case ConsoleKey.RightArrow:
                    if (direccionAcutal != Direction.Izquierda)
                        direccionAcutal = Direction.Derecha;
                    break;
                case ConsoleKey.UpArrow:
                    if (direccionAcutal != Direction.Abajo)
                        direccionAcutal = Direction.Arriba;
                    break;
            }
            return direccionAcutal;
        }

        private static Point ObtieneSiguienteDireccion(Direction direction, Point currentPosition)
        {
            Point siguienteDireccion = new Point(currentPosition.X, currentPosition.Y);
            switch (direction)
            {
                case Direction.Arriba:
                    siguienteDireccion.Y--;
                    break;
                case Direction.Izquierda:
                    siguienteDireccion.X--;
                    break;
                case Direction.Abajo:
                    siguienteDireccion.Y++;
                    break;
                case Direction.Derecha:
                    siguienteDireccion.X++;
                    break;
            }
            return siguienteDireccion;
        }


        private static Point ComidaLista(Size screenSize, ClsCLista culebra)
        {
            var lugarComida = Point.Empty;
            var cabezaCulebra = (Point)culebra.FinalCola();
            var rnd = new Random();

            var Px = cabezaCulebra.X;
            var Py = cabezaCulebra.Y;
            {
                var x = rnd.Next(0, screenSize.Width - 1);
                var y = rnd.Next(0, screenSize.Height - 1);
                if (culebra.ToString().Any(p => Px != x || Py != y)
                    && Math.Abs(x - cabezaCulebra.X) + Math.Abs(y - cabezaCulebra.Y) > 8)
                {
                    lugarComida = new Point(x, y);
                    Console.Beep(659, 125);
                }

            } while (lugarComida == Point.Empty) ;

            Console.BackgroundColor = ConsoleColor.Blue;
            Console.SetCursorPosition(lugarComida.X + 1, lugarComida.Y + 1);
            Console.Write(" ");

            return lugarComida;
        }

        private static bool MoverCulebritaLista(ClsCLista culebra, Point posiciónObjetivo,
           int longitudCulebra, Size screenSize)
        {

            var lastPoint = (Point)culebra.FinalColaLista();

            int pausa = 0;
            if (lastPoint.Equals(posiciónObjetivo)) return true;

            if (culebra.ToString().Any(x => x.Equals(posiciónObjetivo))) return false;
           

            if (posiciónObjetivo.X < 0 || posiciónObjetivo.X >= screenSize.Width
                    || posiciónObjetivo.Y < 0 || posiciónObjetivo.Y >= screenSize.Height)
            {
                return false;
            }

            Console.BackgroundColor = ConsoleColor.Blue;
            Console.SetCursorPosition(lastPoint.X + 1, lastPoint.Y + 1);
            Console.WriteLine(" ");

            culebra.Insertar(posiciónObjetivo);
            int pausa1 = 0;
            Console.BackgroundColor = ConsoleColor.White;
            Console.SetCursorPosition(posiciónObjetivo.X + 1, posiciónObjetivo.Y + 1);
            Console.Write(" ");

        
            if (culebra.ElementosLista() > longitudCulebra)
            {
                var removePoint = (Point)culebra.Eliminar();
                Console.BackgroundColor = ConsoleColor.Black;
                Console.SetCursorPosition(removePoint.X + 1, removePoint.Y + 1);
                Console.Write(" ");
            }
            return true;
        }

        public void jugarculebrita()
        {
            var punteo = 0;
            var velocidad = 100; 
            var posiciónComida = Point.Empty;
            var tamañoPantalla = new Size(60, 20);
            var culebrita = new ClsCLista();
            var longitudCulebra = 3; 
            var posiciónActual = new Point(0, 9); 
            culebrita.Insertar(posiciónActual);
            var dirección = Direction.Arriba; 

            DibujaPantalla(tamañoPantalla);
            MuestraPunteo(punteo);

            while (MoverCulebritaLista(culebrita, posiciónActual, longitudCulebra, tamañoPantalla))
            {
                Thread.Sleep(velocidad);
                dirección = ObtieneDireccion(dirección);
                posiciónActual = ObtieneSiguienteDireccion(dirección, posiciónActual);

                if (posiciónActual.Equals(posiciónComida))
                {
                    posiciónComida = Point.Empty;
                    longitudCulebra++; 
                    punteo += 5; 
                    MuestraPunteo(punteo);
                    velocidad -= 10;

                }

                if (posiciónComida == Point.Empty) 
                {
                    posiciónComida = ComidaLista(tamañoPantalla, culebrita);
                }
            }
            Console.ResetColor();
            Console.SetCursorPosition(tamañoPantalla.Width / 2 - 4, tamañoPantalla.Height / 2);
            Console.Beep(659, 125);
            Console.Write("FIN");
            Thread.Sleep(2000);
            Console.ReadKey();
        }
    }
}
