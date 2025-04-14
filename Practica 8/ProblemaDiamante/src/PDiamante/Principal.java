package PDiamante;

public class Principal {
    
    public static void main(String[] args) {
        C c = new C(5, 10);
        System.out.println("Original: " + c);
        System.out.println("Usando el metodo1 y metodo2");
        c.metodo1();
        System.out.println("metodo1: " + c);
        c.metodo2();
        System.out.println("metodo2: " + c);
    }
}
