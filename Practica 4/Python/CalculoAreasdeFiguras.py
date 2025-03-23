import math
from multimethod import multimethod
class CalcularArea:

    def calcular_area(self, *args):
        if len(args) == 1:  # Círculo (radio)
            radio = args[0]
            return math.pi * radio ** 2
        
        elif len(args) == 2:  # Rectángulo o Triángulo
            base, altura = args
            return base * altura  # Para rectángulo
            # Para triángulo, dividir entre 2 (se manejará fuera si es necesario)
        
        elif len(args) == 3:  # Trapecio
            base_mayor, base_menor, altura = args
            return ((base_mayor + base_menor) * altura) / 2
        
        elif len(args) == 2 and isinstance(args[1], float):  # Pentágono (lado, apotema)
            lado, apotema = args
            return (5 * lado * apotema) / 2
        
        else:
            raise ValueError("Número de argumentos inválido o incorrectos")

# Uso de la clase
area_calc = CalcularArea()

# Cálculo de áreas
print("Área del círculo:", area_calc.calcular_area(5))          # Círculo
print("Área del rectángulo:", area_calc.calcular_area(4, 6))    # Rectángulo
print("Área del triángulo:", area_calc.calcular_area(3, 7) / 2) # Triángulo
print("Área del trapecio:", area_calc.calcular_area(8, 5, 4))   # Trapecio
print("Área del pentágono:", area_calc.calcular_area(6, 4.0))   # Pentágono