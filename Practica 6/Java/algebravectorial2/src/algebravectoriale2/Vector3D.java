package algebravectoriale2;

public class Vector3D {
    private double x;
    private double y;
    private double z;
    
    public Vector3D() {
        this(0, 0, 0);
    }
    
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    // Sobrecarga no es posible en Java para operadores aritméticos, 
    // así que usamos métodos con nombres descriptivos
    
    public Vector3D sumar(Vector3D otro) {
        return new Vector3D(this.x + otro.x, this.y + otro.y, this.z + otro.z);
    }
    
    public Vector3D multiplicar(double escalar) {
        return new Vector3D(this.x * escalar, this.y * escalar, this.z * escalar);
    }
    
    public double productoPunto(Vector3D otro) {
        return this.x * otro.x + this.y * otro.y + this.z * otro.z;
    }
    
    public Vector3D productoCruz(Vector3D otro) {
        return new Vector3D(
            this.y * otro.z - this.z * otro.y,
            this.z * otro.x - this.x * otro.z,
            this.x * otro.y - this.y * otro.x
        );
    }
    
    public Vector3D dividir(double escalar) {
        return new Vector3D(this.x / escalar, this.y / escalar, this.z / escalar);
    }
    
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    
    public Vector3D normalizar() {
        double mag = this.magnitud();
        if (mag == 0) {
            return new Vector3D();
        }
        return this.dividir(mag);
    }
    
    public boolean esPerpendicular(Vector3D otro) {
        return Math.abs(this.productoPunto(otro)) < 1e-10;
    }
    
    public Vector3D proyeccion(Vector3D otro) {
        double escalar = this.productoPunto(otro);
        double denominador = Math.pow(otro.magnitud(), 2);
        if (denominador == 0) {
            return new Vector3D();
        }
        return otro.multiplicar(escalar / denominador);
    }
    
    public double componente(Vector3D otro) {
        double escalar = this.productoPunto(otro);
        double denominador = otro.magnitud();
        if (denominador == 0) {
            return 0.0;
        }
        return escalar / denominador;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vector3D otro = (Vector3D) obj;
        return Math.abs(this.x - otro.x) < 1e-10 &&
               Math.abs(this.y - otro.y) < 1e-10 &&
               Math.abs(this.z - otro.z) < 1e-10;
    }
    
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
