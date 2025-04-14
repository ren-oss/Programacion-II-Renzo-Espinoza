import random

class Juego:
    def __init__(self, vidas):
        self.numero_de_vidas = vidas
        self.vidas_iniciales = vidas
        self.record = 0

    def reinicia_partida(self):
        self.numero_de_vidas = self.vidas_iniciales
        print("\n¡Partida reiniciada! Tienes", self.numero_de_vidas, "vidas.")

    def actualiza_record(self):
        self.record += 1
        print("¡Nuevo récord! Aciertos totales:", self.record)

    def quita_vida(self):
        self.numero_de_vidas -= 1
        if self.numero_de_vidas > 0:
            print("Te quedan", self.numero_de_vidas, "vidas.")
            return True
        else:
            print("¡No te quedan más vidas! Fin del juego.")
            return False

class JuegoAdivinaNumero(Juego):
    def __init__(self, vidas):
        super().__init__(vidas)
        self.numero_a_adivinar = 0

    def valida_numero(self, numero):
        return 0 <= numero <= 10

    def juega(self):
        self.reinicia_partida()
        self.numero_a_adivinar = random.randint(0, 10)

        while True:
            try:
                intento = int(input("Adivina un número entre 0 y 10: "))
            except ValueError:
                print("Entrada inválida. Intenta con un número entero.")
                continue

            if not self.valida_numero(intento):
                print("Número fuera de rango (0-10). Intenta otra vez.")
                continue

            if intento == self.numero_a_adivinar:
                print("¡Acertaste!")
                self.actualiza_record()
                break
            else:
                if not self.quita_vida():
                    break
                if intento < self.numero_a_adivinar:
                    print("El número es mayor.")
                else:
                    print("El número es menor.")



def main():
    print("=== Juego Normal ===")
    juego1 = JuegoAdivinaNumero(3)
    juego1.juega()


if __name__ == "__main__":
    main()
