package EcCuadratica;
import java.util.Scanner;

public class MainEcuacionCuadratica{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        ecuacion.resolver();

        input.close();
    }
}