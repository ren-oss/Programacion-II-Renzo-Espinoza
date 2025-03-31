class AlgebraVectorial:
    def __init__(self, *args):
        if len(args) == 0:
            self.x = 0
            self.y = 0
            self.z = 0
        elif len(args) == 2:
            self.x = args[0]
            self.y = args[1]
            self.z = 0
        elif len(args) == 3:
            self.x = args[0]
            self.y = args[1]
            self.z = args[2]
    
    def producto_punto(self, otro):
        return self.x * otro.x + self.y * otro.y + self.z * otro.z
    
    def producto_cruz(self, otro):
        x = self.y * otro.z - self.z * otro.y
        y = self.z * otro.x - self.x * otro.z
        z = self.x * otro.y - self.y * otro.x
        return AlgebraVectorial(x, y, z)
    
    def magnitud(self):
        return (self.x**2 + self.y**2 + self.z**2)**0.5
    
    # Sobrecarga de métodos para perpendicular
    def perpendicular_a(self, otro, metodo=1):
        if metodo == 1:  # |a + b| = |a - b|
            suma = AlgebraVectorial(self.x + otro.x, self.y + otro.y, self.z + otro.z)
            resta = AlgebraVectorial(self.x - otro.x, self.y - otro.y, self.z - otro.z)
            return abs(suma.magnitud() - resta.magnitud()) < 1e-10
        elif metodo == 2:  # |a - b| = |b - a|
            resta1 = AlgebraVectorial(self.x - otro.x, self.y - otro.y, self.z - otro.z)
            resta2 = AlgebraVectorial(otro.x - self.x, otro.y - self.y, otro.z - self.z)
            return abs(resta1.magnitud() - resta2.magnitud()) < 1e-10
        elif metodo == 3:  # a · b = 0
            return abs(self.producto_punto(otro)) < 1e-10
        elif metodo == 4:  # |a + b|² = |a|² + |b|²
            suma = AlgebraVectorial(self.x + otro.x, self.y + otro.y, self.z + otro.z)
            return abs(suma.magnitud()**2 - (self.magnitud()**2 + otro.magnitud()**2)) < 1e-10
    
    # Sobrecarga de métodos para paralelo
    def paralelo_a(self, otro, metodo=1):
        if metodo == 1:  # a = rb
            if otro.x == 0 and otro.y == 0 and otro.z == 0:
                return True  # El vector cero es paralelo a todos los vectores
            r = None
            if otro.x != 0:
                r = self.x / otro.x
            elif otro.y != 0:
                r = self.y / otro.y
            elif otro.z != 0:
                r = self.z / otro.z
            
            return (abs(self.x - r * otro.x) < 1e-10 and 
                    abs(self.y - r * otro.y) < 1e-10 and 
                    abs(self.z - r * otro.z) < 1e-10)
        elif metodo == 2:  # a × b = 0
            cruz = self.producto_cruz(otro)
            return abs(cruz.magnitud()) < 1e-10
    
    def proyeccion(self, otro):
        escalar = self.producto_punto(otro)
        denominador = otro.magnitud()**2
        if denominador == 0:
            return AlgebraVectorial(0, 0, 0)
        factor = escalar / denominador
        return AlgebraVectorial(otro.x * factor, otro.y * factor, otro.z * factor)
    
    def componente(self, otro):
        escalar = self.producto_punto(otro)
        denominador = otro.magnitud()
        if denominador == 0:
            return 0
        return escalar / denominador

# Ejemplo de uso
if __name__ == "__main__":
    v1 = AlgebraVectorial(1, 0)
    v2 = AlgebraVectorial(0, 1)
    
    print("¿Son perpendiculares (método 1)?", v1.perpendicular_a(v2, 1))
    print("¿Son perpendiculares (método 3)?", v1.perpendicular_a(v2, 3))
    
    v3 = AlgebraVectorial(2, 0, 0)
    print("¿Son paralelos (método 1)?", v1.paralelo_a(v3, 1))
    print("¿Son paralelos (método 2)?", v1.paralelo_a(v3, 2))
    
    proy = v1.proyeccion(v3)
    print("Proyección de v1 sobre v3:", (proy.x, proy.y, proy.z))
    
    comp = v1.componente(v3)
    print("Componente de v1 en v3:", comp)