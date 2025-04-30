/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosColoreados;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Renzo
 */
public class VentanaFiguras extends JPanel {
    private Figura[] figuras;
    private JButton botonGenerar;

    public VentanaFiguras() {
        setLayout(new BorderLayout());
        figuras = new Figura[5];

        botonGenerar = new JButton("Mostrar Figuras Aleatorias");
        botonGenerar.addActionListener(e -> {
            generarFiguras();
            repaint();
        });

        add(botonGenerar, BorderLayout.SOUTH);
        generarFiguras(); // Mostrar figuras al inicio
    }

    private void generarFiguras() {
        Random rand = new Random();
        for (int i = 0; i < figuras.length; i++) {
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int tipo = rand.nextInt(2) + 1; // 1 - Cuadrado, 2 - Circulo

            if (tipo == 1) {
                int lado = rand.nextInt(50) + 40;
                figuras[i] = new Cuadrado(lado, color);
            } else {
                int radio = rand.nextInt(25) + 20;
                figuras[i] = new Circulo(radio, color);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 60;
        int y = 100;

        for (Figura figura : figuras) {
            if (figura instanceof Cuadrado cuadrado) {
                cuadrado.dibujar(g, x, y);
                g.setColor(Color.BLACK);
                g.drawString("Área: " + String.format("%.2f", cuadrado.area()), x, y + cuadrado.getLado() + 15);
                g.drawString("Perímetro: " + String.format("%.2f", cuadrado.perimetro()), x, y + cuadrado.getLado() + 30);
                g.drawString(cuadrado.comoColorear(), x, y + cuadrado.getLado() + 45);
                x += cuadrado.getLado() + 60;
            } else if (figura instanceof Circulo circulo) {
                circulo.dibujar(g, x, y);
                int diametro = circulo.getRadio() * 2;
                g.setColor(Color.BLACK);
                g.drawString("Área: " + String.format("%.2f", circulo.area()), x, y + diametro + 15);
                g.drawString("Perímetro: " + String.format("%.2f", circulo.perimetro()), x, y + diametro + 30);
                x += diametro + 60;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Figuras Coloreadas Aleatorias");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setContentPane(new VentanaFiguras());
        frame.setVisible(true);
    }
}
