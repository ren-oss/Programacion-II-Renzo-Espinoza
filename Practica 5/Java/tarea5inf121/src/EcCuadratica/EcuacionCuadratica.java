package EcCuadratica;

public class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public Double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b + Math.sqrt(discriminante)) / (2 * a);
        }
        return null;
    }

    public Double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b - Math.sqrt(discriminante)) / (2 * a);
        }
        return null;
    }

    public void resolver() {
        double discriminante = getDiscriminante();
        if (discriminante > 0) {
            System.out.printf("La ecuación tiene dos raíces %.5f y %.5f%n", getRaiz1(), getRaiz2());
        } else if (discriminante == 0) {
            System.out.printf("La ecuación tiene una raíz %.5f%n", -b / (2 * a));
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}
