package garena;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Garenamax3 {
 public static void main(String[] args) throws InterruptedException {
	 
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://instagram.com");
	Thread.sleep(5000);
	driver.navigate().to("https://vidalhealth.com");
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().to("https://hcl.com");
	driver.navigate().back();
	driver.quit();  
	
	
	
}
}
