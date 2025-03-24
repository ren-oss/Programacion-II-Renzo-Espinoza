package Estadisticaspoo;

public class Estadisticas {
	 private double[] datos;

	    public Estadisticas(double[] datos) {
	        this.datos = datos;
	    }

	    public double calcularPromedio() {
	        double suma = 0;
	        for (double num : datos) {
	            suma += num;
	        }
	        return suma / datos.length;
	    }

	    public double calcularDesviacion() {
	        double promedio = calcularPromedio();
	        double sumaCuadrados = 0;
	        for (double num : datos) {
	            sumaCuadrados += Math.pow(num - promedio, 2);
	        }
	        return Math.sqrt(sumaCuadrados / (datos.length - 1));
	    }
}
