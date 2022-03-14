package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLvl;

public class Program {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Digite os dados do trabalhador: ");
		System.out.println("Nome: ");
		String workerName = sc.nextLine();
		System.out.println("Nível: ");
		String workerLvl = sc.nextLine();
		System.out.println("Salário base: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLvl.valueOf(workerLvl), baseSalary, new Department(departmentName));     
		System.out.println("Quantos contratos o trabalhador possui?: ");
		int numContracts = sc.nextInt();
		
		for(int i=0; i<numContracts; i++ ) {
			System.out.println("Entre com o contrato " + (i+1));
			System.out.println("Data (Dia//Mês/Ano): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valuePerHour= sc.nextDouble();
			System.out.println("Duração  (in horas): ");
			int duration= sc.nextInt();
			HourContract contract =new HourContract(contractDate, valuePerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.println("Entre com mês e ano para calcular o salario(mês/ano: ");
		String monthAndYear  =sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Ganhos em: "+ monthAndYear  +": "+ worker.income(year,month));
		
		sc.close();
	}

}
