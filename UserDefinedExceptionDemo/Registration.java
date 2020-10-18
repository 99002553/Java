package UserDefinedExceptionDemo;

import java.util.Scanner;

import Exception.NameExistsException;
import Exception.TooLongException;
import Exception.TooShortException;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validator validator=new Validator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc.next();
		try {
			boolean valid=validator.ValidateName(username);
			if(valid)
			{
				System.out.println("Welcome "+username);
				System.out.println("Enter password");
				String password=sc.next();
				if(validator.ValidatePassword(password))
				{
					System.out.println("You are registered sucessfully");
				}
				
			}
		} catch (NameExistsException e) {
			// TODO Auto-generated catch block
				System.out.println("Name already Exists");
		}
		catch (TooLongException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (TooShortException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	//sc.close();	
}
