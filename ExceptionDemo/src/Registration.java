import java.util.Scanner;

import com.exceptions.nameExistsException;
import com.exceptions.tooLongPasswordException;
import com.exceptions.tooShortPasswordException;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validator validator=new Validator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Username");
		String name=sc.next();
		
			try {
				boolean valid=validator.validateName(name);
				if(valid)
				{
					System.out.println("Welcome "+name);
					System.out.println("Enter the password");
					String password=sc.next();
					if(validator.validatepassword(password)){
					System.out.println("User registered successfully");	
					}
						
				}
			} 
			catch (nameExistsException e) {
				System.out.println("Name already exists");
			} 
			catch (tooLongPasswordException e) {
				System.out.println(e.getMessage());
			} 
			catch (tooShortPasswordException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
