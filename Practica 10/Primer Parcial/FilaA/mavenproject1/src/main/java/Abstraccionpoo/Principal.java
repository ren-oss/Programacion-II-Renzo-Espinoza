/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccionpoo;

/**
 *
 * @author Renzo
 */
public class Principal {
    public static void main(String[] args) {
        // Crear una planta
        Planta planta1 = new Planta();
        planta1.nombreCientifico = "Pinus sylvestris";
        planta1.familia = "Pinaceae";
        planta1.regionDistribucion = "Europa";
        planta1.adaptacionClimatica = "templado";

        // Crear un ambiente
        Ambiente ambiente1 = new Ambiente();
        ambiente1.clima = "templado";
        ambiente1.tipoSuelo = "ácido";
        ambiente1.temperaturaPromedio = 15.5;
        ambiente1.precipitacionAnual = 800;

        // Crear una barrera geográfica
        BarreraGeografica barrera1 = new BarreraGeografica();
        barrera1.nombre = "Cordillera de los Andes";
        barrera1.tipo = "montaña";
        barrera1.ubicacion = "Sudamérica";
        barrera1.afectaEspecies = true;

        // Usar métodos
        System.out.println("\n¿La planta puede adaptarse al ambiente?");
        System.out.println(planta1.evaluarAdaptabilidad());

        System.out.println("\n¿El ambiente es apto para la planta?");
        System.out.println(ambiente1.esAptoPara(planta1));

        System.out.println("\nRelación filogenética de la planta:");
        planta1.mostrarRelacionFilogenetica();

        System.out.println("\n¿La barrera restringe la dispersión?");
        System.out.println(barrera1.restringeDispersion(planta1));

        System.out.println("\nDescripción del impacto de la barrera:");
        System.out.println(barrera1.descripcionImpacto());
    }
}
