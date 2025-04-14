package PDiamante;

public class C implements A, B {
	private int x;
    private int y;
    private int z;
    
    public C() {
        this.x = 5;
        this.y = 10;
        
        // Incrementos mostrados en el diagrama
        this.x = this.x + 1;
        this.x = this.x + 1;
        
        this.y = this.y + 1;
        this.y = this.y + 1;
        
        this.x = this.x + 1;
        this.y = this.y + 1;
        
        metodo1();
        metodo2();
    }
    
    @Override
    public void metodo1() {
        System.out.println("Método 1 implementado en C");
    }
    
    // Resolución del conflicto en metodo3()
    @Override
    public void metodo3() {
        A.super.metodo3(); // Puedes elegir cuál implementación usar
        // o proporcionar una nueva implementación
    }
    
    public static void main(String[] args) {
        C c = new C();
    }
}
