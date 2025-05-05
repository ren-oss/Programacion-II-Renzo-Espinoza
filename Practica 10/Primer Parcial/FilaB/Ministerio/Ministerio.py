class Ministerio:
    def __init__(self, nombre="", direccion=""):
        self.nombre = nombre
        self.direccion = direccion
        self.nroEmpleados = 0
        self.empleados = []  # lista de tuplas (nombre, apellido)
        self.edades = []     # lista de enteros
        self.sueldos = []    # lista de enteros

    def agregar_empleado(self, nombre, apellido, edad, sueldo):
        self.empleados.append((nombre, apellido))
        self.edades.append(edad)
        self.sueldos.append(sueldo)
        self.nroEmpleados += 1

    def eliminar_por_edad(self, edad_x):
        nuevos_empleados = []
        nuevas_edades = []
        nuevos_sueldos = []
        for i in range(self.nroEmpleados):
            if self.edades[i] != edad_x:
                nuevos_empleados.append(self.empleados[i])
                nuevas_edades.append(self.edades[i])
                nuevos_sueldos.append(self.sueldos[i])
        self.empleados = nuevos_empleados
        self.edades = nuevas_edades
        self.sueldos = nuevos_sueldos
        self.nroEmpleados = len(self.empleados)

    def __lshift__(self, otro):
        if otro.nroEmpleados == 0:
            print("No hay empleados para transferir.")
            return
        # Transferir último empleado
        nombre, apellido = otro.empleados[-1]
        edad = otro.edades[-1]
        sueldo = otro.sueldos[-1]
        self.agregar_empleado(nombre, apellido, edad, sueldo)
        # Eliminar del otro
        otro.empleados.pop()
        otro.edades.pop()
        otro.sueldos.pop()
        otro.nroEmpleados -= 1

    def mostrar_empleado_menor_edad(self):
        if not self.edades:
            print("No hay empleados.")
            return
        menor = min(self.edades)
        for i in range(self.nroEmpleados):
            if self.edades[i] == menor:
                print("Menor edad:", self.empleados[i], "Edad:", self.edades[i])
                break

    def mostrar_empleado_menor_sueldo(self):
        if not self.sueldos:
            print("No hay empleados.")
            return
        menor = min(self.sueldos)
        for i in range(self.nroEmpleados):
            if self.sueldos[i] == menor:
                print("Menor sueldo:", self.empleados[i], "Sueldo:", self.sueldos[i])
                break

    def mostrar(self):
        print(f"\nMinisterio: {self.nombre}")
        print(f"Dirección: {self.direccion}")
        print("Empleados:")
        for i in range(self.nroEmpleados):
            print(f"{self.empleados[i][0]} {self.empleados[i][1]}, Edad: {self.edades[i]}, Sueldo: {self.sueldos[i]}")
        print()

# Instanciar objetos
m1 = Ministerio("Economía", "Plaza Murillo")
m2 = Ministerio()
m2.nombre = "Educación"
m2.direccion = "Zona Central"

# Agregar empleados a m1
m1.agregar_empleado("Pedro", "Rojas", 35, 2500)
m1.agregar_empleado("Lucy", "Sosa", 43, 3250)
m1.agregar_empleado("Ana", "Perez", 26, 2700)
m1.agregar_empleado("Saul", "Arce", 29, 2500)

# Agregar empleados a m2
m2.agregar_empleado("Rosa", "Luna", 30, 2100)

# Mostrar original
m1.mostrar()
m2.mostrar()

# Eliminar empleados de edad 29
m1.eliminar_por_edad(29)
m1.mostrar()

# Transferir último de m2 a m1
m1 << m2
m1.mostrar()
m2.mostrar()

# Mostrar menor edad y menor sueldo
m1.mostrar_empleado_menor_edad()
m1.mostrar_empleado_menor_sueldo()