package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateFaceBookAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
        //Launch the browser
		 ChromeDriver driver=new ChromeDriver(); 
		
		//load the url
		driver.get("http://en-gb.facebook.com/");
      //maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		findElement.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("noor");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("aaysha");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("noorulhassan.rgcet@gmail.com");
		 driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("noorulhassan.rgcet@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Noorul@1992");
		 driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_day']/option[@value='24']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_month']/option[@value='7']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_year']/option[@value='1993']")).click();
		 driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		 driver.findElement(By.xpath("//input[@name='wesubmit']")).click();

	}

	private static void extracted(ChromeDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
