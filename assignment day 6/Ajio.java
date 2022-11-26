package week3.day1;
import java.time.Duration;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

		// TODO Auto-generated constructor stub
public class Ajio {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓
	

		
				WebDriverManager.chromedriver().setup();
				// Step 2: Instantaite the ChromeDriver
				ChromeDriver driver = new ChromeDriver();
				// Loads a new web page in the current browser window
				// Maximise the screen
				driver.get("https://www.ajio.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//In the search box, type as "bags" and press enter
				
				driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
				//driver.findElement(By.id("Men")).click();
				Thread.sleep(2000);
				// To the left  of the screen under " Gender" click the "Men"
				driver.findElement(By.xpath("//label[@for='Men']")).click();
				
				//Under "Category" click "Fashion Bags"
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				Thread.sleep(2000);
				String text = driver.findElement(By.xpath("//div[@class=\"filter\"]/div[@class=\"length\"]")).getText();
				String[] splitt = text.split("\\d+");
				String string = splitt.toString();
				System.out.println(text);

				List<WebElement> brandList = driver.findElements(By.className("brand"));
				List<WebElement> nameList = driver.findElements(By.className("nameCls"));

				System.out.println("------------Brand LIST--------------");
				for (int i = 0; i < brandList.size(); i++) {
					System.out.println(brandList.get(i).getText());

				}
				System.out.println("---------Name LIST---------");
				for (int i = 0; i < nameList.size(); i++) {
					System.out.println(nameList.get(i).getText());

				}

				driver.close();
			}

		}
		