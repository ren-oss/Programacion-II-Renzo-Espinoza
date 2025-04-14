package Juego1;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }


    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: El número no es impar.");
                return false;
            }
        }
        System.out.println("Error: Número fuera del rango 0-10.");
        return false;
    }
}