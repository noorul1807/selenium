package Testcase;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Ownership {


public static void main(String[] args) throws InterruptedException {
				//set the ChromeDriver
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				//Launch the Browser
				ChromeDriver driver = new ChromeDriver();
				//Launch the url
				driver.get("https://login.salesforce.com");
				//Window maximize
				driver.manage().window().maximize();
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//UserName
				driver.findElement(By.xpath("//div[@id = 'username_container']/input")).sendKeys("hari.radhakrishnan@qeagle.com");
				//Password
				driver.findElement(By.id("password")).sendKeys("Testleaf$321");
				//Login Button
				driver.findElement(By.id("Login")).click();
				//Toggle Menu Button
				driver.findElement(By.className("slds-icon-waffle")).click();
				//View All
				driver.findElement(By.xpath("//button[@class = 'slds-button']")).click();
				//Click Sales
				driver.findElement(By.xpath("//p[text() = 'Sales']")).click();
				//Click Accounts Tab
				WebElement accountname = driver.findElement(By.xpath("//span[text() = 'Accounts']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()",accountname);
				//New Button
				driver.findElement(By.xpath("//a[@class = 'forceActionLink']")).click();
				//AccountName Field
				WebElement accountname1 = driver.findElement(By.xpath("//div[@class = 'slds-form-element__control slds-grow']/input"));
				accountname1.sendKeys("Noorul");
				String name = accountname1.getAttribute("value");
				//Ownership Field
				WebElement ownership = driver.findElement(By.xpath("//div[@class = 'slds-input__icon-group slds-input__icon-group_right']"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click()",ownership);
				//driver.findElement(By.xpath("//span[text() = 'Public']")).click();
			    Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@name = 'SaveEdit']")).click();
				if(name.contains("Hema")) {
					System.out.println("AccountName is Created");
				}else {
					System.out.println("TestCase is Failed");
				}
				
			}


	}

