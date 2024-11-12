package Capgemini_Organization.Training;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * Rigorous Test :-)

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
	 */
	/*public static void main(String args[]) {
		App app=new App();
		String email=app.email("abc@gmail.com");
		System.out.println(email);
		int pwd=app.password(5678);
		System.out.println(pwd);
		String login=app.login("Login successfull");
		System.out.println(login);

	}*/
	public static void main(String args[]) {
		App app=new App();
		String regex="^(.+)@(.+)$";
		String email=app.email("abc@gmail.com");
		Pattern pattern=Pattern.compile(regex);

		Matcher match=pattern.matcher(email);
		System.out.println("IS it match::"+match.matches());

		System.out.println(email);

		
		
		//app.login("");
        
		 String regexPassword = "^\\d+$";
	        String pwd = String.valueOf(app.password(46789));  
	        
	        Pattern pattern1 = Pattern.compile(regexPassword);
	        Matcher passwordMatch = pattern1.matcher(pwd);
	        
	        System.out.println("Is the password valid: " + passwordMatch.matches());
	        System.out.println(pwd);

	}


}
