import com.exceptions.nameExistsException;
import com.exceptions.tooLongPasswordException;
import com.exceptions.tooShortPasswordException;

public class Validator {
	String[] names={"Shilpa","Sahana","Pooja","Aruna"};
public boolean validateName(String username) throws nameExistsException{
	for(String name:names)
	if(username.equals(name))
		throw new nameExistsException();
	return true;
}
public boolean validatepassword(String userpwd) throws tooLongPasswordException,tooShortPasswordException{
	if(userpwd.length()>=15)
		throw new tooLongPasswordException("password is too lengthy");
	if(userpwd.length()<=5)
		throw new tooShortPasswordException("password is too short");
	return true;
}

}
