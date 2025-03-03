package week2.Day3.RadioButon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton  {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		// webdriver method .sendKeys(): TO enter the value
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		Thread.sleep(7000);
		
		////div[@class='ui-helper-hidden-accessible']
	}
}

