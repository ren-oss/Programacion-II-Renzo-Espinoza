package algebravectoriale1;

public class AlgebraVectorial {
    private double x;
    private double y;
    private double z;
    
    // Constructores sobrecargados
    public AlgebraVectorial() {
        this(0, 0, 0);
    }
    
    public AlgebraVectorial(double x, double y) {
        this(x, y, 0);
    }
    
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    // Producto punto
    public double productoPunto(AlgebraVectorial otro) {
        return this.x * otro.x + this.y * otro.y + this.z * otro.z;
    }
    
    // Producto cruz
    public AlgebraVectorial productoCruz(AlgebraVectorial otro) {
        double newX = this.y * otro.z - this.z * otro.y;
        double newY = this.z * otro.x - this.x * otro.z;
        double newZ = this.x * otro.y - this.y * otro.x;
        return new AlgebraVectorial(newX, newY, newZ);
    }
    
    // Magnitud
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    
    // Métodos sobrecargados para perpendicular
    public boolean esPerpendicular(AlgebraVectorial otro) {
        // Método 3: a · b = 0
        return Math.abs(productoPunto(otro)) < 1e-10;
    }
    
    public boolean esPerpendicular(AlgebraVectorial otro, int metodo) {
        switch(metodo) {
            case 1 -> {
                // |a + b| = |a - b|
                AlgebraVectorial suma = new AlgebraVectorial(
                        this.x + otro.x, this.y + otro.y, this.z + otro.z);
                AlgebraVectorial resta = new AlgebraVectorial(
                        this.x - otro.x, this.y - otro.y, this.z - otro.z);
                return Math.abs(suma.magnitud() - resta.magnitud()) < 1e-10;
            }
            case 2 -> {
                // |a - b| = |b - a|
                AlgebraVectorial resta1 = new AlgebraVectorial(
                        this.x - otro.x, this.y - otro.y, this.z - otro.z);
                AlgebraVectorial resta2 = new AlgebraVectorial(
                        otro.x - this.x, otro.y - this.y, otro.z - this.z);
                return Math.abs(resta1.magnitud() - resta2.magnitud()) < 1e-10;
            }
            case 4 -> {
                // |a + b|² = |a|² + |b|²
                AlgebraVectorial suma4 = new AlgebraVectorial(
                        this.x + otro.x, this.y + otro.y, this.z + otro.z);
                double sumaCuadrados = Math.pow(this.magnitud(), 2) + Math.pow(otro.magnitud(), 2);
                return Math.abs(Math.pow(suma4.magnitud(), 2) - sumaCuadrados) < 1e-10;
            }
            default -> {
                // Por defecto usa el método 3
                return esPerpendicular(otro);
            }
        }
    }
    
    // Métodos sobrecargados para paralelo
    public boolean esParalelo(AlgebraVectorial otro) {
        // Método 2: a × b = 0
        return productoCruz(otro).magnitud() < 1e-10;
    }
    
    public boolean esParalelo(AlgebraVectorial otro, int metodo) {
        if (metodo == 1) { // a = rb
            if (otro.x == 0 && otro.y == 0 && otro.z == 0) {
                return true; // El vector cero es paralelo a todos los vectores
            }
            
            double r = Double.NaN;
            if (otro.x != 0) r = this.x / otro.x;
            else if (otro.y != 0) r = this.y / otro.y;
            else if (otro.z != 0) r = this.z / otro.z;
            
            return !Double.isNaN(r) && 
                   Math.abs(this.x - r * otro.x) < 1e-10 && 
                   Math.abs(this.y - r * otro.y) < 1e-10 && 
                   Math.abs(this.z - r * otro.z) < 1e-10;
        } else {
            return esParalelo(otro);
        }
    }
    
    // Proyección
    public AlgebraVectorial proyeccion(AlgebraVectorial otro) {
        double escalar = productoPunto(otro);
        double denominador = Math.pow(otro.magnitud(), 2);
        if (denominador == 0) {
            return new AlgebraVectorial();
        }
        double factor = escalar / denominador;
        return new AlgebraVectorial(
            otro.x * factor, 
            otro.y * factor, 
            otro.z * factor);
    }
    
    // Componente
    public double componente(AlgebraVectorial otro) {
        double escalar = productoPunto(otro);
        double denominador = otro.magnitud();
        if (denominador == 0) {
            return 0;
        }
        return escalar / denominador;
    }
    
}