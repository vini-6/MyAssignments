package week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
	}

}
