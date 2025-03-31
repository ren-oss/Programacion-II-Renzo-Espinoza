class Vector3D:
    def __init__(self, x=0.0, y=0.0, z=0.0):
        self.x = x
        self.y = y
        self.z = z
    
    # Sobrecarga del operador + para suma de vectores
    def __add__(self, otro):
        return Vector3D(self.x + otro.x, self.y + otro.y, self.z + otro.z)
    
    # Sobrecarga del operador * para multiplicación por escalar
    def __mul__(self, escalar):
        return Vector3D(self.x * escalar, self.y * escalar, self.z * escalar)
    
    # Sobrecarga del operador * para producto punto (cuando el otro es Vector3D)
    def __matmul__(self, otro):
        return self.producto_punto(otro)
    
    # Sobrecarga del operador / para división por escalar
    def __truediv__(self, escalar):
        return Vector3D(self.x / escalar, self.y / escalar, self.z / escalar)
    
    # Sobrecarga del operador % para producto cruz
    def __mod__(self, otro):
        return self.producto_cruz(otro)
    
    # Sobrecarga del operador == para comparación
    def __eq__(self, otro):
        return (abs(self.x - otro.x) < 1e-10 and 
                abs(self.y - otro.y) < 1e-10 and 
                abs(self.z - otro.z) < 1e-10)
    
    # Representación como string
    def __str__(self):
        return f"({self.x}, {self.y}, {self.z})"
    
    def magnitud(self):
        return (self.x**2 + self.y**2 + self.z**2)**0.5
    
    def normalizar(self):
        mag = self.magnitud()
        if mag == 0:
            return Vector3D()
        return self / mag
    
    def producto_punto(self, otro):
        return self.x * otro.x + self.y * otro.y + self.z * otro.z
    
    def producto_cruz(self, otro):
        return Vector3D(
            self.y * otro.z - self.z * otro.y,
            self.z * otro.x - self.x * otro.z,
            self.x * otro.y - self.y * otro.x
        )
    
    def es_perpendicular(self, otro):
        return abs(self.producto_punto(otro)) < 1e-10
    
    def proyeccion(self, otro):
        escalar = self.producto_punto(otro)
        denominador = otro.magnitud()**2
        if denominador == 0:
            return Vector3D()
        return otro * (escalar / denominador)
    
    def componente(self, otro):
        escalar = self.producto_punto(otro)
        denominador = otro.magnitud()
        if denominador == 0:
            return 0.0
        return escalar / denominador

# Ejemplo de uso
if __name__ == "__main__":
    a = Vector3D(1, 2, 3)
    b = Vector3D(4, 5, 6)
    
    # Suma de vectores
    c = a + b
    print(f"Suma: {a} + {b} = {c}")
    
    # Multiplicación por escalar
    d = a * 2.5
    print(f"Multiplicación por escalar: {a} * 2.5 = {d}")
    
    # Producto punto
    punto = a @ b
    print(f"Producto punto: {a} · {b} = {punto}")
    
    # Producto cruz
    cruz = a % b
    print(f"Producto cruz: {a} × {b} = {cruz}")
    
    # Normalización
    norm = a.normalizar()
    print(f"Vector normalizado: {a} → {norm}")
    
    # Proyección
    proy = a.proyeccion(b)
    print(f"Proyección de {a} sobre {b}: {proy}")
    
    # Componente
    comp = a.componente(b)
    print(f"Componente de {a} en dirección de {b}: {comp}")
    
    # Perpendicularidad
    perp = a.es_perpendicular(b)
    print(f"¿{a} es perpendicular a {b}? {perp}")