package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
Set<String> windowHandles=driver.getWindowHandles();
System.out.println(windowHandles);
List<String> wind= new ArrayList<String>(windowHandles);
driver.switchTo().window(wind.get(1));
System.out.println(driver.getTitle());
driver.switchTo().window(wind.get(0));
System.out.println(driver.getTitle());
driver.close();

	}

}
