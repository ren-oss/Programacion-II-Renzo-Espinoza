class Planta:
    def __init__(self, nombre, tipo_semilla, clima_favorable, region_actual):
        self.nombre = nombre
        self.tipo_semilla = tipo_semilla
        self.clima_favorable = clima_favorable
        self.region_actual = region_actual

    def puede_prosperar(self, clima):
        return clima in self.clima_favorable

    def migrar(self, nueva_region):
        print(f"{self.nombre} migra de {self.region_actual} a {nueva_region}")
        self.region_actual = nueva_region


class Ambiente:
    def __init__(self, region, temperatura, humedad, tipo_suelo):
        self.region = region
        self.temperatura = temperatura
        self.humedad = humedad
        self.tipo_suelo = tipo_suelo

    def es_adecuado_para(self, planta):
        return self.region in planta.clima_favorable

    def cambiar_clima(self, nueva_temp, nueva_humedad):
        self.temperatura = nueva_temp
        self.humedad = nueva_humedad


class BarreraGeografica:
    def __init__(self, nombre, tipo, region1, region2):
        self.nombre = nombre
        self.tipo = tipo  # montaña, lago, desierto, océano
        self.region1 = region1
        self.region2 = region2

    def impide_dispersion(self, planta):
        if planta.region_actual in [self.region1, self.region2]:
            print(f"La barrera '{self.nombre}' impide que {planta.nombre} cruce de {self.region1} a {self.region2}")
            return True
        return False

    def describir(self):
        print(f"{self.nombre} es una barrera de tipo {self.tipo} entre {self.region1} y {self.region2}")

# Crear instancias
pino = Planta("Pino", "Conífera", ["Zona Templada", "Alta Montaña"], "Zona Templada")
selva = Ambiente("Zona Tropical", 30, 90, "Húmedo")
andinos = BarreraGeografica("Cordillera de los Andes", "Montaña", "Zona Templada", "Zona Tropical")

# Probar métodos
print(pino.puede_prosperar("Zona Tropical"))  # False
selva.cambiar_clima(32, 95)
andinos.describir()

if not andinos.impide_dispersion(pino):
    pino.migrar("Zona Tropical")