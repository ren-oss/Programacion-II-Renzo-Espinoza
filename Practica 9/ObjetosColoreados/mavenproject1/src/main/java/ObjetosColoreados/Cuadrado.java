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
public class Cuadrado extends Figura implements Coloreado {
    private int lado;

    public Cuadrado(int lado, Color color) {
        this.lado = lado;
        this.color = color;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    public void dibujar(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, lado, lado);
    }
}
