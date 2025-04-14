package PDiamante;

public class C extends A {
	// Java no soporta herencia múltiple, así que usamos composición para B
    private B b;
    
    public C(int x, int y) {
        super(x);
        this.b = new B(y);
    }
    
    public void metodo() {
        this.x += 1;
        this.b.metodo2(); // Incrementa y
    }
    
    public void metodo2() {
        this.b.metodo2();
    }
    
    @Override
    public String toString() {
        return "x = " + this.x + ", y = " + this.b.y;
    }
}
