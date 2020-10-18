package UserDefinedExceptionDemo;

import Exception.NameExistsException;
import Exception.TooLongException;
import Exception.TooShortException;

public class Validator {
	private String[] names= {"Sahana","Vishnu","nipun","ram","marie"};
	public boolean ValidateName(String username) throws NameExistsException
	{
		for(String uname:names)
		{
			if(uname.equals(username))
			{
				throw new NameExistsException();
			}
		}
		return true;
	}
	public boolean ValidatePassword(String password) throws TooLongException,TooShortException
	
	{
		if(password.length()>15)
		{
			throw new TooLongException("Password is too long");
		}
		if(password.length()<5)
		{
			throw new TooShortException("Password is too short");
		}
		return true;
	}
}
