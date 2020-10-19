
public class Employee {
	private String name;
	private Integer id;
	private String city;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String city,Integer id) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", Id=" + id + ", city=" + city + "]";
	}
	

}
