package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLvl;

public class Worker {
	//atributos basicos
	private String name;
	private WorkerLvl level;
	private Double baseSalary;
	//associa��es
	private Department departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {

	}
	
	public Worker(String name, WorkerLvl level, Double baseSalary, Department departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLvl getLevel() {
		return level;
	}

	public void setLevel(WorkerLvl level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return departament;
	}

	public void setDepartment(Department departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year,  int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year ==  c_year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}