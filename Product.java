package Task2;
//1.2 Question
public class Product {
	long pid;
	double price;
	int quantity;
	public Product(long pid,double price,int quantity) {//Product class constructor
		this.pid = pid; //this is used to refer the global variable of this class
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price; //to get price amount
	}
	
	public long getPid() {
		return pid; //to get product id
	}
	
	public int getQuantity() {
		return quantity; //to get quantity
	}
}
