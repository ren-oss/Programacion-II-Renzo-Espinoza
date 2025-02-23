package punto;

public class Punto {
	public double x;
    public double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String coord_cartesianas() {
        return "(" + x + ", " + y + ")";
    }

    public String coord_polares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        return "(" + r + ", " + theta + ")";
    }

    @Override
    public String toString() {
        return "Punto(x=" + x + ", y=" + y + ")";
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        System.out.println(p.coord_cartesianas());  // Salida: (3.0, 4.0)
        System.out.println(p.coord_polares());      // Salida: (5.0, 0.9272952180016122)
        System.out.println(p);                     // Salida: Punto(x=3.0, y=4.0)
    }
}
