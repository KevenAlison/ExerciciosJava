package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		System.out.println("Entre com o numero de produtos");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Dados do produto "+ i );
			System.out.print("Comum, usado ou importado??(c/u/i): " );
			char tipo  = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Pre�o: ");
			double pre�o = sc.nextDouble();
			if(tipo ==  'c') {
				System.out.println("Taxa adicional:");
				double additionalCharge = sc.nextDouble();
				Product prod = new Product(name, pre�o);
				list.add(prod);
			}else if(tipo ==  'u'){
				System.out.println("Dat de fabrica��o:");
				Date data = sdf.parse(sc.next());
				Product prod = new UsedProduct(name, pre�o, data);
				list.add(prod);
			}else if(tipo ==  'i') {
				System.out.println("Taxa de Importa��o:");
				double taxa = sc.nextDouble();
				Product prod = new ImportedProduct(name, pre�o, taxa);
				list.add(prod);
			}
		}
		System.out.println();
		System.out.println("Produtos:");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
	}

}
