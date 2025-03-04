package week3.day2;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("123");
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 System.out.println("123");
		Alert w3alert=driver.switchTo().alert();
		System.out.println("123");
		w3alert.accept();
		System.out.println("123");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframeResult");
		String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text.equals("Hello Harry Potter! How are you today?")) {
			System.out.println("The system displays correctly");
			
		}else {System.out.println("The system is not showing correctly");}
		System.out.println("123");
		driver.quit();
		
				
		
	
	}
}
