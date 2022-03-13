package entities;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double areaRet() {
		return altura*largura;
	}
	public double perimetroRet() {
		return (altura*2)+ (largura*2);
	}
	public double diagonalRet() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
}
