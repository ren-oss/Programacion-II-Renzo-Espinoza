/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinisterioPOO;

/**
 *
 * @author Renzo
 */
public class Principal {
    public static void main(String[] args) {
        // Instancia con constructor parametrizado
        LineaTeleferico rojo = new LineaTeleferico("Rojo", "Estación Central - 16 de Julio", 20);
        rojo.agregarEmpleado("Pedro", "Rojas", "Luna", 35, 2500);
        rojo.agregarEmpleado("Lucy", "Sosa", "Rios", 43, 3250);
        rojo.agregarEmpleado("Ana", "Perez", "Rojas", 29, 2700);
        rojo.agregarEmpleado("Saul", "Arce", "Calle", 29, 2500);

        // Instancia con constructor vacío
        LineaTeleferico azul = new LineaTeleferico();
        azul.color = "Azul";
        azul.tramo = "Estación Periférica - Cementerio";
        azul.nroCabinas = 15;

        System.out.println("\nANTES DE TRANSFERENCIA:");
        rojo.mostrarEmpleados();
        azul.mostrarEmpleados();

        // Eliminar empleados con apellido Rojas
        rojo.eliminarPorApellido("Rojas");

        // Transferencia
        rojo.transferirEmpleado("Lucy", azul);

        System.out.println("\nDESPUÉS DE ELIMINAR Y TRANSFERIR:");
        rojo.mostrarEmpleados();
        azul.mostrarEmpleados();

        // Mostrar empleados con mayor edad y sueldo
        System.out.println("\n--- Mayor Edad ---");
        azul.mostrarMayorEdad();

        System.out.println("\n--- Mayor Sueldo ---");
        azul.mostrarMayorSueldo();
    }
}
