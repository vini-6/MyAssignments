package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		Thread.sleep(7000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		// going into CRM page
		System.out.println("The tile is " + title);
		driver.findElement(By.partialLinkText("CRM")).click();
		// going into Accounts TAG page
		driver.findElement(By.linkText("Accounts")).click();
		// going into Create Account option
		driver.findElement(By.linkText("Create Account")).click();
		// Input of accountName
		driver.findElement(By.id("accountName")).sendKeys("Anamica");
		// Enter a description as "Selenium Automation
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

//		Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("5");

//		- Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

//		- Click the "Create Account" button.

		driver.findElement(By.xpath("//input[@value='Create Account']")).click();

//		- Verify that the Title is displayed correctly.
		String title2 = driver.getTitle();

		if (title2.equals("Create Account | opentaps CRM")) {
			System.out.println("The tile is shows correctly");

		} else {
			System.out.println("The tile is not correct");
		}

		driver.close();
	}

}
