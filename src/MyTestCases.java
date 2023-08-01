import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends Parameters {

	String AlreadyGeneratedPassword;
	Random rand = new Random();

	String[] URLS = { "https://magento.softwaretestingboard.com/radiant-tee.html",
			"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
			"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
			"https://magento.softwaretestingboard.com/hero-hoodie.html",
			"https://magento.softwaretestingboard.com/fusion-backpack.html" };

	@BeforeTest
	public void myBeforeTest() {

		driver.get(HomePage);

	}

//	@Test(priority = 1)
//	public void SIGNUP() {
//		driver.get(SignUpPage);
//		// setup for the sign up process
//		WebElement FirstNameField = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
//		WebElement LastNameField = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
//		WebElement EmailField = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
////		PasswordGenerator myObject = new PasswordGenerator();
////		String Password = myObject.generatePassword();
//		WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//		WebElement PasswordFieldConfirm = driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
//		WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
////		AlreadyGeneratedPassword = Password;
//
//		// steps to sign up
//		FirstNameField.sendKeys(FirstName);
//		LastNameField.sendKeys(LastName);
//		EmailField.sendKeys(Email_adress);
//		PasswordField.sendKeys(PasswordNew);
//		PasswordFieldConfirm.sendKeys(PasswordNew);
//		CreateAccountButton.click();
//
//	}

	@Test(priority = 1)
	public void SignIn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://magento.softwaretestingboard.com/customer/account/logout/");

		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");

		WebElement EmailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));

		WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"pass\"]"));

		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
// steps to login 
		PasswordField.sendKeys(PasswordNew);
		EmailField.sendKeys(Email_adress);
		LoginButton.click();
	}

//	@Test(priority = 2)
//	public void RandomlySelectitemFunction() {
//		WebElement SearchBarForITems = driver.findElement(By.xpath("//*[@id=\"search\"]"));
//		String[] myItems = { "Jacket", "t-shirt", "jeans for men", "jeans for women", "pants" };
//		int RandomItemNumber = rand.nextInt(0, myItems.length);
//
//		SearchBarForITems.sendKeys(myItems[RandomItemNumber] + Keys.ARROW_DOWN + Keys.ENTER);
//		System.out.println(myItems[RandomItemNumber]);
//
//	}

	@Test(priority = 2)
	public void OurFirstOrder() {

		for (int i = 0; i < URLS.length; i++) {
			driver.get(URLS[i]);

			if (driver.getCurrentUrl().contains("tee")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("3");
			} else if (driver.getCurrentUrl().contains("easy")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("2");
			} else if (driver.getCurrentUrl().contains("weather")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("4");
			} else if (driver.getCurrentUrl().contains("hoodie")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("1");
			} else if (driver.getCurrentUrl().contains("fusion")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("5");
			}
		}

	}

	@AfterTest
	public void AfterMyTestDone() {
	}

}