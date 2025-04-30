/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatromunicipal;

/**
 *
 * @author Renzo
 */
public abstract class Boleto {
    protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Número: " + numero + ", Precio: " + precio;
    }

    public abstract String getTipo();
}
