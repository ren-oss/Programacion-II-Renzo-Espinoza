/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatromunicipal;

/**
 *
 * @author Renzo
 */
public class Palco extends Boleto{
    public Palco(int numero) {
        super(numero);
        this.precio = 100.0;
    }

    public String getTipo() {
        return "Palco";
    }
}
