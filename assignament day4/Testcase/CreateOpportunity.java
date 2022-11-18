package Testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOpportunity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement opportunityElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", opportunityElement);
		
		driver.findElement(By.xpath("//a[@class='forceActionLink']/div")).click();
		WebElement inOpportunityName = driver.findElement(By.xpath("//input[@class='slds-input' and @name='Name']"));
		inOpportunityName.sendKeys("Salesforce Automation by Noorul");
		String inputOpportunityName = inOpportunityName.getAttribute("value");
		System.out.println("Opportunity Name entered is: "+" "+inputOpportunityName);
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='15']")).click();
		
		driver.findElement(By.xpath("//span[text()='--None--']/parent::button")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement outOpportunityName = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']/a"));
		String outputOpportunityName = outOpportunityName.getText();
		outputOpportunityName.replaceAll("^\"|\"$", "");
		System.out.println("Opportunity Name Saved and displayed is: "+" "+outputOpportunityName);
		
		if(outputOpportunityName.contains(inputOpportunityName)) {
			
			System.out.println("Test Case Passed. "+ " "+ "Opportunity Name Entered is: "+outputOpportunityName);
		}
		
			else {
				
				System.out.println("Test case Failed. Please check ");
			}
		}

	}


