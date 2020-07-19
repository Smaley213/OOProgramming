package by.htp.less.oop2;

public class Payment {

	private String name;
	private int total;
	private Product[] product;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Product[] getProduct() {
		return product;
	}

	public void setProduct(Product[] product) {
		this.product = product;
	}

	public class Product{
		
		private String name;
		private int price;
		
		public Product() {
			
		}
		
		public Product(String name, int price) {
			
			this.name = name;
			this.price = price;
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
	}
	
	public Payment() {
		
	}

	public Payment(String name) {
		super();
		this.name = name;
	}

}
