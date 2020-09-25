import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    System.out.print("Please create a password.\n");
	    String password = in.nextLine();
	
	    if (Password_Validation(password) == true) {
	    System.out.println("Password Valid and Accepted.");
	    }
	    else {
	    	System.out.println("Error");
	    }
	  }


	public static boolean Password_Validation(String password) 
	{

	    if(password.length()>6 || password.length()<13)
	    {
	        Pattern Lletter = Pattern.compile("[a-z]");
	        Pattern Uletter = Pattern.compile("[A-Z]");
	        Pattern Xmark = Pattern.compile ("[!]");

	           Matcher hasLletter = Lletter.matcher(password);
	           Matcher hasUletter = Uletter.matcher(password);
	           Matcher hasXmark = Xmark.matcher(password);

	           return hasLletter.find() && hasUletter.find() && hasXmark.find();

	    }
	    else {
	        return false;
	        }

	}
}
