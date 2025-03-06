package Task2;

// 1.1 Question
public class Person {
	private int age = 18; // a.properties of Person (age)
	private String name ; // a.properties of Person (name)
	
	public Person(int age , String name) {
		this.age = age; //this. is used for pointing the variable as a global variable
		this.name = name;
	}
	
	public void display() { //c.method to display name and age
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person(23,"Sudhir"); //b.object initialized with age and name
		obj.display();
		
	}

}
