/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatromunicipal;

/**
 *
 * @author Renzo
 */
public class Galeria extends Boleto{
    public Galeria(int numero, int dias) {
        super(numero);
        this.precio = dias >= 10 ? 25.0 : 30.0;
    }

    public String getTipo() {
        return "Galeria";
    }
}
