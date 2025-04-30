/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatromunicipal;

/**
 *
 * @author Renzo
 */
public class Platea extends Boleto {
    public Platea(int numero, int dias) {
        super(numero);
        this.precio = dias >= 10 ? 50.0 : 60.0;
    }

    public String getTipo() {
        return "Platea";
    }
}
