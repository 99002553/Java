package demo.example;

public class employee {
	private String name;
	private double salary;
	private String city;
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public employee(String name, String city,double salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	

}
