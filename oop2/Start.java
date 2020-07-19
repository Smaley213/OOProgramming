package by.htp.less.oop2;

public class Start {

	public static void main(String [] args) {
		Logic logic = new Logic();
		View view = new View();
		
		Payment pay1 = new Payment("Первая покупка"); 
		Payment pay2 = new Payment("Вторая покупка"); 
	
		logic.setPayment(pay1);
		logic.setPayment(pay2);
		
		view.printCheque(pay1);
		view.printCheque(pay2);
	}

}
