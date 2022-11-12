package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("pta");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("noorul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("hassan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("noor");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("learning");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("noorulhassan.rgcet@gmail.com");
		
		WebElement findElement2= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown= new Select(findElement2);
		dropdown.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println("this title is:"+driver .getTitle());
		
		

	}

}
