import java.util.ArrayList;

public class LogRegCheck {

	/*
	 * Instructions:
	 * 		if (LogRegCheck.checkExistingRegistry == null)
	 * 			Initialize users list first.
	 * 		else if ( (boolean) LogRegCheck.checkExistingRegistry == true )
	 * 			User already exists.
	 * 		else
	 * 			User does not exist.
	 */
	public static Object checkUsername(String aUsername) {
		
		//We need a initializedList variable in Central Registry
		if ( CentralRegistry.initializedList )
			return null;
		
		if ( CentralRegistry.getUsers.contains(aUsername) )
			return true;
		return false;
	}
	
	
	public static boolean checkPassword(Student aStudent, String aPassword) {
		
		if( aStudent.getPassword().equals(aPassword) ) {
			return true;
		}
		return false;	
	}
}
