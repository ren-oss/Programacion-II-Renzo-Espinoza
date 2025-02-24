package LineayCirculoenJava;
import javax.swing.*;
import java.awt.*;

public class Grafico extends JPanel {
    Linea linea;
    Circulo circulo;

    public Grafico(Linea linea, Circulo circulo) {
        this.linea = linea;
        this.circulo = circulo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        linea.dibujalinea(g);
        circulo.dibujacirculo(g);
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(50, 50);
        Punto p2 = new Punto(200, 200);
        Linea linea = new Linea(p1, p2);
        System.out.println(linea);

        Punto centro = new Punto(150, 150);
        Circulo circulo = new Circulo(centro, 100);
        System.out.println(circulo);

        JFrame frame = new JFrame();
        frame.add(new Grafico(linea, circulo));
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}