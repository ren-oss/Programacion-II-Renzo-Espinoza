/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosColoreados;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Renzo
 */
public class Circulo extends Figura{
    private int radio;

    public Circulo(int radio, Color color) {
        this.radio = radio;
        this.color = color;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public void dibujar(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x, y, radio * 2, radio * 2);
    }
}
