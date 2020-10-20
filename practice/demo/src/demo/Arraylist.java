package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import demo.example.employee;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<employee> empList=new ArrayList<>();
		empList.add(new employee("Sahana K","Ballari",30000));
		empList.add(new employee("Seetha","Bangalore",33000));
		empList.add(new employee("scott","Mysore",28000));
		Iterator<employee> it=empList.iterator();
		System.out.println("using iterator");
		while(it.hasNext())
		{
			employee emp=it.next();
			System.out.println(emp);
		}
		System.out.println("using for each");
		for(employee e:empList)
			System.out.println(e);
		System.out.println("using list iterator");
		ListIterator<employee> lit=empList.listIterator(empList.size());
		while(lit.hasPrevious())
		{
			employee emp=lit.previous();
			System.out.println(emp);
		}
		
	}

}
