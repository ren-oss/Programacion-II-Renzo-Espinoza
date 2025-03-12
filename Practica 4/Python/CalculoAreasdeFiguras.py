import math

class CalcularArea:
    # Area del circulo
    def calc_area(radio: float):
        return math.pi * radio ** 2
    
    # Area del rectángulo
    def calc_area(base:float,altura:int):
        return base * altura
    
    # Area del triangulo rectángulo
    def calc_area(base:int,altura:int):
        return (base*altura) / 2
        
    # Area del trapecio
    def calc_area(base:float,B:float):
        return ((B+base)/2)*2
        
    # Area del pentagono
    def calc_area(lado:int,apotema:float):
        return (5*lado*apotema) / 2

# Usos
calcarea = CalcularArea()
print("Área del círculo:", calcarea.calc_area(2.3) )
print("Área del rectángulo:", area_calc.calcular_rectangulo(4, 6))
print("Área del triángulo:", area_calc.calcular_triangulo(3, 7))
print("Área del trapecio:", area_calc.calcular_trapecio(8, 5, 4))
print("Área del pentágono:", area_calc.calcular_pentagono(6, 4))