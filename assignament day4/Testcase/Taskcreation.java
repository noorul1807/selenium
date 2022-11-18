package Testcase;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskcreation {



	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Launch the driver
		ChromeDriver driver = new ChromeDriver();
		//Launch the url
		driver.get("https://login.salesforce.com");
		//Maximize the window
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//UserName
		driver.findElement(By.xpath("//div[@id = 'username_container']/input")).sendKeys("hari.radhakrishnan@qeagle.com");
		//Password
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		//Login Button
		driver.findElement(By.id("Login")).click();
		//svg Icon(Right Corner '+' button)
		WebElement icon = driver.findElement(By.xpath("//span[@id = 'tt-for-7:2001;a']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", icon);
		//Click New Task
		driver.findElement(By.xpath("//span[text() = 'New Task']")).click();
		//Enter Bootcamp in Subject Field
		WebElement subjectname = driver.findElement(By.xpath("//input[@id = 'combobox-input-105']"));
		subjectname.sendKeys("Bootcamp");
		String name1 = subjectname.getAttribute("value");
		//Click subject field
		driver.findElement(By.xpath("//a[text() = 'Not Started']")).click();
		//Click 'Waiting on Someone else'
		driver.findElement(By.xpath("//a[@title = 'Waiting on someone else']")).click();
		//Click 'Save' button
		driver.findElement(By.xpath("//div[@class = 'bottomBarRight slds-col--bump-left']/button")).click();
		if(name1.contains("Bootcamp")) {
			System.out.println("Task 'Bootcamp' is Created");
		}else {
			System.out.println("Task Not Created");
		}
		

	}



	}

