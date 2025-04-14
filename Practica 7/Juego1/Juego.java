package Juego1;

public class Juego{
    protected int numeroDeVidas;
    protected int record;

    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("Partida reiniciada. Tienes " + numeroDeVidas + " vidas.");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo récord! Aciertos totales: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas + " vidas.");
            return true;
        } else {
            System.out.println("¡No te quedan más vidas! Fin del juego.");
            return false;
        }
    }
}