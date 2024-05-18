package finalQaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver;	
	
	driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("lojain ayman"+Keys.RETURN);
    
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/input")).click();
	
	}

}
