package Juego1;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    private int vidasIniciales;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
        this.vidasIniciales = vidas;
    }

    @Override
    public void reiniciaPartida() {
        this.numeroDeVidas = vidasIniciales;
        System.out.println("¡Comienza una nueva partida!");
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 11); // de 0 a 10

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento;

            if (scanner.hasNextInt()) {
                intento = scanner.nextInt();
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next(); // limpiar entrada incorrecta
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                boolean sigue = quitaVida();
                if (!sigue) break;

                if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
            }
        }
    }
}
