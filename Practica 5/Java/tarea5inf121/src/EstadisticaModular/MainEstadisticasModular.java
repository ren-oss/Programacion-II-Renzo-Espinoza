package EstadisticaModular;
import java.util.Scanner;
public class MainEstadisticasModular {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        double promedio = calcularPromedio(numeros);
        double desviacion = calcularDesviacion(numeros, promedio);

        System.out.printf("El promedio es %.2f\n", promedio);
        System.out.printf("La desviación estándar es %.5f\n", desviacion);
        
        scanner.close();
	}
}
