package LineayCirculoenJava;
import java.util.Scanner;
import java.awt.Graphics;

public class Circulo {
    Scanner lee = new Scanner
	private Punto centro;
    private float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public void dibujarCirculo(Graphics g) {
        g.drawOval(centro.getX() - (int)radio, centro.getY() - (int)radio, (int)radio * 2, (int)radio * 2);
    }

    @Override
    public String toString() {
        return "Círculo con centro en " + centro.toString() + " y radio " + radio;
    }
}
