package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidato;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		Map<String, Integer> votacao = new LinkedHashMap<>();
		
		System.out.print("Entre com o arquivo: ");
		String path = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votos = Integer.parseInt(fields[1]);
				if(votacao.containsKey(name)) {
					int aux = votacao.get(name);
					votacao.put(name, votos + aux);
				}else {
					votacao.put(name, votos);
				}
				line = br.readLine();
			}
			for (String key : votacao.keySet()) {
				System.out.println(key + ": " + votacao.get(key));
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
		
	}

}
