package Task2;
import java.util.Scanner;

//1.2 Question
public class ProductMain {

	public static void main(String[] args) {
		long pid;
		double price;
		int quantity;
		
		Scanner get = new Scanner(System.in);
		Product[] obj = new Product[5];  //object array created

		for(int i = 0;i < 5; i++) { // for getting 5 input from the user
			System.out.print("Enter Product ID: ");
			pid = get.nextLong();
			System.out.print("Enter Product Price: ");
			price = get.nextDouble();
			System.out.print("Enter Product Quantity: ");
			quantity = get.nextInt();
			obj[i] = new Product(pid,price,quantity);
		}
		
		long result = heighestPrice(obj); //calling function to calculate highest price and return 
										  //product id
		long totalCost = totalCost(obj); // calling function calculate total cost for all product
		
		System.out.println("Heighest Price - Product Id is : " + result);
		
		System.out.println("Total Cost : " + totalCost);
	}
	
	public static long heighestPrice(Product[] obj) {//to calculate highest price and return product id
		double max = Double.MIN_VALUE;
		long result = 0;
		for(int i = 0 ;i < 5; i++) {
			if(obj[i].getPrice() > max){
				max = obj[i].getPrice();
				result = obj[i].getPid();
			}
		}
		return result;
	}
	
	public static long totalCost(Product[] obj) {//calculate total cost for all product
		
		long totalcost = 0;
		for(int i = 0; i < 5; i++) {
			totalcost = (long) (totalcost + (obj[i].getPrice() * obj[i].getQuantity()));
			//done type casting to long 
		}
		
		
		return totalcost;
	}

}
