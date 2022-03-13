package entities;

public class Conta {
	private String name;
	private int accNumber;
	private double balance;

	public Conta(String name, int accNumber) {
		this.name = name;
		this.accNumber = accNumber;
	}
	
	public Conta(String name, int accNumber, double initialDeposite) {
		this.name = name;
		this.accNumber = accNumber;
		depositeValue(initialDeposite);
	}

	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void depositeValue(double deposite) {
		balance += deposite;
	}

	public void withdrawValue(double withdrawn) {
		balance -= (withdrawn + 5);
	}
	
	public String toString() {
		return "Conta " + accNumber + ", Proprietário: " + name + ", Saldo: " + String.format("%.2f", balance);
	}

}