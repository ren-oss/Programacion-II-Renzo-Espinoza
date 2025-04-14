package practica;

public class Main {
	
	   public static void main(String[] args) {
	        D d = new D(1, 2, 3);
	        
	        System.out.println("Valores iniciales:");
	        System.out.println("x: " + d.getX() + ", y: " + d.getY() + ", z: " + d.getZ());
	        
	        d.incrementaXZ();
	        System.out.println("\nDespués de incrementaXZ:");
	        System.out.println("x: " + d.getX() + ", y: " + d.getY() + ", z: " + d.getZ());
	        
	        d.incrementaYZ();
	        System.out.println("\nDespués de incrementaYZ:");
	        System.out.println("x: " + d.getX() + ", y: " + d.getY() + ", z: " + d.getZ());
	        
	        d.incrementaZ();
	        System.out.println("\nDespués de incrementaZ:");
	        System.out.println("x: " + d.getX() + ", y: " + d.getY() + ", z: " + d.getZ());
	        
	        d.incrementaXYZ();
	        System.out.println("\nDespués de incrementaXYZ:");
	        System.out.println("x: " + d.getX() + ", y: " + d.getY() + ", z: " + d.getZ());
	    }
}
