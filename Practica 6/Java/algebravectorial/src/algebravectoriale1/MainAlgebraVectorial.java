package algebravectoriale1;

public class MainAlgebraVectorial {
    public static void main(String[] args) {
        AlgebraVectorial v1 = new AlgebraVectorial(1, 0);
        AlgebraVectorial v2 = new AlgebraVectorial(0, 1);
        
        System.out.println("¿Son perpendiculares (método 1)? " + v1.esPerpendicular(v2, 1));
        System.out.println("¿Son perpendiculares (método 3)? " + v1.esPerpendicular(v2));
        
        AlgebraVectorial v3 = new AlgebraVectorial(2, 0);
        System.out.println("¿Son paralelos (método 1)? " + v1.esParalelo(v3, 1));
        System.out.println("¿Son paralelos (método 2)? " + v1.esParalelo(v3));
        
        AlgebraVectorial proy = v1.proyeccion(v3);
        System.out.println("Proyección de v1 sobre v3: (" + proy.getX() + ", " + proy.getY() + ", " + proy.getZ() + ")");
        
        double comp = v1.componente(v3);
        System.out.println("Componente de v1 en v3: " + comp);
    } 
}