package week4.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) {
	  WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		https://www.irctc.co.in/nget/train-search("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.switchTo().frame(1);
driver.findElement(By.xpath("//button[text()='Try it']")).click();
driver.switchTo().alert().sendKeys("noorul");
driver.switchTo().alert().accept();
String msg = driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
System.out.println(msg);
	}

}
