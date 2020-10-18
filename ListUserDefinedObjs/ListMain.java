//Adding User-defined objects to an arraylist
package ListUserDefinedObjs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import ListUserDefinedObjsBean.Employee;

public class ListMain 
{
	public static void main(String[] args)
	 {
		// TODO Auto-generated method stub
		List <Employee> employeeList=new ArrayList<Employee>();
		Employee employee1=new Employee("Sahana","Ballari",30000.0);
		employeeList.add(employee1);
		employeeList.add(new Employee("Sahana K","Bellary",33000.0));
		employeeList.add(new Employee("Shilpa","Kudthini",45000.0));
		employeeList.add(new Employee("Vishnu k","Bellary",50000.0));
		employeeList.add(new Employee("Pooja K","Bellary",40000.0));
		
		
		//System.out.println(employeeList);//here we will get the output in a single line to get it in a new line we can go for an iterator or foreach
		Iterator<Employee> it=employeeList.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp);
			}
		System.out.println("Using For Each");
		for(Employee employ:employeeList)
			System.out.println(employ);
		
		System.out.println("To print in reverse manner");
		ListIterator<Employee> listit=		
				employeeList.listIterator(employeeList.size());
		while (listit.hasPrevious()) {
			Employee employee = listit.previous();
			System.out.println(employee);
			
		}

	 }
}