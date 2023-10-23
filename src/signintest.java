import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signintest {

	WebDriver driver = new ChromeDriver();
	Random Rand= new Random();
	String URL = "https://magento.softwaretestingboard.com/";
	String FirstName="standard";
	String LastName="user";
	String Email ="standard";
	String Password="User@123";
	String Domain="@gmail.com";
	
	@BeforeTest
	public void MyBeforeTest() {

		int myNewIDForTheEmail = Rand.nextInt(10000);
		driver.get(URL);
		driver.findElement(By.linkText("Create an Account")).click();
		WebElement FirstNameField = driver.findElement(By.id("firstname"));
		WebElement LastNameField = driver.findElement(By.id("lastname"));
		 WebElement EmailField = driver.findElement(By.id("email_address"));
		 WebElement PasswordField = driver.findElement(By.id("password"));
		 WebElement passwordconfirmationField = driver.findElement(By.id("password-confirmation"));
		
		FirstNameField.sendKeys(FirstName);
		LastNameField.sendKeys(LastName);
		EmailField.sendKeys(Email+myNewIDForTheEmail+Domain);
		PasswordField.sendKeys(Password);
		passwordconfirmationField.sendKeys(Password);
		
		driver.findElement(By.className("primary")).click();
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("email")).sendKeys(Email);
//		driver.findElement(By.id("pass")).sendKeys(Password);
//		driver.findElement(By.linkText("send2")).click();

	}

	@Test()
	public void MyTest() {
	}

	@AfterTest
	public void MyAfterTest() {
	}
}
