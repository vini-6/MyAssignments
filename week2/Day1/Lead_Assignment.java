package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		// webdriver method .sendKeys(): TO enter the value
		driver.findElement(By.id("username")).sendKeys("democsr");
		Thread.sleep(7000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		// going into CRM page
		System.out.println("The tile is " + title);
		driver.findElement(By.partialLinkText("CRM")).click();

		// going into lEAD TAG page
		driver.findElement(By.linkText("Leads")).click();

		// going into Create Lead TAG page
		driver.findElement(By.linkText("Create Lead")).click();
		// Filling the Company name box
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("My Company");

		// Filling the First name box
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anamica");

		// Filling the last name box
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ribeca");

		// Filling the Title name box
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title Card");

		// Clicking the submit button
		driver.findElement(By.name("submitButton")).click();

		// Checking for the title
		WebElement myTitle= driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']"));
		
		String myTitleHere= myTitle.getText();
		System.out.println("The tile is 4 " + myTitleHere);

		driver.close();
	}

}
