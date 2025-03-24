package EcCuadratica;

import java.util.Scanner;

import static EcCuadratica.EcuacionCuadraticaModular.resolverEcuacion;

public class MainEcuacionCuadraticaModular {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        resolverEcuacion(a, b, c);
        input.close();
    }
}