package application;
import java.util.Scanner;
import entities.Funcionario;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome do funcion�rio: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Sal�rio bruto do funcion�rio: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Imposto pago pelo funcion�rio: ");
		funcionario.taxa = sc.nextDouble();
		 
		System.out.println("Funcionario: " + funcionario.nome + ", $" +funcionario.salarioLiquido());
		System.out.print("Informe a porcentagem de aumento no sal�rio do fincion�rio: ");
		double aumento = sc.nextDouble();
		
		System.out.println("Informa��es atualizadas: ");
		System.out.println("Funcionario: " + funcionario.nome + ", $" +funcionario.incrementoSalario(aumento));
		sc.close();
	}

}
