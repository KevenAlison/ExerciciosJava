package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		System.out.println("Entre com o numero de funcionarios");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Dados do funcionario "+ i );
			System.out.print("Terceirisado?(s/n): " );
			char tcr  = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Horas: ");
			int hours = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			if(tcr ==  's') {
				System.out.println("Taxa adicional:");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		System.out.println();
		System.out.println("Pagamentos:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + "- R$" + emp.payment());
		}
		
		sc.close();
	}

}
