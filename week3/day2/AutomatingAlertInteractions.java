package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement alert1 = driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button"));
		alert1.click();
		Alert alert2 = driver.switchTo().alert();
		String popup = alert2.getText();
		System.out.println(popup);
		alert2.sendKeys("Testing the alert");
		alert2.dismiss();

		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		driver.quit();

		// dismiss,accept,getText senkeys

	}

}
