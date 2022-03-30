package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("Quantos alunos no curso A?");
		int ca = sc.nextInt();
		for(int i=1;i<=ca;i++) {
			System.out.println("ID do aluno "+ i);
			int id = sc.nextInt();
			a.add(id);
		}
		System.out.println("Quantos alunos no curso B?");
		int cb = sc.nextInt();
		for(int i=1;i<=cb;i++) {
			System.out.println("ID do aluno "+ i);
			int id = sc.nextInt();
			b.add(id);
		}
		System.out.println("Quantos alunos no curso C?");
		int cc = sc.nextInt();
		for(int i=1;i<=cc;i++) {
			System.out.println("ID do aluno "+ i);
			int id = sc.nextInt();
			a.add(id);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());
		sc.close();
		
	}

}
