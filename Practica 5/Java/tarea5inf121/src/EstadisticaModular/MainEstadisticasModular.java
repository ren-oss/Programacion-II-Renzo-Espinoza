package EstadisticaModular;
import java.util.Scanner;
public class MainEstadisticasModular {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos: ");
        int n = sc.nextInt();
        double[] datos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el dato " + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }
        double promedio = EstadisticasModular.calcularPromedio(datos);
        double desviacion = EstadisticasModular.calcularDesviacion(datos, promedio);
        System.out.println("El promedio es: " + promedio);
        System.out.println("La desviación estándar es: " + desviacion);
    }
}
