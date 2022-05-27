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
    class Circular
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



        private static bool MoverCulebritaCircular(ClsCCircular culebra, Point posiciónObjetivo,
            int longitudCulebra, Size screenSize)
        {
            var lastPoint = (Point)culebra.FinaColaCircular();

            if (lastPoint.Equals(posiciónObjetivo)) return true;

            if (culebra.ToString().Any(x => x.Equals(posiciónObjetivo))) return false;

            if (posiciónObjetivo.X < 0 || posiciónObjetivo.X >= screenSize.Width
                    || posiciónObjetivo.Y < 0 || posiciónObjetivo.Y >= screenSize.Height)
            {
                return false;
            }

            Console.BackgroundColor = ConsoleColor.Green;
            Console.SetCursorPosition(lastPoint.X + 1, lastPoint.Y + 1);
            Console.WriteLine(" ");

            culebra.insertar(posiciónObjetivo);

            Console.BackgroundColor = ConsoleColor.Red;
            Console.SetCursorPosition(posiciónObjetivo.X + 1, posiciónObjetivo.Y + 1);
            Console.Write(" ");

     
            if (culebra.Tam() > longitudCulebra)//
            {
                var removePoint = (Point)culebra.Eliminar();
                Console.BackgroundColor = ConsoleColor.Black;
                Console.SetCursorPosition(removePoint.X + 1, removePoint.Y + 1);
                Console.Write(" ");
            }
            return true;
        }

        private static Point ComidaCircular(Size screenSize, ClsCCircular culebra)
        {

            var lugarComida = Point.Empty;
            var cabezaCulebra = (Point)culebra.FinaColaCircular();
            var coor = cabezaCulebra.X;
            var rnd = new Random();
            do
            {
                var x = rnd.Next(0, screenSize.Width - 1);
                var y = rnd.Next(0, screenSize.Height - 1);
                if (culebra.ToString().All(p => coor != x || coor != y)
                    && Math.Abs(x - cabezaCulebra.X) + Math.Abs(y - cabezaCulebra.Y) > 8)
                {
                    lugarComida = new Point(x, y);
                    Console.Beep(659, 125);

                }

            } while (lugarComida == Point.Empty);

            Console.BackgroundColor = ConsoleColor.Red;
            Console.SetCursorPosition(lugarComida.X + 1, lugarComida.Y + 1);
            Console.Write(" ");
            return lugarComida;
        }


        public void jugarculebrita()
        {
            var punteo = 0;
            var velocidad = 100; 
            var posiciónComida = Point.Empty;
            var tamañoPantalla = new Size(60, 20);
            var culebrita = new ClsCCircular();
            var longitudCulebra = 5; 
            var posiciónActual = new Point(0, 9); 
            culebrita.insertar(posiciónActual);
            var dirección = Direction.Arriba; 

            DibujaPantalla(tamañoPantalla);
            MuestraPunteo(punteo);

            while (MoverCulebritaCircular(culebrita, posiciónActual, longitudCulebra, tamañoPantalla))
            {
                Thread.Sleep(velocidad);
                dirección = ObtieneDireccion(dirección);
                posiciónActual = ObtieneSiguienteDireccion(dirección, posiciónActual);

                if (posiciónActual.Equals(posiciónComida))
                {
                    posiciónComida = Point.Empty;
                    longitudCulebra += 3; 
                    punteo += 5; 
                    MuestraPunteo(punteo);
                    velocidad -= 5;
                }

                if (posiciónComida == Point.Empty) 
                {
                    posiciónComida = ComidaCircular(tamañoPantalla, culebrita);
                }
            }
            Console.ResetColor();
            Console.SetCursorPosition(tamañoPantalla.Width / 2 - 4, tamañoPantalla.Height / 2);
            Console.Beep(659, 125);
            Console.Write("FIN");
            Console.Beep(650, 2);
            Thread.Sleep(2000);
            Console.ReadKey();
        }
    }
}

