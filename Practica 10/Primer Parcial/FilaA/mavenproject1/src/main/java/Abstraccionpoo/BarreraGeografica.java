/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccionpoo;

/**
 *
 * @author Renzo
 */
public class BarreraGeografica {
    String nombre;
    String tipo;
    String ubicacion;
    boolean afectaEspecies;

    public boolean restringeDispersion(Planta p) {
        return afectaEspecies;
    }

    public String descripcionImpacto() {
        return "La barrera " + nombre + " (" + tipo + ") limita la dispersión de ciertas especies.";
    }
}
