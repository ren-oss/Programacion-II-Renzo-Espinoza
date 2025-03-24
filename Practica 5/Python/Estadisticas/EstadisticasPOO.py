import math

class Estadisticas:
    def __init__(self, datos):
        self.datos = datos

    def calcular_promedio(self):
        return sum(self.datos) / len(self.datos)

    def calcular_desviacion(self):
        promedio = self.calcular_promedio()
        suma_cuadrados = sum((x - promedio) ** 2 for x in self.datos)
        return math.sqrt(suma_cuadrados / (len(self.datos) - 1))

def main():
    datos = list(map(float, input("Ingrese 10 números: ").split()))
    
    if len(datos) != 10:
        print("Debe ingresar exactamente 10 números.")
        return
    
    estadisticas = Estadisticas(datos)
    
    print(f"El promedio es {estadisticas.calcular_promedio():.2f}")
    print(f"La desviación estándar es {estadisticas.calcular_desviacion():.5f}")

main()