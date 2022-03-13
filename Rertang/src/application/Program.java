package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.print("Informe  a  altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Informe  a  largura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Area do retangulo = " + retangulo.areaRet());
		System.out.println("Perimetro do retangulo = " + retangulo.perimetroRet());
		System.out.println("Diagonal do retangulo = " + retangulo.diagonalRet());
		
		
	sc.close();
	}

}
