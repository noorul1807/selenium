package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/main");
		driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("psa");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("noorul");
		driver.findElement(By.id("createLeadForm_last Name")).sendKeys("hassan");
		
		
		WebElement drop= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown= new Select(drop);
		dropdown.deselectByVisibleText("Conference");
		
		
		
	

	}

}
