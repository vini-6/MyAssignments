package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// webdriver method .sendKeys(): TO enter the value
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		Thread.sleep(7000);
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		// webdriver methods .click():
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();

		System.out.println("The tile is " + title);

		driver.findElement(By.linkText("Find your account and log in.")).click();
		String title1 = driver.getTitle();

		System.out.println("The tile is " + title1);

		Thread.sleep(7000);

		// to print the current window title : .getTitle()
		String title2 = driver.getTitle();
		System.out.println("The tile is " + title2);
		driver.close();
	}

}
