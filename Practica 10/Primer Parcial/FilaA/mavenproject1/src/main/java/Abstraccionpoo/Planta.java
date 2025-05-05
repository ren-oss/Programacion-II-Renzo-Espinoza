/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccionpoo;

/**
 *
 * @author Renzo
 */
public class Planta {
    String nombreCientifico;
    String familia;
    String regionDistribucion;
    String adaptacionClimatica;

    public boolean evaluarAdaptabilidad() {
        return adaptacionClimatica.equals("templado") || adaptacionClimatica.equals("tropical");
    }

    public void mostrarRelacionFilogenetica() {
        System.out.println("Mostrando relaciones evolutivas de la planta: " + nombreCientifico);
    }
}
