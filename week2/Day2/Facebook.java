package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
//Click on the Create new account button.
//		//text()=Create new account'/a[@role='button']
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//// - Enter the First name.
//		//div[text()='First name']//following-sibling::input
		driver.findElement(By.xpath("//div[text()='First name']//following-sibling::input")).sendKeys("Anamica");
		System.out.println("1");
////		- Enter the Surname. 
//		//div[text()='Surname']//following-sibling::input
		driver.findElement(By.xpath("//div[text()='Surname']//following-sibling::input")).sendKeys("Rebeca");
		Thread.sleep(7000);
////		- Enter the Mobile number or email address. 
//		//input[@id='u_0_h_pE']
		System.out.println("2");
		
//		---" org.openqa.selenium.NoSuchElementException:
		driver.findElement(By.id("u_0_h_pE")).sendKeys("9435641556");
		System.out.println("3");
////		- Enter the New password. 
//		//input[@id='password_step_input']
		driver.findElement(By.id("password_step_input")).sendKeys("@Facebook2");
		System.out.println("3");

////		- Handle all three dropdowns in Date of birth 
//		//select[@id='day']====//select[@id='day']//child::option[@value='20']
		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByValue("20");
		System.out.println("4");

		//// select[@id='month']===//select[@id='month']//child::option[@value='2']
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByValue("2");
		System.out.println("4");

		// select[@id='year']==//select[@id='year']//child::option[@value='2002']
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByValue("2");
		System.out.println("5");

////		- Select the radio button in Gender.
//		//label[text()='Female']/input[@id='sex']
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']/input[@id='sex']"));
		Select gender1 = new Select(gender);
		gender1.selectByVisibleText("Female");
		System.out.println("5");

		driver.close();
	}

}
