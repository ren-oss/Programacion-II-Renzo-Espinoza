package EstadisticaModular;

public class EstadisticasModular {
	  public double calcularPromedio(double[] numeros) {
	        double suma = 0;
	        for (double num : numeros) {
	            suma += num;
	        }
	        return suma / numeros.length;
	    }

	    public double calcularDesviacion(double[] numeros, double promedio) {
	        double sumaCuadrados = 0;
	        for (double num : numeros) {
	            sumaCuadrados += Math.pow(num - promedio, 2);
	        }
	        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
	    }
}
