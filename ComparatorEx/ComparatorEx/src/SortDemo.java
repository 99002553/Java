import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	public static void main(String[] args){
		Employee emp1=new Employee("Shilpa","Ballari",101);
		Employee emp2=new Employee("Sahana","Bangalore",102);
		Employee emp3=new Employee("Pooja","Mysore",103);
		Employee emp4=new Employee("Aruna","Mumbai",104);
		ArrayList<Employee> employeeList=new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		System.out.println("Array list before sorting:");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		Collections.sort(employeeList, new NameSort());
		System.out.println("After sorting by name:");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		Collections.sort(employeeList,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getCity().compareTo(e2.getCity());
			}
		});
		System.out.println("After sorting by city:");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		Collections.sort(employeeList,(e1,e2)->{
			return e1.getId().compareTo(e2.getId());
		});
		System.out.println("After sorting by Id:");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
