package by.htp.less.oop2;

import by.htp.less.oop2.Payment.Product;

public class View {

public void printCheque(Payment pay) {
		
		System.out.println(pay.getName());
		for(Product c : pay.getProduct()) {
			
			System.out.println(c.getName());
			
		}
		System.out.println("Общая стоимость покупки " + pay.getTotal());
		
	}

}
