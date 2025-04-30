package algebravectoriale2;

public class MainVector3D {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(-2, 1, 0);
        
        // Suma de vectores
        Vector3D c = a.sumar(b);
        System.out.println("Suma: " + a + " + " + b + " = " + c);
        
        // Multiplicación por escalar
        Vector3D d = a.multiplicar(2.5);
        System.out.println("Multiplicación por escalar: " + a + " * 2.5 = " + d);
        
        // Producto punto
        double punto = a.productoPunto(b);
        System.out.println("Producto punto: " + a + " · " + b + " = " + punto);
        
        // Producto cruz (Vectorial) 
        Vector3D cruz = a.productoCruz(b);
        System.out.println("Producto vectorial: " + a + " × " + b + " = " + cruz);
        
        // Normalización
        Vector3D norm = a.normalizar();
        System.out.println("Vector normalizado: " + a + " → " + norm);
        
        // Proyección
        Vector3D proy = a.proyeccion(b);
        System.out.println("Proyección de " + a + " sobre " + b + ": " + proy);
        
        // Componente
        double comp = a.componente(b);
        System.out.println("Componente de " + a + " en dirección de " + b + ": " + comp);
        
        // Perpendicularidad
        boolean perp = a.esPerpendicular(b);
        System.out.println("¿" + a + " es perpendicular a " + b + "? " + perp);
    }
}
