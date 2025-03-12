class Pila:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.top = -1

    def insert(self, e):
        if not self.isFull():
            self.top += 1
            self.arreglo[self.top] = e
        else:
            print(f"Pila llena. No se puede insertar {e}")

    def pop(self):
        if not self.isEmpty():
            elemento = self.arreglo[self.top]
            self.top -= 1
            return elemento
        else:
            print("Pila vacía. No se puede extraer elemento.")
            return None

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.top]
        else:
            print("Pila vacía. No hay elemento en la cima.")
            return None

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1


# Ejemplo de uso
pila = Pila(5)
pila.insert(10)
pila.insert(20)
pila.insert(30)
print("Elemento en la cima:", pila.peek())
print("Elemento extraído:", pila.pop())
print("¿Está vacía?", pila.isEmpty())
pila.pop()
print("Tope de la pila después de pop:", pila.peek())