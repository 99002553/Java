package com.ltts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ltts.autowiring.Rectangle;
import com.ltts.autowiring.ShapeFactory;
import com.ltts.autowiring.triangle;
import com.ltts.constr.Student;
import com.ltts.foodwiring.FoodPanda;
import com.ltts.setter.Employee;

@SpringBootApplication
public class TrialOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
	
	@Autowired
	ApplicationContext context;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//setter based dependency injection
		/*Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee);
		
		//constructor based dependency injection
		Student student=context.getBean(Student.class);
		System.out.println(student);*/
		//ShapeFactory shapeFactory=context.getBean(ShapeFactory.class);
		
		//shapeFactory.printArea(10,20);
		
		FoodPanda foodPanda=context.getBean(FoodPanda.class);
		List<String> list=foodPanda.showMenu("chinese");
		System.out.println("The Items are:");
		for(String str:list)
		
		{
			System.out.println(str);
		}
	}

}
