package LineayCirculoenJava;

import java.awt.Graphics;

public class Circulo {
	 Punto centro;
	    int radio;

	    public Circulo(Punto centro, int radio) {
	        this.centro = centro;
	        this.radio = radio;
	    }

	    @Override
	    public String toString() {
	        return "Círculo con centro en " + centro + " y radio " + radio;
	    }

	    public void dibujacirculo(Graphics g) {
	        g.drawOval(centro.x - radio, centro.y - radio, 2 * radio, 2 * radio);
	    }
}
