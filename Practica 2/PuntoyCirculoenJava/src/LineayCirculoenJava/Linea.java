package LineayCirculoenJava;
import java.awt.Graphics;
public class Linea {
	 private Punto p1;
	    private Punto p2;

	    public Linea(Punto p1, Punto p2) {
	        this.p1 = p1;
	        this.p2 = p2;
	    }

	    public void dibujarLinea(Graphics g) {
	        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	    }

	    @Override
	    public String toString() {
	        return "Linea de " + p1.toString() + " a " + p2.toString();
	    }
}	
