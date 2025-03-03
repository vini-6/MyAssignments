package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		// Input of accountName==//input[@id='accountName']
		driver.findElement(By.id("accountName")).sendKeys("Anamica");
		// Enter a description as "Selenium Automation
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		// Input of Industry

		WebElement ind = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select ind1 = new Select(ind);
		ind1.selectByValue("IND_SOFTWARE");

		// Input of ownership
		WebElement own = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own1 = new Select(own);
		own1.selectByVisibleText("S-Corporation");

		// Input of source
		WebElement src = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select src1 = new Select(src);
		src1.selectByValue("LEAD_EMPLOYEE");

		// Input of Marketing Campaign
		WebElement mkt = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select mkt1 = new Select(mkt);
		mkt1.selectByIndex(7);

		// state/province --Texas
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state1 = new Select(state);
		state1.selectByValue("TX");

		//// Click the "Create Account" button.

		driver.findElement(By.xpath("//input[@value='Create Account']")).click();

		// Checking for the accountName==//span[contains(text(),'asafas')]
		WebElement myAccountName = driver.findElement(By.xpath("//span[contains(text(),'Anamica')]"));
		String myAccountName1 = myAccountName.getText();

		if (myAccountName1.contains("Anamica")) {
			System.out.println("The Account Name is correct");

		} else {

			System.out.println("The Account Name is not correct");
		}
		driver.close();
	}

}
