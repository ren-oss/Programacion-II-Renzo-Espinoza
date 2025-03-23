package AreasFiguras;
public class CalcularAreasdeFiguras {
    // area del ciruclo
	double area(double radio){
        return Math.PI * radio * radio ;
    }
    
    // area del rectángulo
    double area(float  base, double altura){
        return base * altura;
    }
    // area del triángulo rectangulo
    double area(double  base ,float altura){
        return  (base*altura) / 2 ;
    }
    // area del trapecio
     double area(float  base , float  B){
        return ((B+base)/2)*2;
     }
     double area(double lado, double apotema){
        return (5*lado*apotema) / 2;
     }
     
     public static void main(String[] args) {
         CalcularAreasdeFiguras f1 = new CalcularAreasdeFiguras();
         CalcularAreasdeFiguras f2 = new CalcularAreasdeFiguras();
         CalcularAreasdeFiguras f3 = new CalcularAreasdeFiguras();
         CalcularAreasdeFiguras f4 = new CalcularAreasdeFiguras();
         CalcularAreasdeFiguras f5 = new CalcularAreasdeFiguras();
        System.out.println("Circulo: "+ f1.area(1.3));
		System.out.println("Rectangulo: "+ f2.area(2.3,3));
		System.out.println("Triangulo Rectangulo: " +f3.area(2,10.3) );
		System.out.println("Trapecio: "+ f4.area(2,3));
		System.out.println("Hexagono: "+ f5.area(2.33,1.55));
        
     }
}
