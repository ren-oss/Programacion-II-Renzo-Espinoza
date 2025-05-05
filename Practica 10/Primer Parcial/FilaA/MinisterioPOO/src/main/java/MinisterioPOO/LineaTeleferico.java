/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinisterioPOO;

/**
 *
 * @author Renzo
 */
public class LineaTeleferico {
    String color;
    String tramo;
    int nroCabinas;
    int nroEmpleados;
    String[][] empleados = new String[100][3]; // nombre, apellidoPaterno, apellidoMaterno
    int[] edades = new int[100];
    double[] sueldos = new double[100];

    // Constructor 1
    public LineaTeleferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.nroEmpleados = 0;
    }

    // Constructor 2 vacío
    public LineaTeleferico() {
        this.color = "";
        this.tramo = "";
        this.nroCabinas = 0;
        this.nroEmpleados = 0;
    }

    public void agregarEmpleado(String nombre, String apPat, String apMat, int edad, double sueldo) {
        empleados[nroEmpleados][0] = nombre;
        empleados[nroEmpleados][1] = apPat;
        empleados[nroEmpleados][2] = apMat;
        edades[nroEmpleados] = edad;
        sueldos[nroEmpleados] = sueldo;
        nroEmpleados++;
    }

    public void eliminarPorApellido(String apellido) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][1].equals(apellido) || empleados[i][2].equals(apellido)) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--; // revisar de nuevo la posición actual
            }
        }
    }

    public void transferirEmpleado(String nombre, LineaTeleferico destino) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][0].equals(nombre)) {
                destino.agregarEmpleado(
                    empleados[i][0], empleados[i][1], empleados[i][2],
                    edades[i], sueldos[i]
                );
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                break;
            }
        }
    }

    public void mostrarMayorEdad() {
        int maxEdad = -1;
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] > maxEdad) {
                maxEdad = edades[i];
            }
        }

        System.out.println("Empleado(s) con mayor edad:");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == maxEdad) {
                System.out.println(empleados[i][0] + " " + empleados[i][1] + " " + empleados[i][2] + " - Edad: " + edades[i]);
            }
        }
    }

    public void mostrarMayorSueldo() {
        double maxSueldo = -1;
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] > maxSueldo) {
                maxSueldo = sueldos[i];
            }
        }

        System.out.println("Empleado(s) con mayor sueldo:");
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == maxSueldo) {
                System.out.println(empleados[i][0] + " " + empleados[i][1] + " " + empleados[i][2] + " - Sueldo: " + sueldos[i]);
            }
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados de la línea " + color + ":");
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println(empleados[i][0] + " " + empleados[i][1] + " " + empleados[i][2] +
                               " - Edad: " + edades[i] + ", Sueldo: " + sueldos[i]);
        }
    }
}
