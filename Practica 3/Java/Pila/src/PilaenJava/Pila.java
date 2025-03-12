package PilaenJava;

public class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.top = -1;
    }

    public void insert(long e) {
        if (!isFull()) {
            arreglo[++top] = e;
        } else {
            System.out.println("Pila llena. No se puede insertar " + e);
        }
    }

    public long pop() {
        if (!isEmpty()) {
            return arreglo[top--];
        } else {
            System.out.println("Pila vacía. No se puede extraer elemento.");
            return -1;
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[top];
        } else {
            System.out.println("Pila vacía. No hay elemento en la cima.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }
    public static void main(String[] args) {
        Pila pila = new Pila(5);
        pila.insert(10);
        pila.insert(20);
        pila.insert(30);
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Elemento extraído: " + pila.pop());
        System.out.println("¿Está vacía? " + pila.isEmpty());
    }
}
