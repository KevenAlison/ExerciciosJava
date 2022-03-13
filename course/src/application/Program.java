package application;
import java.util.Scanner;
import entities.Triangulo;


public class Program {
	
	public static void main(String[] args) {
		double p1, p2, a1, a2;	
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com os valores do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os valores do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		a1 = x.area();
		a2 = y.area();
		
		System.out.println("Area do triangulo 1 = " + a1);
		System.out.println("Area do triangulo 2 = " + a2);
		
		if(a1 > a2) {
			System.out.println("Area do triangulo 1 eh maior");
		} else {
			System.out.println("Area do triangulo 2 eh maior");
		}
	}
}
