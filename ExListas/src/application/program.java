package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class program {
	public  static void main(String[] args) {
		
		List<String> list = new ArrayList<>() ;
		
		list.add("Keven");
		list.add("Dudss");
		list.add("Nixoi");
		list.add("Erica");
		list.add(2, "Segundo");
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		list.remove(0);
		list.removeIf(x -> x.charAt(0) == 'N');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("Posição da Dudss: " + list.indexOf("Dudss"));
		
		System.out.println("------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse("Não tem ningueem con essa inicial");
		System.out.println(name);
	}
}
