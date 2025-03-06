package Task2;

public class Personemp {
	String name;
	int age;
	
	public Personemp(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Employee obj = new Employee("sudhir",23,001,100000); //object created for child class(Employee)
		System.out.println("Employee ID :"+obj.employeID);
		System.out.println("Name        :"+obj.name);
		System.out.println("Age         :"+obj.age);
		System.out.println("Salary      :"+obj.salary);
	}
}
 
class Employee extends Personemp{
	long employeID;
	double salary;
	
	public Employee(String name,int age,long employeId , double salary) {
		super(name,age); //super reference variable used to refer parent class variables(name,age)
		this.employeID = employeId;
		this.salary = salary;
	}
}
