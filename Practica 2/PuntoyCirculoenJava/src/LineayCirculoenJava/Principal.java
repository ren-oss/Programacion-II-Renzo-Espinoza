package LineayCirculoenJava;

import javax.swing.*;
import java.awt.*;
public class Principal {
	public static void main(String[] args) {
        
        Punto p1 = new Punto(50, 50);
        Punto p2 = new Punto(200, 200);
        Linea linea = new Linea(p1, p2);

        Punto centro = new Punto(150, 150);
        Circulo circulo = new Circulo(centro, 50);

        
        JFrame frame = new JFrame("Ventana Gráfica con Coordenadas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new VentanaGrafica(linea, circulo));
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
