package PDiamante;

public interface A {
	int x = 5;
	int z = 0;
	
	default void A(int x) {
		// En interfaces no podemos tener constructores reales
    }
    
    default void metodo1() {
        System.out.println("Método 1 de A" + (x+1));
        
    }
    
    default void metodo3() {
        System.out.println("Método 3 de A" + (x+1));
    }
}
