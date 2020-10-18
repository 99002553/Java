//sort the objects added to an array list using comparable
package SortingArraylistObjcs;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
	//create employee objects 
		Employee employee1=new Employee("Ram","Mumbai",125);
		Employee employee2=new Employee("Aish ","Bangalore",123);
		Employee employee3=new Employee("Pandu","Delhi",124);
		
		
	//add them to array list
		ArrayList<Employee> employeeList=new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		for(Employee employ :employeeList)
		{
			System.out.println(employ);
		}
		
	//call sort method
		Collections.sort(employeeList);
		for(Employee employ :employeeList)
		{
			System.out.println(employ);
		}

	}

}
