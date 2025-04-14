package PDiamante;

public interface B {
	 int y = 10; // Implícitamente public static final
	    int z = 0; // Valor inicial
	    
	    // Constructor simulado
	    default void B(int y) {
	        // En interfaces no podemos tener constructores reales
	    }
	    
	    default void metodo2() {
	        System.out.println("Método 2 de B" + (y+1));
	    }
	    
	    default void metodo3() {
	        System.out.println("Método 3 de B" + (y+1));
	    }
}
