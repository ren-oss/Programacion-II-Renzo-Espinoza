/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccionpoo;

/**
 *
 * @author Renzo
 */
public class Ambiente {
     String clima;
    String tipoSuelo;
    double temperaturaPromedio;
    double precipitacionAnual;

    public boolean esAptoPara(Planta p) {
        return p.adaptacionClimatica.equalsIgnoreCase(clima);
    }

    public String comparar(Ambiente otro) {
        if (this.temperaturaPromedio > otro.temperaturaPromedio) {
            return "Este ambiente es más cálido.";
        } else if (this.temperaturaPromedio < otro.temperaturaPromedio) {
            return "Este ambiente es más frío.";
        } else {
            return "Ambos ambientes tienen la misma temperatura.";
        }
    }
}
