package entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double taxa;
	
	public double salarioLiquido() {
		return salario - taxa;
	}
	public double incrementoSalario(double porcentagem) {
		return salarioLiquido() + (salario/porcentagem);
	}

}
