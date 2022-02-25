from Nodo import *


class Arbol:
    def __init__(self, raiz=None):
        self.raiz = raiz

    def Insertar(self, dato, padre=None):
        if padre == None:
            if self.raiz == None:
                self.raiz = Nodo(dato)
            else:
                self.Insertar(dato, self.raiz)
        else:
            if dato > padre.ValorNodo():
                if padre.getSubarbolDcho() == None:
                    padre.setRamaDcho(Nodo(dato))
                else:
                    if padre.getSubarbolIzdo() == None:
                        padre.setRamaIzdo(Nodo(dato))
                    else:
                        self.Insertar(dato, padre.getSubarbolIzdo())
