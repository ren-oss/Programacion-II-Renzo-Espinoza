import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"Punto({self.x}, {self.y})"

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea de {self.p1} a {self.p2}"

    def dibujalinea(self):
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], marker='o')
        plt.show()

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"

    def dibujacirculo(self):
        circle = plt.Circle((self.centro.x, self.centro.y), self.radio, color='blue', fill=False)
        fig, ax = plt.subplots()
        ax.add_artist(circle)
        ax.set_xlim((self.centro.x - self.radio - 1, self.centro.x + self.radio + 1))
        ax.set_ylim((self.centro.y - self.radio - 1, self.centro.y + self.radio + 1))
        ax.set_aspect('equal')
        plt.show()


p1 = Punto(1, 2)
p2 = Punto(4, 6)
linea = Linea(p1, p2)
print(linea)
linea.dibujalinea()

centro = Punto(5, 5)
circulo = Circulo(centro, 3)
print(circulo)
circulo.dibujacirculo()