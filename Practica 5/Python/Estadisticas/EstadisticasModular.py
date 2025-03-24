import math

def calcular_promedio(numeros):
    return sum(numeros) / len(numeros)

def calcular_desviacion(numeros, promedio):
    suma_cuadrados = sum((x - promedio) ** 2 for x in numeros)
    return math.sqrt(suma_cuadrados / (len(numeros) - 1))

def main():
    datos = list(map(float, input("Ingrese 10 números: ").split()))
    
    if len(datos) != 10:
        print("Debe ingresar exactamente 10 números.")
        return
    
    promedio = calcular_promedio(datos)
    desviacion = calcular_desviacion(datos, promedio)
    
    print(f"El promedio es {promedio:.2f}")
    print(f"La desviación estándar es {desviacion:.5f}")

main()