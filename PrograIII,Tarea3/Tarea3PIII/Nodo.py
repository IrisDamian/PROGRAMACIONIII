class Nodo:
    def __init__(self, valor, izdo=None, dcho=None):
        self.dato = valor
        self.izdo = izdo
        self.dcho = dcho

    def ValorNodo(self):
        return self.dato

    def getSubarbolIzdo(self):
        return self.izdo

    def getSubarbolDcho(self):
        return self.dcho

    def NuevoValor(self, d):
        self.dato = d

    def setRamaIzdo(self, n):
        self.izdo = n

    def setRamaDcho(self, n):
        self.dcho = n