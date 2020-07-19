package by.htp.less.oop2;

import java.util.Scanner;
import by.htp.less.oop2.Payment.Product;

public class Logic {

public Payment setPayment(Payment pay) {
		
		Scanner br = new Scanner(System.in);
		
		System.out.println("Введите количество продуктов");
		
		int dim = br.nextInt(); 
		
		Product[] product = new Product[dim];
		
		for(int i = 0; i < dim; i++){

			System.out.println("Товар " + (i+1) + ": "); 
			System.out.print("Наименование: ");
			String str_name = br.next(); 
			System.out.print("Цена: "); 
			int prod_cost = br.nextInt();

			product[i] = pay.new Product(str_name, prod_cost); 
			pay.setTotal(pay.getTotal() + product[i].getPrice());

		}
		
		pay.setProduct(product);
		
		return pay;
	}

}
