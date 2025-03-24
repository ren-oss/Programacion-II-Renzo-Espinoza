package EcCuadratica;

public class EcuacionCuadraticaModular {
	public static double getDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double getRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double getRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void resolverEcuacion(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);

        if (discriminante > 0) {
            double r1 = getRaiz1(a, b, discriminante);
            double r2 = getRaiz2(a, b, discriminante);
            System.out.printf("La ecuación tiene dos raíces %.5f y %.5f%n", r1, r2);
        } else if (discriminante == 0) {
            double r1 = -b / (2 * a);
            System.out.printf("La ecuación tiene una raíz %.5f%n", r1);
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
}
}
