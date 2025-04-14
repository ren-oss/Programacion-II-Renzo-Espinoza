class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z
    
    def incrementaXZ(self):
        self.x += 1
        self.z += 1
    
    def incrementaZ(self):
        self.z += 1


class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z
    
    def incrementaYZ(self):
        self.y += 1
        self.z += 1
    
    def incrementaZ(self):
        self.z += 1


class D(A, B):
    def __init__(self, x, y, z):
        # En Python podemos inicializar directamente
        self.x = x
        self.y = y
        self.z = z
    
    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1
    
    # Resolución del conflicto en incrementaZ()
    def incrementaZ(self):
        # Podemos elegir cuál implementación usar o crear una nueva
        A.incrementaZ(self)  # Usamos la implementación de A
        # También podríamos hacer: B.incrementaZ(self) o nuestra propia implementación


# Ejemplo de uso
if __name__ == "__main__":
    d = D(1, 2, 3)
    print(f"Inicial: x={d.x}, y={d.y}, z={d.z}")
    
    d.incrementaXZ()
    print(f"Después de incrementaXZ: x={d.x}, y={d.y}, z={d.z}")
    
    d.incrementaYZ()
    print(f"Después de incrementaYZ: x={d.x}, y={d.y}, z={d.z}")
    
    d.incrementaZ()
    print(f"Después de incrementaZ: x={d.x}, y={d.y}, z={d.z}")
    
    d.incrementaXYZ()
    print(f"Después de incrementaXYZ: x={d.x}, y={d.y}, z={d.z}")