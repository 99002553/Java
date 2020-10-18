package SortUsingComparator;

import java.util.ArrayList;
import java.util.Collections;

import SortingArraylistObjcs.Employee;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create few employee objects
		Employee employee1=new Employee("Ram","Mumbai",125);
		Employee employee2=new Employee("Aish ","Bangalore",123);
		Employee employee3=new Employee("Pandu","Delhi",124);
		//add them to the arraylist
		ArrayList<Employee> employeelist=new ArrayList<>();
		employeelist.add(employee1);
		employeelist.add(employee2);
		employeelist.add(employee3);
		employeelist.add(new Employee("Scott","ooty",256));
		//print them first
		for(Employee employ:employeelist)
		{
			System.out.println(employ);
		}
		//call the sort method
		Collections.sort(employeelist,new NameSort());
		System.out.println("Sorted by name");
		for(Employee employ:employeelist)
		{
			System.out.println(employ);
		}
		Collections.sort
		namesort new =new 
	}

}
