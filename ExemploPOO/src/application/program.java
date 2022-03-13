package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;
		
		System.out.println("Digite o numero da conta: ");
	  	int  accNumber = sc.nextInt();
	  	System.out.println("Digite o seu nome: ");
	  	sc.nextLine();
	  	String  name = sc.nextLine();
	  	System.out.println("Entrar com deposito inicial? (y/n): ");
	  	
	  	char resposta = sc.next().charAt(0);
	  	if(resposta == 'y') {
	  		System.out.println("Entre com deposito inicial: ");
	  		double depositeInitial = sc.nextDouble();
	  		account = new Conta (name, accNumber, depositeInitial);
	  	} else {
	  		account = new Conta (name, accNumber);
	  	}
	  	
	  	System.out.println();
	  	System.out.println("Dados da Conta: ");
	  	System.out.println(account);
	  	
	  	System.out.println();
	  	System.out.println("Digite um valor de deposito: ");
	  	double deposite = sc.nextDouble();
	  	account.depositeValue(deposite);
	  	System.out.println("Dados da Conta atualizados: ");
	  	System.out.println(account);
	  	
	  	System.out.println();
	  	System.out.println("Digite um valor de retirada: ");
	  	double withdraw = sc.nextDouble();
	  	account.withdrawValue(withdraw);
	  	System.out.println("Dados da Conta atualizados: ");
	  	System.out.println(account);
	  	
	  	
	  	
	  	
		sc.close();
	}

}
