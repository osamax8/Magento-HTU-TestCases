import java.security.SecureRandom;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	
	WebDriver driver = new ChromeDriver(); 
	
	String HomePage = "https://magento.softwaretestingboard.com/"; 
	
	String SignUpPage = "https://magento.softwaretestingboard.com/customer/account/create/";
	
	String FirstName = "HTU" ;
	String LastName = "Students" ;
	String Email_adress = "HTU1234@gmail.com"; 
	String PasswordNew = "KIkiNINI123123"; 
	
	
	
	
	
	public class PasswordGenerator {
	    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	    private static final String DIGIT = "0123456789";
	    private static final String SPECIAL_CHAR = "!@#$%^&*()_-+=<>?/{}|~";

	    private static final String PASSWORD_CHARS = CHAR_LOWER + CHAR_UPPER + DIGIT + SPECIAL_CHAR;
	    private static final int PASSWORD_LENGTH = 12;
	    int a = 10 ; 
	    public static String generatePassword() {
	        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
	        SecureRandom random = new SecureRandom();

	        for (int i = 0; i < PASSWORD_LENGTH; i++) {
	            int randomCharIndex = random.nextInt(PASSWORD_CHARS.length());
	            password.append(PASSWORD_CHARS.charAt(randomCharIndex));
	        }

	        return password.toString();
	    }
	

	}

}