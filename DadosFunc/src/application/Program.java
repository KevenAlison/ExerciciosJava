package application;
import java.util.Scanner;
import entities.Funcionario;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário bruto do funcionário: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Imposto pago pelo funcionário: ");
		funcionario.taxa = sc.nextDouble();
		 
		System.out.println("Funcionario: " + funcionario.nome + ", $" +funcionario.salarioLiquido());
		System.out.print("Informe a porcentagem de aumento no salário do fincionário: ");
		double aumento = sc.nextDouble();
		
		System.out.println("Informações atualizadas: ");
		System.out.println("Funcionario: " + funcionario.nome + ", $" +funcionario.incrementoSalario(aumento));
		sc.close();
	}

}
